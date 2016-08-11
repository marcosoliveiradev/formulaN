package formulan.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    public Conexao() {
        //construtor padrão
    }
    
    public static Connection con = null;
     
    public static void Conectar() {
        System.out.println("Conectando ao banco...");
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Passou do Class.forName");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/formula", "root", "usbw");
            System.out.println("Conectado!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            System.out.println("Entrou no SQLException");
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
