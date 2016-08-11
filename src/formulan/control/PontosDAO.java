package formulan.control;

import formulan.access.Factory;
import static formulan.access.Factory.con;
import formulan.model.Pontos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PontosDAO implements DAOBasico{
    private String prepSQL;
    private String sql;
    private Connection con;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;

    @Override
    public void inserir(Object objeto) {
        Pontos pontos = (Pontos)objeto;
        
        this.prepSQL = "INSERT INTO `pontos`(`Pontos_1`, `Pontos_2`, `Pontos_3`, `Pontos_4`, `Pontos_5`, `Pontos_6`, `Pontos_7`, `Pontos_8`, `Pontos_9`, `Pontos_10`, `Pontos_Regra`) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";        
        
        executarUpdate(pontos);        
    }

    @Override
    public void editar(Object objeto) {
        Pontos pontos = (Pontos)objeto;
        
        this.prepSQL = "UPDATE `pontos` SET "
                + "`Pontos_1`=?,"
                + "`Pontos_2`=?,"
                + "`Pontos_3`=?,"
                + "`Pontos_4`=?,"
                + "`Pontos_5`=?,"
                + "`Pontos_6`=?,"
                + "`Pontos_7`=?,"
                + "`Pontos_8`=?,"
                + "`Pontos_9`=?,"
                + "`Pontos_10`=? "
                + "WHERE `Pontos_Regra`=?";

        executarUpdate(pontos);
    }

    @Override
    public void excluir(int id) {
        this.prepSQL = "DELETE FROM `pontos` WHERE `Pontos_Regra`=" + id;
        
        executarUpdate(null);
    }

    @Override
    public Object getObjetoById(int id) {
        this.prepSQL = "SELECT * FROM `pontos` WHERE `Pontos_Regra`=" + id; 
        Pontos pontosTemp = new Pontos();
        
        try {
            this.con = Factory.conectar();
            this.stmt = con.createStatement();
            this.rs = stmt.executeQuery(this.prepSQL);
            
            rs.next(); //ponteiro no primeiro. Só vai ter um mesmo 
            pontosTemp.setPontosRegra(rs.getShort("Pontos_Regra"));           
            pontosTemp.setPontos1(rs.getShort("Pontos_1"));           
            pontosTemp.setPontos2(rs.getShort("Pontos_2"));           
            pontosTemp.setPontos3(rs.getShort("Pontos_3"));           
            pontosTemp.setPontos4(rs.getShort("Pontos_4"));           
            pontosTemp.setPontos5(rs.getShort("Pontos_5"));           
            pontosTemp.setPontos6(rs.getShort("Pontos_6"));           
            pontosTemp.setPontos7(rs.getShort("Pontos_7"));           
            pontosTemp.setPontos8(rs.getShort("Pontos_8"));           
            pontosTemp.setPontos9(rs.getShort("Pontos_9"));           
            pontosTemp.setPontos10(rs.getShort("Pontos_10"));           
        
            return pontosTemp;            
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
        
        return null;
    }

    @Override
    public List<Object> listaBusca(String textoBusca) {
        this.sql = "SELECT * FROM `pontos` WHERE `Pontos_Regra` LIKE '%"+textoBusca+"%'";        
        List<Pontos> lista = new ArrayList<Pontos>();

        try {
            this.con = Factory.conectar();
            this.stmt = con.createStatement();
            this.rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Pontos pontosTemp = new Pontos();
                pontosTemp.setPontosRegra(rs.getShort("Pontos_Regra"));
                pontosTemp.setPontos1(rs.getShort("Pontos_1"));
                pontosTemp.setPontos2(rs.getShort("Pontos_2"));
                pontosTemp.setPontos3(rs.getShort("Pontos_3"));
                pontosTemp.setPontos4(rs.getShort("Pontos_4"));
                pontosTemp.setPontos5(rs.getShort("Pontos_5"));
                pontosTemp.setPontos6(rs.getShort("Pontos_6"));
                pontosTemp.setPontos7(rs.getShort("Pontos_7"));
                pontosTemp.setPontos8(rs.getShort("Pontos_8"));
                pontosTemp.setPontos9(rs.getShort("Pontos_9"));
                pontosTemp.setPontos10(rs.getShort("Pontos_10"));
                
                lista.add(pontosTemp);
            }
            return (List)lista;
        } catch (SQLException ex) {
            System.out.println(ex);
        }                       
        return null;
    }

    @Override
    public void executarUpdate(Object objeto) {
        Short pontosRegra = null;
        Short pontos1 = null;
        Short pontos2 = null;
        Short pontos3 = null;
        Short pontos4 = null;
        Short pontos5 = null;
        Short pontos6 = null;
        Short pontos7 = null;
        Short pontos8 = null;
        Short pontos9 = null;
        Short pontos10 = null;
                
        if (objeto != null) { //INSERIR ou EDITAR (null é Excluir)
            Pontos pontos = (Pontos) objeto;

            pontosRegra = pontos.getPontosRegra();
            pontos1 = pontos.getPontos1();
            pontos2 = pontos.getPontos2();
            pontos3 = pontos.getPontos3();
            pontos4 = pontos.getPontos4();
            pontos5 = pontos.getPontos5();
            pontos6 = pontos.getPontos6();
            pontos7 = pontos.getPontos7();
            pontos8 = pontos.getPontos8();
            pontos9 = pontos.getPontos9();
            pontos10 = pontos.getPontos10();
        }
        
        try {        
            this.con = Factory.conectar();
            this.pstmt = con.prepareStatement(this.prepSQL);

            if (objeto != null) { //INSERIR ou EDITAR (null é Excluir, não seta variáveis)
                pstmt.setShort(1, pontos1);
                pstmt.setShort(2, pontos2);
                pstmt.setShort(3, pontos3);
                pstmt.setShort(4, pontos4);
                pstmt.setShort(5, pontos5);
                pstmt.setShort(6, pontos6);
                pstmt.setShort(7, pontos7);
                pstmt.setShort(8, pontos8);
                pstmt.setShort(9, pontos9);
                pstmt.setShort(10, pontos10);
                if (pontosRegra!=null) pstmt.setShort(11, pontosRegra);
            }
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }            
    }
    
}