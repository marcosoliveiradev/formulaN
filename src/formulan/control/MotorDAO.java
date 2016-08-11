package formulan.control;

import formulan.access.Factory;
import formulan.model.Motor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MotorDAO implements DAOBasico {
   private Connection con;  
   private Statement stmt;  
   private String sql;
   private ResultSet rs;
   private PreparedStatement pstmt;
   
    @Override
    public void inserir(Object objeto) {
        Motor motor = (Motor)objeto;
        
        String motorNome = motor.getMotorNome();
        byte[] motorObs = motor.getMotorObs();
        byte[] motorLogo = motor.getMotorLogo();
        Integer paisId = motor.getPaisId();
        pstmt = null;

        String prepSQL = "INSERT INTO `motor` (`Motor_Nome`, `Motor_Obs`, `Motor_Logo`, `Pais_Id`) "
                                + "VALUES (?, ?, ?, ?)";                
        try {
            con = Factory.conectar();            
            pstmt = con.prepareStatement(prepSQL);

            pstmt.setString(1, motorNome);
            pstmt.setBytes(2, motorObs);
            pstmt.setBytes(3, motorLogo);
            pstmt.setInt(4, paisId);
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }                
    }
    
   @Override
    public void editar(Object objeto) {
        Motor motor = (Motor)objeto;
        
        Integer motorId = motor.getMotorId();
        String motorNome = motor.getMotorNome();
        byte[] motorObs = motor.getMotorObs();
        byte[] motorLogo = motor.getMotorLogo();
        Integer paisId = motor.getPaisId();        
        pstmt = null;
        
        String prepSQL = "UPDATE `motor` SET `Motor_Nome`=?,"
                                          + "`Motor_Obs`=?,"
                                          + "`Motor_Logo`=?,"
                                          + "`Pais_Id`=? "
                                          + "WHERE `Motor_Id`=?";              

        try {
            con = Factory.conectar();            
            pstmt = con.prepareStatement(prepSQL);

            pstmt.setString(1, motorNome);
            pstmt.setBytes(2, motorObs);
            pstmt.setBytes(3, motorLogo);
            pstmt.setInt(4, paisId);
            pstmt.setInt(5, motorId);
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }                
        
    }
    public void excluir(int motorId) {
        String prepSQL = "DELETE FROM `motor` WHERE `Motor_Id`=?";                
        try {
            con = Factory.conectar();            
            pstmt = con.prepareStatement(prepSQL);            
            pstmt.setInt(1, motorId);            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }                                
    }
       
    @Override
    public Motor getObjetoById (int motorId) {
        sql = "SELECT * FROM `motor` WHERE `Motor_Id`=" + motorId; 
        Motor motorTemp = new Motor();

        try {
            con = Factory.conectar();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            
            rs.next(); //ponteiro no primeiro. Só vai ter um mesmo 
            motorTemp.setMotorId(rs.getInt("Motor_Id"));
            motorTemp.setMotorNome(rs.getString("Motor_Nome"));
            motorTemp.setMotorLogo(rs.getBytes("Motor_Logo"));
            motorTemp.setMotorObs(rs.getBytes("Motor_Obs"));
            motorTemp.setPaisId(rs.getInt("Pais_Id"));
            return motorTemp;
            
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
        
        return null;
    }    

    @Override
    public List<Object> listaBusca(String textoBusca) {
        String sql = "SELECT * FROM `motor` WHERE `Motor_Nome` LIKE '%"+textoBusca+"%'";
 
        List<Motor> lista = new ArrayList<Motor>();
        
        try {
            con = Factory.conectar();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {             
                Motor motorTemp = new Motor();
                
                motorTemp.setMotorId(rs.getInt("Motor_Id"));
                motorTemp.setMotorNome(rs.getString("Motor_Nome"));
                motorTemp.setMotorLogo(rs.getBytes("Motor_Logo"));
                motorTemp.setMotorObs(rs.getBytes("Motor_Obs"));
                motorTemp.setPaisId(rs.getInt("Pais_Id"));
                lista.add(motorTemp);
            }
            return (List)lista;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public void executarUpdate(Object objeto) {
        //Não implementado
    }

}