package Vista;

import Controlador.ContactoControlador;
import Modelo.Contacto;
import Modelo.Telefono;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class Modificar extends javax.swing.JFrame {
    
    private ContactoControlador controlador;

    /**
     * Creates new form Modificar
     * @param controlador
     */
    public Modificar(ContactoControlador controlador) {
        this.controlador = controlador;
        initComponents();
        cargarDatosEnTabla();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botonVolver3 = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();
        consultarText = new javax.swing.JTextField();
        consultarBoton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        apellidoField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        correoField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        imagenField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tel2Field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tel1Field = new javax.swing.JTextField();
        tel3Field = new javax.swing.JTextField();
        modificarBoton = new javax.swing.JButton();
        eliminarBoton = new javax.swing.JButton();
        mostrarTodo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        imagenLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        com1Field = new javax.swing.JTextField();
        com2Field = new javax.swing.JTextField();
        com3Field = new javax.swing.JTextField();
        abrirBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ELIMINAR/EDITAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(188, 188, 188))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Correo", "Teléfonos"
            }
        ));
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabla);
        tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    limpiarCamposModificar();
                    mostrarImagenContacto();
                    llenarInfo();
                }
            }
        });

        botonVolver3.setBackground(new java.awt.Color(255, 46, 0));
        botonVolver3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonVolver3.setForeground(new java.awt.Color(255, 255, 255));
        botonVolver3.setText("VOLVER");
        botonVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolver3ActionPerformed(evt);
            }
        });

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Correo", "Teléfono" }));

        consultarBoton.setBackground(new java.awt.Color(0, 117, 255));
        consultarBoton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        consultarBoton.setForeground(new java.awt.Color(255, 255, 255));
        consultarBoton.setText("CONSULTAR");
        consultarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarBotonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 117, 255));
        jLabel2.setText("NOMBRE: ");

        apellidoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 117, 255));
        jLabel3.setText("APELLIDO:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 117, 255));
        jLabel4.setText("CORREO:");

        imagenField.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 117, 255));
        jLabel5.setText("RUTA DE IMAGEN:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 117, 255));
        jLabel6.setText("NÚMERO:");

        modificarBoton.setBackground(new java.awt.Color(0, 117, 255));
        modificarBoton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        modificarBoton.setForeground(new java.awt.Color(255, 255, 255));
        modificarBoton.setText("MODIFICAR");
        modificarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBotonActionPerformed(evt);
            }
        });

        eliminarBoton.setBackground(new java.awt.Color(255, 0, 0));
        eliminarBoton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eliminarBoton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarBoton.setText("ELIMINAR");
        eliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBotonActionPerformed(evt);
            }
        });

        mostrarTodo.setBackground(new java.awt.Color(0, 117, 255));
        mostrarTodo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mostrarTodo.setForeground(new java.awt.Color(255, 255, 255));
        mostrarTodo.setText("MOSTRAR TODO");
        mostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTodoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 117, 255));
        jLabel7.setText("Criterio de Búsqueda");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(50, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(75, 75));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 117, 255));
        jLabel8.setText("COMPAÑÍA:");

        abrirBoton.setText("Abrir");
        abrirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153)
                                .addComponent(mostrarTodo))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(consultarText, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(consultarBoton)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eliminarBoton)
                                .addGap(18, 18, 18)
                                .addComponent(modificarBoton)
                                .addGap(44, 44, 44))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(142, 142, 142)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tel3Field, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tel2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tel1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(com3Field, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                            .addComponent(com2Field, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                            .addComponent(com1Field, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                            .addComponent(jLabel8)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(abrirBoton)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(correoField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                                .addComponent(imagenField)))))
                                .addGap(0, 10, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(consultarBoton)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(consultarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(correoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imagenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abrirBoton)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(14, 14, 14)
                                .addComponent(tel1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tel2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tel3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(14, 14, 14)
                                .addComponent(com1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(com2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(com3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eliminarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mostrarTodo))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBotonActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabla.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Elija un contacto.");
            return;
        }
        
        int confirmar = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea modificar este contacto?", "Confirmar modificación", JOptionPane.YES_NO_OPTION);
        
        if(confirmar == JOptionPane.YES_OPTION){
            String correo = (String) tabla.getValueAt(selectedRow, 2);
            Contacto contacto = controlador.buscarContactoPorCorreo(correo);
            
            if (contacto != null) {
                
                try {
                    controlador.modificarContacto(contacto.getId(), nombreField.getText(), apellidoField.getText(), correoField.getText(), imagenField.getText().replace("\\", "\\\\"), tel1Field.getText(), tel2Field.getText(), tel3Field.getText(), com1Field.getText(), com2Field.getText(), com3Field.getText());
                    imagenLabel.setIcon(null);
                    cargarDatosEnTabla(); // Actualizar la tabla después de eliminar
                    JOptionPane.showMessageDialog(this, "Contacto modificado.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        }
    }//GEN-LAST:event_modificarBotonActionPerformed

    private void eliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotonActionPerformed
        // TODO add your handling code here:
//        if(){
//            
//        }
        
        int selectedRow = tabla.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Elija un contacto.");
            return;
        }
        int confirmar = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar este contacto?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        
        if(confirmar == JOptionPane.YES_OPTION){
            
            String correo = (String) tabla.getValueAt(selectedRow, 2);
            Contacto contacto = controlador.buscarContactoPorCorreo(correo);
            
            if (contacto != null) {
                controlador.eliminarContacto(contacto);
                imagenLabel.setIcon(null);
                cargarDatosEnTabla(); // Actualizar la tabla después de eliminar
                JOptionPane.showMessageDialog(this, "Contacto eliminado.");
            }
        }
        
    }//GEN-LAST:event_eliminarBotonActionPerformed

    private void botonVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolver3ActionPerformed
        Pantalla newpantallaMo = new Pantalla(controlador);
        
        newpantallaMo.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_botonVolver3ActionPerformed

    private void consultarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarBotonActionPerformed
        // TODO add your handling code here:
        imagenLabel.setIcon(null);
        realizarBusqueda();
    }//GEN-LAST:event_consultarBotonActionPerformed

    private void mostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTodoActionPerformed
        // TODO add your handling code here:
        imagenLabel.setIcon(null);
        consultarText.setText("");
        cargarDatosEnTabla();
    }//GEN-LAST:event_mostrarTodoActionPerformed

    private void apellidoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoFieldActionPerformed

    private void abrirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirBotonActionPerformed
        // TODO add your handling code here:
        String Ruta = "";
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        jFileChooser.setFileFilter(filtrado);

        int respuesta = jFileChooser.showOpenDialog(this);

        if (respuesta == jFileChooser.APPROVE_OPTION) {
            Ruta = jFileChooser.getSelectedFile().getPath();

            imagenField.setText(Ruta);
        }
    }//GEN-LAST:event_abrirBotonActionPerformed

    private void realizarBusqueda() {
        String criterio = (String) comboBox.getSelectedItem();
        String valor = consultarText.getText();
        List<Contacto> resultados = new ArrayList<>();
        Contacto resultado = null;

        switch (criterio) {
            case "Nombre":
                resultados = controlador.buscarContactoPorNombre(valor);
                break;
            case "Apellido":
                resultados = controlador.buscarContactoPorApellido(valor);
                break;
            case "Correo":
                resultado = controlador.buscarContactoPorCorreo(valor);
                if(resultado != null)
                    resultados.add(resultado);
                break;
            case "Teléfono":
                resultado = controlador.buscarContactoPorTelefono(valor);
                if(resultado != null)
                    resultados.add(resultado);
                break;
        }

        mostrarResultados(resultados);
    }
    
    private void mostrarResultados(List<Contacto> resultados) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); // Limpiar los datos existentes en la tabla

        if(resultados == null || resultados.isEmpty()){
            JOptionPane.showMessageDialog(this, "Contacto no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            cargarDatosEnTabla();
            return;
        }
        
        for (Contacto contacto : resultados) {
            String nombre = contacto.getNombre();
            String apellido = contacto.getApellido();
            String email = contacto.getEmail();
            List<Telefono> listaTel = contacto.getListaTel();
            List<String> numeros = listaTel.stream()
                                           .map(Telefono::getNumero)
                                           .collect(Collectors.toList());

            String telefonos = String.join(", ", numeros);
            modelo.addRow(new Object[]{nombre, apellido, email, telefonos});
        }
    }
    
    private void mostrarImagenContacto() {
        int selectedRow = tabla.getSelectedRow();
        if (selectedRow >= 0) {
            String correo = (String) tabla.getValueAt(selectedRow, 2);
            Contacto contacto = controlador.buscarContactoPorCorreo(correo);
            if (contacto != null) {
                ImageIcon imageIcon = new ImageIcon(contacto.getFoto());
                Image image = imageIcon.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
                imagenLabel.setIcon(new ImageIcon(image));
            }
        }
    }
    
    private void cargarDatosEnTabla() {
        List<Contacto> contactos = controlador.getContactos();
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); // Limpiar los datos existentes en la tabla

        for (Contacto contacto : contactos) {
            String nombre = contacto.getNombre();
            String apellido = contacto.getApellido();
            String email = contacto.getEmail();
            List<Telefono> listaTel = contacto.getListaTel();
            List<String> numeros = listaTel.stream()
                                           .map(Telefono::getNumero)
                                           .collect(Collectors.toList());

            String telefonos = String.join(", ", numeros);
            modelo.addRow(new Object[]{nombre, apellido, email, telefonos});
        }
    }
    
    public void limpiarCamposModificar(){
        nombreField.setText("");
        apellidoField.setText("");
        correoField.setText("");
        imagenField.setText("");
        tel1Field.setText("");
        tel2Field.setText("");
        tel3Field.setText("");
        com1Field.setText("");
        com2Field.setText("");
        com3Field.setText("");
    }
    
    public void llenarInfo(){
        int selectedRow = tabla.getSelectedRow();
        if (selectedRow >= 0) {
            String correo = (String) tabla.getValueAt(selectedRow, 2);
            Contacto contacto = controlador.buscarContactoPorCorreo(correo);
            
            nombreField.setText(contacto.getNombre());
            apellidoField.setText(contacto.getApellido());
            correoField.setText(contacto.getEmail());
            imagenField.setText(contacto.getFoto());
            try {
                tel1Field.setText(contacto.getListaTel().get(0).getNumero());
                com1Field.setText(contacto.getListaTel().get(0).getCompania());
                tel2Field.setText(contacto.getListaTel().get(1).getNumero());
                com2Field.setText(contacto.getListaTel().get(1).getCompania());
                tel3Field.setText(contacto.getListaTel().get(2).getNumero());
                com3Field.setText(contacto.getListaTel().get(2).getCompania());
            } catch (IndexOutOfBoundsException e) {}

        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Modificar().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirBoton;
    private javax.swing.JTextField apellidoField;
    private javax.swing.JButton botonVolver3;
    private javax.swing.JTextField com1Field;
    private javax.swing.JTextField com2Field;
    private javax.swing.JTextField com3Field;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton consultarBoton;
    private javax.swing.JTextField consultarText;
    private javax.swing.JTextField correoField;
    private javax.swing.JButton eliminarBoton;
    private javax.swing.JTextField imagenField;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarBoton;
    private javax.swing.JButton mostrarTodo;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tel1Field;
    private javax.swing.JTextField tel2Field;
    private javax.swing.JTextField tel3Field;
    // End of variables declaration//GEN-END:variables
}