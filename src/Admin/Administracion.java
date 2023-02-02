package Admin;

import Arreglos.Arreglo_admin;
import Paneles_De_Control.*;
import Login.Login_;
import dao.clases.administradorCAD;
import dao.clases.usuarioCAD;
import javax.swing.JOptionPane;

public class Administracion extends javax.swing.JFrame {

    Arreglo_admin obj = new Arreglo_admin();
    administradorCAD cadAdministrador = new administradorCAD();
    usuarioCAD cadUsuario = new usuarioCAD();
    public Administracion() {
        initComponents();
        txtInicio.requestFocus();
    }

    static int intentos = 3;
    public static Admin_ cuenta;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInicioSesion = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtInicio = new javax.swing.JTextField();
        txtCrts = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Administracion");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Login/btnInicioSesionAdmin.png"))); // NOI18N
        btnInicioSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 150, 40));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Login/volver.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        txtInicio.setBorder(null);
        getContentPane().add(txtInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 220, 30));

        txtCrts.setBorder(null);
        getContentPane().add(txtCrts, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 220, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Login/FondoAdmin.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Login_ windows = new Login_();
        windows.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
        String user_ = txtInicio.getText();
        String crts_ = txtCrts.getText();

        Admin_ bus = cadAdministrador.buscar(user_);
        if (intentos > 0) {
            if (bus == null) {
                JOptionPane.showMessageDialog(null, "El administrador no existe");
            } else {
                if (bus.getContraseña().equals(crts_)) {
                        cuenta = bus;
                        JOptionPane.showMessageDialog(null, "Bienvenido : " + bus.getNombre() + " " + bus.getApellido());
                        PanelControl_Admins windows = new PanelControl_Admins();
                        windows.setVisible(true);
                        this.dispose();
                }
            }
        }


    }//GEN-LAST:event_btnInicioSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtCrts;
    private javax.swing.JTextField txtInicio;
    // End of variables declaration//GEN-END:variables
}
