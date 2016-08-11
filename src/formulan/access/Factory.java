package formulan.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Factory {
    
    public static Connection con = null;
    public static final int MYSQL = 0; 
    public static final String MySQLDriver = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3307/formula";
    public static final String USER = "root";
    public static final String SENHA = "usbw";    

    public static Connection conectar() throws SQLException {        
        
        try {
            Class.forName(MySQLDriver);
        } catch (ClassNotFoundException ex) {
            //se não der catch aqui, dá um monte de try lá na frente
            Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DriverManager.getConnection(URL, USER, SENHA);
    }   
}