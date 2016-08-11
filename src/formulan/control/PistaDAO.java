package formulan.control;

import formulan.access.Factory;
import formulan.model.Pista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PistaDAO implements DAOBasico {
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private String sql;
    private PreparedStatement pstmt;
   
    @Override
    public void inserir(Object objeto) {
        Pista pista = (Pista)objeto;
        
        String pistaNome = pista.getPistaNome();
        String pistaCidade = pista.getPistaCidade();
        Integer paisId = pista.getPaisId();
        byte[] pistaTracado = pista.getPistaTracado();
        Double pistaKm = pista.getPistaKm();
        Date pistaRecorde = pista.getPistaRecorde();
        Integer pilotoId = pista.getPilotoId();
        byte[] pistaObs = pista.getPistaObs();
        
        String prepSQL = "INSERT INTO `pista`(`Pista_Nome`, `Pista_Cidade`, `Pais_Id`, `Pista_Tracado`, `Pista_Km`, `Pista_Recorde`, `Piloto_Id`, `Pista_Obs`) "
                                   + "VALUES (?,?,?,?,?,?,?,?)";
        try {
            con = Factory.conectar();            
            pstmt = con.prepareStatement(prepSQL);

            pstmt.setString(1, pistaNome);
            pstmt.setString(2, pistaCidade);
            pstmt.setInt(3, paisId);
            pstmt.setBytes(4, pistaTracado);
            pstmt.setDouble(5, pistaKm);
            pstmt.setDate(6, (java.sql.Date) pistaRecorde); 
            pstmt.setInt(7, pilotoId);         
            pstmt.setBytes(8, pistaObs);
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }                
        
    }

    @Override
    public void editar(Object objeto) {
        Pista pista = (Pista)objeto;
        
        Integer pistaId = pista.getPistaId();
        String pistaNome = pista.getPistaNome();
        String pistaCidade = pista.getPistaCidade();
        Integer paisId = pista.getPaisId();
        byte[] pistaTracado = pista.getPistaTracado();
        Double pistaKm = pista.getPistaKm();
        Date pistaRecorde = pista.getPistaRecorde();
        Integer pilotoId = pista.getPilotoId();
        byte[] pistaObs = pista.getPistaObs();

        String prepSQL = "UPDATE `pista` SET "
                      + "`Pista_Nome`=?,"
                      + "`Pista_Cidade`=?,"
                      + "`Pais_Id`=?,"
                      + "`Pista_Tracado`=?,"
                      + "`Pista_Km`=?,"
                      + "`Pista_Recorde`=?,"
                      + "`Piloto_Id`=?,"
                      + "`Pista_Obs`=? "
                + "WHERE `Pista_Id`=?";
        
        try {
            con = Factory.conectar();            
            pstmt = con.prepareStatement(prepSQL);

            pstmt.setString(1, pistaNome);
            pstmt.setString(2, pistaCidade);
            pstmt.setInt(3, paisId);
            pstmt.setBytes(4, pistaTracado);
            pstmt.setDouble(5, pistaKm);
            pstmt.setDate(6, null); //CODIFICAR
            pstmt.setInt(7, pilotoId);         
            pstmt.setBytes(8, pistaObs);
            pstmt.setInt(9, pistaId);
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }                
         
    }

    public void excluir(int pistaId) {
        String prepSQL = "DELETE FROM `pista` WHERE `Pista_Id`=?";                
        try {
            con = Factory.conectar();            
            PreparedStatement pstmt = con.prepareStatement(prepSQL);            
            pstmt.setInt(1, pistaId);            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }                                
    }

    @Override
    public Pista getObjetoById(int pistaId) {
        sql = "SELECT * FROM `pista` WHERE `Pista_Id`=" + pistaId; 
        Pista pistaTemp = new Pista();

        try {
            con = Factory.conectar();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            
            rs.next(); //ponteiro no primeiro. Só vai ter um mesmo                         
            pistaTemp.setPistaId(rs.getInt("Pista_Id"));
            pistaTemp.setPistaNome(rs.getString("Pista_Nome"));
            pistaTemp.setPistaCidade(rs.getString("Pista_Cidade"));
            pistaTemp.setPaisId(rs.getInt("Pais_Id"));
            pistaTemp.setPistaTracado(rs.getBytes("Pista_Tracado"));
            pistaTemp.setPistaKm(rs.getDouble("Pista_Km"));
            pistaTemp.setPistaRecorde(rs.getTime("Pista_Recorde"));
            pistaTemp.setPilotoId(rs.getInt("Piloto_Id"));
            pistaTemp.setPistaObs(rs.getBytes("Pista_Obs"));
            
            return pistaTemp;
            
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
        
        return null;
    }

    @Override
    public List<Object> listaBusca(String textoBusca) {
        sql = "SELECT * FROM `pista` WHERE `Pista_Nome` LIKE '%"+textoBusca+"%'";
 
        List<Pista> lista = new ArrayList<Pista>();
        
        try {
            con = Factory.conectar();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Pista pistaTemp = new Pista();

                pistaTemp.setPistaId(rs.getInt("Pista_Id"));
                pistaTemp.setPistaNome(rs.getString("Pista_Nome"));
                pistaTemp.setPistaCidade(rs.getString("Pista_Cidade"));
                pistaTemp.setPaisId(rs.getInt("Pais_Id"));
                pistaTemp.setPistaTracado(rs.getBytes("Pista_Tracado"));
                pistaTemp.setPistaKm(rs.getDouble("Pista_Km"));
                pistaTemp.setPistaRecorde(rs.getTime("Pista_Recorde"));
                pistaTemp.setPilotoId(rs.getInt("Piloto_Id"));
                pistaTemp.setPistaObs(rs.getBytes("Pista_Obs"));
                
                lista.add(pistaTemp);
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
