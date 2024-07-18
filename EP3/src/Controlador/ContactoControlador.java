package Controlador;

import Modelo.Contacto;
import Modelo.Telefono;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class ContactoControlador {
    private List<Contacto> contactos;
    private int IdActual;
    private Conector c;

    public ContactoControlador() {
        this.contactos = new ArrayList<>();
        this.c = new Conector();
        c.JavaToMySQL();
        actualID();
        inicializarDatos();
    }

    private void inicializarDatos() {
        TableToList();
    }
    
    public void actualID(){
       int id = 100; 
        
        try {
            c.comando = c.conexion.createStatement();
            c.registro = c.comando.executeQuery("SELECT max(id) as max_id FROM contacto");
            if(c.registro.next())
                id = c.registro.getInt("max_id");
            //JOptionPane.showMessageDialog(null,"ID: "+ id);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Problemas con SQL. "+ ex.getMessage());
        } finally {
            this.IdActual = id+1;
        }
            
    }
    
    public void TableToList(){
        try {
            c.comando = c.conexion.createStatement();
            c.registro = c.comando.executeQuery("SELECT * FROM contacto");
            
            while (c.registro.next()) {
                Contacto contacto = new Contacto(
                        c.registro.getInt("id"),
                        c.registro.getString("nombre"),
                        c.registro.getString("apellido"),
                        c.registro.getString("email"),
                        c.registro.getString("foto")
                );
                
                contactos.add(contacto);
            }

            c.registro = c.comando.executeQuery("SELECT * FROM telefono");
            
            while (c.registro.next()) {
                Telefono telefono = new Telefono(
                        c.registro.getString("numero"),
                        c.registro.getString("compania")
                );
                
                Contacto contacto = buscarContactoPorID(c.registro.getInt("idcontacto"));
                contacto.getListaTel().add(telefono);
            }
        
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Problemas con SQL. "+ ex.getMessage());
        }
        
    }

    // Métodos para agregar, buscar, eliminar y modificar contactos
    public void agregarContacto(int id, String nombre, String apellido, String correo, String foto, String tel1, String tel2, String tel3, String com1, String com2, String com3) throws Exception {
        
        
        
        validarContacto(nombre, apellido, correo, tel1, tel2, tel3, com1, com2, com3);
        datoRepetido(correo, tel1, tel2, tel3, com1, com2, com3);

        
        if(foto.isEmpty()){
            foto = "./src/Imagenes/default.jpg";
        }
        
        Contacto nuevoContacto = new Contacto(id, nombre, apellido, correo, foto);
        
        
        TelefonoControlador telControlador = new TelefonoControlador();
        
        c.comando.executeUpdate("INSERT INTO contacto VALUES ("+id+",'"+nombre+"','"+apellido+"','"+correo+"','"+foto+"')");
        nuevoContacto.setListaTel(telControlador.crearListaTelefonos(tel1, tel2, tel3, com1, com2, com3, id, c));
        
        contactos.add(nuevoContacto);
        
    }
    
    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }
    
    public void modificarContacto(int id, String nombre, String apellido, String email, String foto, String tel1, String tel2, String tel3, String com1, String com2, String com3) throws Exception {
        
        validarContacto(nombre, apellido, email, tel1, tel2, tel3, com1, com2, com3);
        
        for (Contacto contacto : contactos) {
            if (contacto.getId() == id) {
                datoRepetidoMod(contacto, email, tel1, tel2, tel3, com1, com2, com3);
                contacto.setNombre(nombre);
                contacto.setApellido(apellido);
                contacto.setEmail(email);
                if(foto.isEmpty()){
                    foto = "./src/main/java/Imagenes/default.jpg";
                }
                contacto.setFoto(foto);
                
                TelefonoControlador telControlador = new TelefonoControlador();
                
                c.comando.executeUpdate("UPDATE contacto SET nombre = '"+nombre+"', apellido = '"+apellido+"', email = '"+email+"', foto = '"+foto+"' WHERE id = "+id);
                contacto.setListaTel(telControlador.crearListaTelefonos(tel1, tel2, tel3, com1, com2, com3, id, c));
                
                break;
            }
        }
    }
    
    public int siguienteId() {
        return IdActual++;
    }
    
    // Validaciones y búsquedas
    
    public void validarContacto(String nombre, String apellido, String correo, String tel1, String tel2, String tel3, String com1, String com2, String com3) throws Exception{
        
        if(nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()){
            throw new Exception("Faltan campos por llenar");
        }
        
        if(validarNombre(nombre) == 1){
            throw new Exception("No se permiten caracteres especiales en el nombre");
        }
        if(validarNombre(apellido) == 1){
            throw new Exception("No se permiten caracteres especiales en el apellido");
        }
        if(validarCorreo(correo) == 1){
            throw new Exception("Falta un @ y/o un .");
        }
        if(validarCorreo(correo) == 2){
            throw new Exception("Formato invalido para el correo");
        }
        
        TelefonoControlador telControlador = new TelefonoControlador();
        
        telControlador.validarTelefonos(tel1, tel2, tel3, com1, com2, com3);
    }
    
    public void datoRepetido(String correo, String tel1, String tel2, String tel3, String com1, String com2, String com3) throws Exception{
        if(buscarContactoPorCorreo(correo) != null){
            throw new Exception("Ese correo ya se encuentra registrado");
        }
        
        if(!tel1.isEmpty() && buscarContactoPorTelefono(tel1) != null){
            throw new Exception("El telefono "+tel1+" ya se encuentra registrado");
        }
        if(!tel2.isEmpty() && buscarContactoPorTelefono(tel2) != null){
            throw new Exception("El telefono "+tel2+" ya se encuentra registrado");
        }
        if(!tel3.isEmpty() && buscarContactoPorTelefono(tel3) != null){
            throw new Exception("El telefono "+tel3+" ya se encuentra registrado");
        }
    }
    
    public void datoRepetidoMod(Contacto contactoAntiguo, String correo, String tel1, String tel2, String tel3, String com1, String com2, String com3) throws Exception{
        if(buscarContactoPorCorreo(correo) != null && !correo.equals(contactoAntiguo.getEmail())){
            throw new Exception("Ese correo ya se encuentra registrado");
        }
        
        try{
            if(!tel1.isEmpty() && buscarContactoPorTelefono(tel1) != null && !tel1.equals(contactoAntiguo.getListaTel().get(0).getNumero())){
                throw new Exception("El telefono "+tel1+" ya se encuentra registrado");
            }
            if(!tel2.isEmpty() && buscarContactoPorTelefono(tel2) != null && !tel2.equals(contactoAntiguo.getListaTel().get(1).getNumero())){
                throw new Exception("El telefono "+tel2+" ya se encuentra registrado");
            }
            if(!tel3.isEmpty() && buscarContactoPorTelefono(tel3) != null && !tel3.equals(contactoAntiguo.getListaTel().get(2).getNumero())){
                throw new Exception("El telefono "+tel3+" ya se encuentra registrado");
            }
        } catch (Exception e){}
    }
    
    
    public int validarNombre(String nombre){
        if(!nombre.matches("^[a-zA-Z]+$")){
            return 1;
        }
        return 0;
    }

    public int validarCorreo(String correo){
        if(!correo.contains("@") || !correo.contains(".")){
            return 1;
        }
        if(!correo.matches("[-\\w\\.]+@\\w+\\.\\w+")){
            return 2;
        }
        
        return 0;
    }
    
    
    
    public List<Contacto> buscarContactoPorNombre(String nombre) {
        return contactos.stream()
                .filter(contacto -> contacto.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }
    
    public List<Contacto> buscarContactoPorApellido(String apellido) {
        return contactos.stream()
                .filter(contacto -> contacto.getApellido().equalsIgnoreCase(apellido))
                .collect(Collectors.toList());
    }
    
    public Contacto buscarContactoPorID(int idcontacto) {
        for (Contacto contacto : contactos) {
            if (idcontacto == contacto.getId()) {
                return contacto;
            }
        }
        return null;
    }
    
    public Contacto buscarContactoPorCorreo(String correo) {
        for (Contacto contacto : contactos) {
            if (contacto.getEmail().equals(correo)) {
                return contacto;
            }
        }
        return null;
    }
    
    public Contacto buscarContactoPorTelefono(String telefono) {
        for (Contacto contacto : contactos) {
            for (Telefono t : contacto.getListaTel()){
                if (t.getNumero().equals(telefono)) {
                    return contacto;
                }
            }
        }
        return null;
    }
    
    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public int getIdActual() {
        return IdActual;
    }

    public void setIdActual(int IdActual) {
        this.IdActual = IdActual;
    }
}
