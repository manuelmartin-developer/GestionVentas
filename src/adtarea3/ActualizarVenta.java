/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adtarea3;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.ucanaccess.converters.Functions;

/**
 *
 * @author mmart
 */
public class ActualizarVenta extends javax.swing.JFrame {

    /**
     * Creates new form ActualizarVenta
     */
    public ActualizarVenta() {
        initComponents();
        this.setTitle("Actualizar Venta");
        Image icono = Toolkit.getDefaultToolkit().getImage("./src/imagenes/icono.png");
        this.setIconImage(icono);
        setLocationRelativeTo(null);
        listadoVentas();
    }
    
    // Creamos un método que devuelva un objeto de tipo Connection para que
    // pueda ser utilizado por el resto de métodos de la clase
    
    private Connection Conexion(){
        
        Connection conexion = null;
        // Conexión a la base de datos de la tienda de ropa
        String connectionUrl= "jdbc:ucanaccess://./src\\BBDD\\tiendaropa.mdb" ;
        
        try {
            conexion = DriverManager.getConnection(connectionUrl);
        } catch (SQLException sqle) {
            sqle.getMessage();
        }
        
        return conexion;
        
    }
    
    // Códigos y nombres empleados para ComboBox
    
    private void listadoVentas(){
        
        try {
            
            Connection conexion = this.Conexion();
            
            Statement consulta = conexion.createStatement();
            
            ResultSet resultado = consulta.executeQuery("SELECT * FROM ventas");
            
            while (resultado.next()){
                
                String nombre = resultado.getString("nombre");

                jComboBoxListadoVentas.addItem(nombre);
            }
            
        } catch (SQLException sqle) {
            sqle.getMessage();
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxListadoVentas = new javax.swing.JComboBox<>();
        jTextCodigoProducto = new javax.swing.JTextField();
        jTextNombreProducto = new javax.swing.JTextField();
        jTextCodigoEmpleado = new javax.swing.JTextField();
        jTextUnidades = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(adtarea3.ADTarea3App.class).getContext().getResourceMap(ActualizarVenta.class);
        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jComboBoxListadoVentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una venta" }));
        jComboBoxListadoVentas.setName("jComboBoxListadoVentas"); // NOI18N
        jComboBoxListadoVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListadoVentasActionPerformed(evt);
            }
        });

        jTextCodigoProducto.setText(resourceMap.getString("jTextCodigoProducto.text")); // NOI18N
        jTextCodigoProducto.setEnabled(false);
        jTextCodigoProducto.setName("jTextCodigoProducto"); // NOI18N

        jTextNombreProducto.setText(resourceMap.getString("jTextNombreProducto.text")); // NOI18N
        jTextNombreProducto.setName("jTextNombreProducto"); // NOI18N

        jTextCodigoEmpleado.setText(resourceMap.getString("jTextCodigoEmpleado.text")); // NOI18N
        jTextCodigoEmpleado.setEnabled(false);
        jTextCodigoEmpleado.setName("jTextCodigoEmpleado"); // NOI18N

        jTextUnidades.setText(resourceMap.getString("jTextUnidades.text")); // NOI18N
        jTextUnidades.setName("jTextUnidades"); // NOI18N

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextUnidades, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addComponent(jTextCodigoEmpleado, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxListadoVentas, 0, 381, Short.MAX_VALUE)
                                    .addComponent(jTextNombreProducto)
                                    .addComponent(jTextCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxListadoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextCodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxListadoVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListadoVentasActionPerformed
        
        try {

            Connection conexion = this.Conexion();

            Statement consulta = conexion.createStatement();

            ResultSet resultado = consulta.executeQuery("SELECT * FROM ventas WHERE nombre = \'"+jComboBoxListadoVentas.getSelectedItem().toString()+"\'");

            while (resultado.next()){

                int codigo_producto = resultado.getInt("Codigo_producto");
                String nombre = resultado.getString("nombre");
                long codigo_empleado = resultado.getLong("codigo_empleado");
                long unidades = resultado.getLong("unidades");

                //Asignamos los resultados a los JTexts
                jTextCodigoProducto.setText(Integer.toString(codigo_producto));
                jTextNombreProducto.setText(nombre);
                jTextCodigoEmpleado.setText(String.valueOf(codigo_empleado));
                jTextUnidades.setText(String.valueOf(unidades));
            }

        } catch (SQLException sqle) {
            sqle.getMessage();
        }
    }//GEN-LAST:event_jComboBoxListadoVentasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String nombre = jTextNombreProducto.getText();
        String unidades = jTextUnidades.getText();
        String codigoProducto = jTextCodigoProducto.getText();

        if (nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe rellenar el campo de nombre");
        }else if (unidades.isEmpty()){  
            JOptionPane.showMessageDialog(null, "Debe rellenar el campo de unidades");
        }else if (!Functions.isNumeric(unidades)){
            JOptionPane.showMessageDialog(null, "El campo unidades debe ser un campo numérico ");
        }else{
            
             try {

                Connection conexion = this.Conexion();
                PreparedStatement consulta = conexion.prepareStatement("UPDATE ventas SET nombre=?,unidades=? WHERE Codigo_producto=?");

                long unidadesNumero = Long.parseLong(unidades);
                long codigoProductoNumero = Long.parseLong(codigoProducto);
                
                consulta.setString(1, nombre);
                consulta.setLong(2, unidadesNumero);
                consulta.setLong(3, codigoProductoNumero);
                consulta.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Se han actualizado los datos de la venta correctamente");
                
                jComboBoxListadoVentas.addItem(jTextNombreProducto.getText());
                jComboBoxListadoVentas.removeItemAt(jComboBoxListadoVentas.getSelectedIndex() );
                jComboBoxListadoVentas.setSelectedIndex(0);
                

                jTextCodigoEmpleado.setText("");
                jTextCodigoProducto.setText("");
                jTextNombreProducto.setText("");
                jTextUnidades.setText("");
      
            } catch (SQLException sqle) {
                sqle.getMessage();
            }
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxListadoVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextCodigoEmpleado;
    private javax.swing.JTextField jTextCodigoProducto;
    private javax.swing.JTextField jTextNombreProducto;
    private javax.swing.JTextField jTextUnidades;
    // End of variables declaration//GEN-END:variables
}
