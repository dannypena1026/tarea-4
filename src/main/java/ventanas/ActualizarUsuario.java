package ventanas;

import clases.Usuario;
import datos.UsuarioDatos;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Toolkit;

public class ActualizarUsuario extends javax.swing.JFrame {

    private String username;
    private int idUser;

    public ActualizarUsuario(String username) {
        this.username = username;
        initComponents();
        this.setLocationRelativeTo(null);
        cargarDatos(username);
        this.setTitle("Actualizar usuarios");
        Image icon = Toolkit.getDefaultToolkit().getImage(
        getClass().getResource("/actualizar.png"));
    setIconImage(icon);

    }

    private void cargarDatos(String username) {
        UsuarioDatos datos = new UsuarioDatos();
        Usuario u = datos.buscarPorUsername(username);

        if (u != null) {

            idUser = u.getIdUser();

            txtNombre.setText(u.getNombre());
            txtApellido.setText(u.getApellido());
            txtEmail.setText(u.getEmail());
            txtTelefono.setText(u.getTelefono());
            txtUserName.setText(u.getUserName());
            txtContrasena.setText(u.getPassword());

        } else {
            JOptionPane.showMessageDialog(this, "Usuario no encontrado.");
            this.dispose();
        }
    }

    private void txtGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           

        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String correo = txtEmail.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String usuario = txtUserName.getText().trim();
        String pass = txtContrasena.getText().trim();

        if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() ||
            telefono.isEmpty() || usuario.isEmpty() || pass.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.");
            return;
        }

        Usuario u = new Usuario();
        u.setIdUser(idUser);
        u.setNombre(nombre);
        u.setApellido(apellido);
        u.setEmail(correo);
        u.setTelefono(telefono);
        u.setUserName(usuario);
        u.setPassword(pass);

        UsuarioDatos datos = new UsuarioDatos();
        boolean ok = datos.actualizarUsuario(u);

        if (ok) {
            JOptionPane.showMessageDialog(this, "Usuario actualizado correctamente");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar usuario.");
        }
    }                                          

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEmail = new javax.swing.JTextPane();
        txtGuardar = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtNombre = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtUserName = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtApellido = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtTelefono = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtContrasena = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel3.setText("Correo");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel4.setText("Usuario");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel5.setText("Contraseña");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel6.setText("Telefono");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel7.setText("Apellido");

        jScrollPane1.setViewportView(txtEmail);

        txtGuardar.setBackground(new java.awt.Color(0, 119, 237));
        txtGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGuardar.setForeground(new java.awt.Color(255, 255, 255));
        txtGuardar.setText("Guardar Cambios");
        txtGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        txtGuardar.addActionListener(this::txtGuardarActionPerformed);

        jScrollPane7.setViewportView(txtNombre);

        jScrollPane8.setViewportView(txtUserName);

        jScrollPane9.setViewportView(txtApellido);

        jScrollPane10.setViewportView(txtTelefono);

        jScrollPane11.setViewportView(txtContrasena);

        jPanel1.setBackground(new java.awt.Color(72, 133, 237));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btnCancelar.setBackground(new java.awt.Color(200, 200, 200));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.MatteBorder(null));
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        jPanel2.setBackground(new java.awt.Color(90, 90, 90));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Desarrollado por SrDxnny");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, txtGuardar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, txtGuardar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane txtApellido;
    private javax.swing.JTextPane txtContrasena;
    private javax.swing.JTextPane txtEmail;
    private javax.swing.JButton txtGuardar;
    private javax.swing.JTextPane txtNombre;
    private javax.swing.JTextPane txtTelefono;
    private javax.swing.JTextPane txtUserName;
    // End of variables declaration//GEN-END:variables
}
