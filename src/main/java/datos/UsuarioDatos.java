package datos;

import clases.Usuario;
import utilidades.ConexionBD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDatos {

    private final Connection cn;

    public UsuarioDatos() {
        cn = ConexionBD.getInstancia().getConexion();
    }

    // =========================
    // INSERTAR SOLO USERNAME + PASS
    // =========================
    public boolean insertarUsuario(String username, String password) {
        String sql = "INSERT INTO usuarios (UserName, Password) VALUES (?, ?)";

        try (PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar usuario: " + e.getMessage());
            return false;
        }
    }


    // =========================
    // LOGIN
    // =========================
    public Usuario login(String username, String password) {
        String sql = "SELECT * FROM usuarios WHERE UserName = ? AND Password = ?";

        try (PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return mapearUsuario(rs);
            }

        } catch (SQLException e) {
            System.out.println("Error al hacer login: " + e.getMessage());
        }

        return null;
    }

    
    // =========================
    // REGISTRAR COMPLETO
    // =========================
    public boolean registrarUsuarioCompleto(Usuario u) {
        String sql = "INSERT INTO usuarios (Nombre, Apellido, Telefono, Email, UserName, Password) "
                   + "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getTelefono());
            ps.setString(4, u.getEmail());
            ps.setString(5, u.getUserName());
            ps.setString(6, u.getPassword());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    // =========================
    // OBTENER TODOS
    // =========================
    public List<Usuario> obtenerTodos() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

        try (PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(mapearUsuario(rs));
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener usuarios: " + e.getMessage());
        }

        return lista;
    }


    // =========================
    // ELIMINAR POR USERNAME
    // =========================
    public boolean eliminarPorUsername(String username) {
        String sql = "DELETE FROM usuarios WHERE UserName = ?";

        try (PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, username);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    // =========================
    // BUSCAR POR USERNAME
    // =========================
    public Usuario buscarPorUsername(String username) {
        String sql = "SELECT * FROM usuarios WHERE UserName = ?";

        try (PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return mapearUsuario(rs);
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar usuario: " + e.getMessage());
        }

        return null;
    }


    // =========================
    // ACTUALIZAR USUARIO
    // =========================
    public boolean actualizarUsuario(Usuario u) {
        String sql = "UPDATE usuarios SET Nombre = ?, Apellido = ?, Telefono = ?, Email = ?, "
                   + "UserName = ?, Password = ? WHERE idUser = ?";

        try (PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getTelefono());
            ps.setString(4, u.getEmail());
            ps.setString(5, u.getUserName());
            ps.setString(6, u.getPassword());
            ps.setInt(7, u.getIdUser());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario: " + e.getMessage());
            return false;
        }
    }


    // =========================
    // MAPEAR RESULTSET → OBJETO
    // =========================
    private Usuario mapearUsuario(ResultSet rs) throws SQLException {
        Usuario u = new Usuario();

        u.setIdUser(rs.getInt("idUser"));
        u.setUserName(rs.getString("UserName"));
        u.setPassword(rs.getString("Password"));
        u.setNombre(rs.getString("Nombre"));
        u.setApellido(rs.getString("Apellido"));
        u.setTelefono(rs.getString("Telefono"));
        u.setEmail(rs.getString("Email"));

        return u;
    }
}
