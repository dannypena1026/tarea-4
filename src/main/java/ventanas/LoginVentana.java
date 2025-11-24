package ventanas;

import clases.Usuario;
import datos.UsuarioDatos;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;

public class LoginVentana extends javax.swing.JFrame {
    private UsuarioDatos usuarioDatos = new UsuarioDatos();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginVentana.class.getName());

    public LoginVentana() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Inicio de sesión");
        Image icon = Toolkit.getDefaultToolkit().getImage(
        getClass().getResource("/inicio.png"));
    setIconImage(icon);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel2.setText("Usuario");

        txtUsuario.setBackground(new java.awt.Color(245, 245, 245));
        txtUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        txtUsuario.addActionListener(this::txtUsuarioActionPerformed);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel3.setText("Contraseña");

        txtContrasena.setBackground(new java.awt.Color(245, 245, 245));
        txtContrasena.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        btnEntrar.setBackground(new java.awt.Color(66, 133, 244));
        btnEntrar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorderPainted(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setOpaque(true);
        btnEntrar.addActionListener(this::btnEntrarActionPerformed);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("¿No tienes una cuenta?");

        btnRegistrarse.setBackground(new java.awt.Color(0, 120, 215));
        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 120, 215), 2, true));
        btnRegistrarse.addActionListener(this::btnRegistrarseActionPerformed);

        jPanel1.setBackground(new java.awt.Color(72, 133, 237));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciar Sesión");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(90, 90, 90));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Desarrollado por SrDxnny");
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(141, 141, 141))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtContrasena)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnEntrar)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
                                       
    String usuario = txtUsuario.getText().trim();
    String contrasena = new String(txtContrasena.getPassword());

    if (usuario.isEmpty() || contrasena.isEmpty()) {
        JOptionPane.showMessageDialog(this,
            "Debe ingresar su usuario y contraseña, si no está registrado debe registrarse");
        return;
    }

    Usuario u = usuarioDatos.login(usuario, contrasena);

    if (u == null) {
        JOptionPane.showMessageDialog(this,
            "Usuario o contraseña incorrectos");
        return;
    }

    VentanaPrincipal vp = new VentanaPrincipal();
    vp.setVisible(true);
    this.dispose();

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
    this.dispose();
    new VentanaRegistro().setVisible(true);
    
    btnRegistrarse.setBackground(new java.awt.Color(0,123,255));
    btnRegistrarse.setForeground(Color.WHITE);

    btnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnRegistrarse.setBackground(new java.awt.Color(0,105,217));
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnRegistrarse.setBackground(new java.awt.Color(0,123,255));
    }
});
    
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new LoginVentana().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
