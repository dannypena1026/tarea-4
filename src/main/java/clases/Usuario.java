package clases;

public class Usuario extends Persona {

    private int idUser;        // <-- coincide con la BD
    private String userName;   // <-- coincide con la BD
    private String password;   // <-- coincide con la BD

    public Usuario() {
        super();
    }

    public Usuario(int idUser, String nombre, String apellido,
                   String telefono, String email,
                   String userName, String password) {
        super(nombre, apellido, telefono, email);
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
    }

    // GETTERS Y SETTERS CORRECTOS

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
