package Controlador;

// Libries required to create a conection between Java and SQL
// These all "import java.sql..." can be replaced with just "import java.sql.*" 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Library to report information about connection status

import javax.swing.JOptionPane;

/////////////////////////////////////////////////////////////////////////////////

public class Conector {
    public Connection conexion = null;
    
    public Statement comando = null;
    
    public ResultSet registro;
    
    public Connection JavaToMySQL(){
        try {
            Class.forName("com.mysql.jdbc.Driver"); // 5.0.8 Driver version
            
            String servidor = "jdbc:mysql://localhost:3307/agenda";
            String usuario = "root";
            String password = "";
            
            // Creates connection
            conexion = DriverManager.getConnection(servidor, usuario, password);
            
            JOptionPane.showMessageDialog(null,"Conexion exitosa");
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"No se puedo encontrar la clase Conexion");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"No se puedo conectar a la base de datos");
        }catch(Exception es){
           JOptionPane.showMessageDialog(null,"Error con la informacion gestionada"); 
        }finally{
            return conexion; 
        }
        
    }
}