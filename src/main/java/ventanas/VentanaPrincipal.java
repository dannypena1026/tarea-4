package ventanas;

import clases.Usuario;
import datos.UsuarioDatos;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import java.awt.Toolkit;


public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        cargarUsuarios();
        this.setLocationRelativeTo(null);
        this.setTitle("Clientes Registrados");
        Image icon = Toolkit.getDefaultToolkit().getImage(
        getClass().getResource("/clientes.png"));
    setIconImage(icon);
        
        this.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            @Override
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                cargarUsuarios();
            }
            @Override
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
    }

    private void cargarUsuarios() {
        UsuarioDatos datos = new UsuarioDatos();
        List<Usuario> lista = datos.obtenerTodos();

        String[] columnas = {"Nombre", "Apellido", "Telefono", "Correo", "Usuario"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (Usuario u : lista) {
            Object[] fila = {
                u.getNombre(),
                u.getApellido(),
                u.getTelefono(),
                u.getEmail(),
                u.getUserName()
            };
            modelo.addRow(fila);
        }

        tablaUsuarios.setModel(modelo);
        
        
    }

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        VentanaRegistro vr = new VentanaRegistro();
        vr.vieneDeLogin = false;
        vr.setVisible(true);
    }                                        
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int fila = tablaUsuarios.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un usuario.");
            return;
        }

        String username = tablaUsuarios.getValueAt(fila, 4).toString();

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea eliminar al usuario: " + username + "?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        UsuarioDatos datos = new UsuarioDatos();
        boolean ok = datos.eliminarPorUsername(username);

        if (ok) {
            JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente.");
            cargarUsuarios();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar el usuario.");
        }
    }                                           

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int fila = tablaUsuarios.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un usuario.");
            return;
        }

        String username = tablaUsuarios.getValueAt(fila, 4).toString();

        new ActualizarUsuario(username).setVisible(true);
    }                                             

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {                                                
        this.dispose();
        new LoginVentana().setVisible(true);
    }                                               

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 240, 240));
        setResizable(false);

        tablaUsuarios.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaUsuarios.setGridColor(new java.awt.Color(220, 220, 220));
        tablaUsuarios.setRowHeight(28);
        tablaUsuarios.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(tablaUsuarios);

        btnActualizar.setBackground(new java.awt.Color(0, 122, 255));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setPreferredSize(new java.awt.Dimension(150, 40));
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnNuevo.setBackground(new java.awt.Color(0, 122, 255));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setPreferredSize(new java.awt.Dimension(150, 40));
        btnNuevo.addActionListener(this::btnNuevoActionPerformed);

        btnCerrarSesion.setBackground(new java.awt.Color(0, 122, 255));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(150, 40));
        btnCerrarSesion.addActionListener(this::btnCerrarSesionActionPerformed);

        btnEliminar.setBackground(new java.awt.Color(0, 122, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setPreferredSize(new java.awt.Dimension(150, 40));
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        jPanel1.setBackground(new java.awt.Color(52, 118, 217));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes Registrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(90, 90, 90));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Desarrollado por SrDxnny");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
