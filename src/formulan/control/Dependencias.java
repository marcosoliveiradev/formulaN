package formulan.control;

import formulan.access.Factory;
import formulan.model.Equipe;
import formulan.model.Motor;
import formulan.model.Pais;
import formulan.model.Pontos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dependencias {
    
    /**Verifica se os dados de um registro Pais tem pendências nas tabelas
     * PILOTO, PISTA, MOTOR e EQUIPE 
     * @param pais
     * @return
     */
    public static String verPais (Pais pais) {
        String retorno = null;
        int piloto = 0;
        int pista = 0;
        int motor = 0;
        int equipe = 0;                

        String sqlPiloto = "SELECT * FROM `piloto` WHERE `Pais_Id`=" + pais.getPaisId(); 
        String sqlPista = "SELECT * FROM `pista` WHERE `Pais_Id`=" + pais.getPaisId(); 
        String sqlMotor = "SELECT * FROM `motor` WHERE `Pais_Id`=" + pais.getPaisId(); 
        String sqlEquipe = "SELECT * FROM `equipe` WHERE `Pais_Id`=" + pais.getPaisId(); 
        try {
            Connection con = Factory.conectar();
            Statement stmt = con.createStatement();
            ResultSet rs = null;
            
            rs = con.createStatement().executeQuery(sqlPiloto);            
            if (rs.next()) {
                rs.last();
                piloto = rs.getRow();                
            }                        
            rs = con.createStatement().executeQuery(sqlPista);            
            if (rs.next()) {
                rs.last();
                pista = rs.getRow();                
            }                        
            rs = con.createStatement().executeQuery(sqlMotor);            
            if (rs.next()) {
                rs.last();
                motor = rs.getRow();                
            }                        
            rs = con.createStatement().executeQuery(sqlEquipe);            
            if (rs.next()) {
                rs.last();
                equipe = rs.getRow();                
            }                        
            
            stmt.close();
            con.close();                        
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
        
        if ((piloto == 0) && (pista == 0) && (motor == 0) && (equipe == 0)) {
            return "";
        } else {
            String strPiloto="";String strPista="";String strEquipe="";String strMotor="";
            
            if (piloto>1) strPiloto = "pilotos"; else strPiloto = "piloto";
            if (pista>1)  strPista  = "pistas"; else strPista = "pista";
            if (equipe>1) strEquipe = "equipes"; else strEquipe = "equipe";
            if (motor>1) strMotor   = "motores"; else strMotor = "motor";
            return "\nExistem "+equipe+" "+strEquipe+", "+motor+" "+strMotor+", "+piloto+" "+strPiloto+" e "+pista+" "+strPista+"\n"
                    + "cadastrados com este País!";
        }        
        
    }

    /**Verifica se os dados de um registro Motor tem pendências na tabela
     * EQUIPEANO
     * @param motor
     * @return
     */
    public static String verMotor(Motor motor) {
        String retorno = null;
        int equipeano = 0;

        String sqlEquipeAno = "SELECT * FROM `equipeano` WHERE `Motor_Id`=" + motor.getMotorId(); 
        try {
            Connection con = Factory.conectar();
            Statement stmt = con.createStatement();
            ResultSet rs = null;
            
            rs = con.createStatement().executeQuery(sqlEquipeAno);            
            if (rs.next()) {
                rs.last();
                equipeano = rs.getRow();                
            }                                    
            stmt.close();
            con.close();                        
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
        
        if (equipeano == 0) {
            return "";
        } else {
            String strEquipeAno="";            
            if (equipeano>1) strEquipeAno = "Equipes em Temporada"; else strEquipeAno = "Equipe em Temporada";
            return "\nExiste(m) "+equipeano+" " +strEquipeAno+".\n"
                    + "cadastrados com este Motor!";
        }        
        
    }

    /**Verifica se os dados de um registro Motor tem pendências nas tabelas
     * EQUIPEANO e CONTRATO
     * @param equipe
     * @return
     */
    public static String verEquipe(Equipe equipe) {
        return "NÃO IMPLEMENTADO";
    }

    /**Verifica se os dados de um registro Motor tem pendências nas tabelas
     * QUAIS????
     * @param pontos
     * @return
     */
    public static String verPontos(Pontos pontosTemp) {
        return "NÃO IMPLEMENTADO";
    }
}