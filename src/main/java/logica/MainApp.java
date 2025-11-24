package logica;

import utilidades.ConexionBD;
import java.sql.Connection;

public class MainApp {

    
    public static void main(String[] args) {
        
        try {
        javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
    } catch (Exception e) {
        e.printStackTrace();
    }
        
        Connection cn = ConexionBD.getInstancia().getConexion();
        if (cn != null) {
            System.out.println("Todo bien, ya puedo usar la BD.");
        } else {
            System.out.println("Algo salió mal con la conexión.");
        }
    }
}
