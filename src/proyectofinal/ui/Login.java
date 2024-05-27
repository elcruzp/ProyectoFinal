package proyectofinal.ui;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

  
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);

        this.pintarImagen(this.lblImagen, "src/Imagenes/Corhuila logo blanco.png");
    }

    private ImageIcon imagen;
    private Icon icono;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanelBg = new javax.swing.JPanel();
        jPanelBarra = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblDescripcion2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblContraseña = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPassword = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JPanel();
        lblEntrar = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBg.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBarra.setBackground(new java.awt.Color(21, 57, 73));

        javax.swing.GroupLayout jPanelBarraLayout = new javax.swing.GroupLayout(jPanelBarra);
        jPanelBarra.setLayout(jPanelBarraLayout);
        jPanelBarraLayout.setHorizontalGroup(
            jPanelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelBarraLayout.setVerticalGroup(
            jPanelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        jPanelBg.add(jPanelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 210, 360));

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("INICIAR SESIÓN");
        jPanelBg.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 190, -1));

        lblUsuario.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("USUARIO");
        jPanelBg.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 180, -1));

        lblDescripcion2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblDescripcion2.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion2.setText(" servicios públicos y pago de impuestos.");
        jPanelBg.add(lblDescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 370, -1));
        jPanelBg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 370, 10));

        lblContraseña.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lblContraseña.setText("CONTRASEÑA");
        jPanelBg.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 180, -1));
        jPanelBg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 370, 10));

        jPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPassword.setForeground(new java.awt.Color(204, 204, 204));
        jPassword.setText("************");
        jPassword.setBorder(null);
        jPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordMousePressed(evt);
            }
        });
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPanelBg.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 370, -1));

        btnEntrar.setBackground(new java.awt.Color(57, 180, 173));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblEntrar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        lblEntrar.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar.setText("Entrar");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEntrarLayout = new javax.swing.GroupLayout(btnEntrar);
        btnEntrar.setLayout(btnEntrarLayout);
        btnEntrarLayout.setHorizontalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnEntrarLayout.setVerticalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelBg.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, 30));

        lblDescripcion.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setText(" Realice depósitos, retiros, consulte su saldo, pago  de");
        jPanelBg.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 370, 20));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanelBg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 370, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBg, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseEntered
        btnEntrar.setBackground(new Color(81, 255, 245));
    }//GEN-LAST:event_lblEntrarMouseEntered

    private void lblEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseExited
        btnEntrar.setBackground(new Color(57, 180, 173));
    }//GEN-LAST:event_lblEntrarMouseExited

    private void jPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordMousePressed
        if (String.valueOf(jPassword.getPassword()).equals("************")) {
            jPassword.setText("");
            jPassword.setForeground(Color.black);
        }
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jPasswordMousePressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if (txtUsuario.getText().equals("Ingrese su nombre de usuario")) {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        if (String.valueOf(jPassword.getPassword()).isEmpty()) {
            jPassword.setText("************");
            jPassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void lblEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseClicked

        String Usuario1 = "Juan";
        String Usuario2 = "Andres";
        String Usuario3 = "Dharyn";
        String ContraseñaCorrecta = "1234";
        String Password = new String(jPassword.getPassword());

        if (Usuario1.isEmpty() || Password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
            txtUsuario.setText("");
            jPassword.setText("");
        } else {
            if (txtUsuario.getText().equalsIgnoreCase(Usuario1) && Password.equals("1234")) {
                Menu Master = new Menu();
                Master.setVisible(true);
                Master.setLocationRelativeTo(null);
                this.dispose();

                

            } else if (txtUsuario.getText().equalsIgnoreCase(Usuario2) && Password.equals("1234")){
                Menu Master = new Menu();
                Master.setVisible(true);
                Master.setLocationRelativeTo(null);
                this.dispose();

                
            } else if (txtUsuario.getText().equalsIgnoreCase(Usuario3) && Password.equals("1234")){
                Menu Master = new Menu();
                Master.setVisible(true);
                Master.setLocationRelativeTo(null);
                this.dispose();
 
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
                txtUsuario.setText("");
                jPassword.setText("");
            }
        }

    }//GEN-LAST:event_lblEntrarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private void pintarImagen(JLabel lbl, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lbl.getWidth(),
                        lbl.getHeight(),
                        Image.SCALE_DEFAULT
                )
        );
        lbl.setIcon(this.icono);
        this.repaint();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEntrar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBarra;
    private javax.swing.JPanel jPanelBg;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcion2;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
