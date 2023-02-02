package Users;

import Admin.Admin_;
import Arreglos.*;
import Paneles_De_Control.PanelControl_Users;
import Login.Login_;
import javax.swing.JOptionPane;
import Users.*;
import dao.clases.administradorCAD;
import dao.clases.usuarioCAD;

public class Usuario extends javax.swing.JFrame {

    Arreglo_admin obj = new Arreglo_admin();
    Arreglo_user obj_2 = new Arreglo_user();
    administradorCAD cadAdministrador = new administradorCAD();
    usuarioCAD cadUsuario = new usuarioCAD();
    public Usuario() {
        initComponents();
    }
    static int intentos = 3;
    Admin_ aux_1;
    User_ aux_2;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new javax.swing.JTextField();
        txtCrts = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Usuarios");
        setMinimumSize(new java.awt.Dimension(573, 499));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser.setBorder(null);
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 210, 20));

        txtCrts.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCrts.setBorder(null);
        getContentPane().add(txtCrts, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 210, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Login/btIniciarSesion_1.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 200, 40));

        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Login/volver.png"))); // NOI18N
        btn_volver.setBorder(null);
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 50, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Login/Login.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        Login_ windows = new Login_();
        windows.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user_ = txtUser.getText();
        String crts_ = txtCrts.getText();
        Admin_ bus = cadAdministrador.buscar(user_);
        User_ bus2 = cadUsuario.buscar(user_);
        if (intentos > 0) {
            if (bus == null && bus2 == null) {
                JOptionPane.showMessageDialog(null, "El usario no existe");
            } else {
                if (bus != null) {
                    if (bus.getContraseña().equals(crts_)) {
                            aux_1 = bus;
                            JOptionPane.showMessageDialog(null, "Bienvenido : " + bus.getNombre() + " " + bus.getApellido());
                            PanelControl_Users windows = new PanelControl_Users();
                            windows.setVisible(true);
                            this.dispose();
                    } else {
                        intentos--;
                        JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectas -- Intentos restantes: " + intentos);
                    }
                }
                if (bus2 != null) {
                    if (bus2.getContraseña().equals(crts_)) {
                            aux_2 = bus2;
                            JOptionPane.showMessageDialog(null, "Bienvenido : " + bus2.getNombre() + " " + bus2.getApellido());
                            PanelControl_Users windows = new PanelControl_Users();
                            windows.setVisible(true);
                            this.dispose();
                    } else {
                        intentos--;
                        JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectas -- Intentos restantes: " + intentos);
                    }
                }
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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_volver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtCrts;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
