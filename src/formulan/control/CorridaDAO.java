package formulan.control;

import formulan.access.Factory;
import formulan.model.Corrida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CorridaDAO implements DAOBasico {
    
    private String prepSQL;
    private String sql;
    private Statement stmt;
    private Connection con;
    private ResultSet rs;
    private PreparedStatement pstmt;    
    

    @Override
    public void inserir(Object objeto) {
        Corrida corrida = (Corrida)objeto;

        this.prepSQL="INSERT INTO `corrida`(`Corrida_GP`, `Pista_Id`, `Corrida_Data`, `Temp_Ano`, `Corrida_Metade`, `Corrida_Num`) "
                                 + "VALUES (?,?,?,?,?,?)";
        
        executarUpdate(corrida);
    }

    @Override
    public void editar(Object objeto) {
        Corrida corrida = (Corrida)objeto;

        this.prepSQL="UPDATE `corrida` SET "
                + "`Corrida_GP`=?,"
                + "`Pista_Id`=?,"
                + "`Corrida_Data`=?,"
                + "`Temp_Ano`=?,"
                + "`Corrida_Metade`=? "
                + "WHERE Corrida_Num`=?";
        
        executarUpdate(corrida);
    }

    @Override
    public void excluir(int id) {
        this.prepSQL = "DELETE FROM `corrida` WHERE `Corrida_Num`=" + id;
        
        executarUpdate(null);
    }

    @Override
    public Object getObjetoById(int id) {
        this.sql = "SELECT * FROM `corrida` WHERE `Corrida_Num`=" + id; 
        Corrida corridaTemp = new Corrida();
        
        try {
            this.con = Factory.conectar();
            this.stmt = con.createStatement();
            this.rs = stmt.executeQuery(this.sql);
            
            rs.next();
            corridaTemp.setCorridaNum(rs.getInt("Corrida_Num"));
            corridaTemp.setCorridaGP(rs.getString("Corrida_GP"));
            corridaTemp.setPistaId(rs.getInt("Pista_Id"));
            corridaTemp.setCorridaData(rs.getDate("Corrida_Data"));
            corridaTemp.setTempAno(rs.getShort("Temp_Ano"));
            corridaTemp.setCorridaMetade(rs.getBoolean("Corrida_Metade"));
        
            return corridaTemp;            
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
        
        return null;
    }

    @Override
    /*Um pouco modificado, busca pelo Ano da temporada*/
    public List<Object> listaBusca(String textoBusca) {        
        this.sql = "SELECT * FROM `corrida` WHERE `Temp_Ano` LIKE '%"+textoBusca+"%'";        
        List<Corrida> lista = new ArrayList<Corrida>();

        try {
            this.con = Factory.conectar();
            this.stmt = con.createStatement();
            this.rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Corrida corridaTemp = new Corrida();
                corridaTemp.setCorridaNum(rs.getInt("Corrida_Num"));
                corridaTemp.setCorridaGP(rs.getString("Corrida_GP"));
                corridaTemp.setPistaId(rs.getInt("Pista_Id"));
                corridaTemp.setCorridaData(rs.getDate("Corrida_Data"));
                corridaTemp.setTempAno(rs.getShort("Temp_Ano"));
                corridaTemp.setCorridaMetade(rs.getBoolean("Corrida_Metade"));
                
                lista.add(corridaTemp);
            }
            return (List)lista;
        } catch (SQLException ex) {
            System.out.println(ex);
        }                       

        return null;
    }    

    @Override
    public void executarUpdate(Object objeto) {
        Integer corridaNum = null;
        String corridaGP = null;
        Date corridaData = null;
        Integer pistaId = null;
        Short tempAno = null;
        Boolean corridaMetade = null;
        
        if (objeto != null) { //INSERIR ou EDITAR (null é Excluir)
            Corrida corrida = (Corrida)objeto;

            corridaNum = corrida.getCorridaNum();
            corridaGP = corrida.getCorridaGP();
            corridaData = corrida.getCorridaData();
            pistaId = corrida.getPistaId();
            tempAno = corrida.getTempAno();
            corridaMetade = corrida.getCorridaMetade();
        }
        
        try {        
            this.con = Factory.conectar();
            this.pstmt = con.prepareStatement(this.prepSQL);

            if (objeto != null) { //INSERIR ou EDITAR (null é Excluir, não seta variáveis)
                //pstmt.setShort(1, tempAno);
                
                pstmt.setString(1, corridaGP);
                pstmt.setInt(2, pistaId);           
                pstmt.setDate(3, (java.sql.Date) corridaData);
                pstmt.setShort(4, tempAno);
                pstmt.setBoolean(5, corridaMetade);
                if (corridaNum!=null) pstmt.setInt(6, corridaNum);
            }
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }            
        
    }
}