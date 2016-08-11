package formulan.control;

import formulan.access.Factory;
import formulan.model.Piloto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PilotoDAO implements DAOBasico {
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private String sql;
    private String prepSQL;
    private PreparedStatement pstmt;

    @Override
    public void inserir(Object objeto) {
        Piloto piloto = (Piloto) objeto;
        
        String pilotoNome = piloto.getPilotoNome();
        String pilotoSobrenome = piloto.getPilotoSobrenome();
        Integer paisId = piloto.getPaisId();
        String pilotoSigla = piloto.getPilotoSigla();
        Integer pilotoNum = piloto.getPilotoNum();
        byte[] pilotoObs = piloto.getPilotoObs();
        byte[] pilotoCapacete = piloto.getPilotoCapacete();
        byte[] pilotoFoto = piloto.getPilotoFoto();   
        Date pilotoDtNasc = piloto.getPilotoDtNasc();
        Boolean pilotoFalecido = piloto.getPilotoFalecido();
        
        prepSQL = "INSERT INTO `piloto`(`Piloto_Nome`, `Piloto_Sobrenome`, `Piloto_Sigla`, `Pais_Id`, "
                                     + "`Piloto_Num`, `Piloto_Foto`, `Piloto_Capacete`, `Piloto_Obs`,"
                                     + "`Piloto_DtNasc`,`Piloto_Falecido`) "
                             + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        try {
            con = Factory.conectar();            
            pstmt = con.prepareStatement(prepSQL);

            pstmt.setString(1, pilotoNome);
            pstmt.setString(2, pilotoSobrenome);
            pstmt.setString(3, pilotoSigla);
            pstmt.setInt(4, paisId);
            pstmt.setInt(5, pilotoNum);
            pstmt.setBytes(6, pilotoFoto);
            pstmt.setBytes(7, pilotoCapacete);
            pstmt.setBytes(8, pilotoObs);
            pstmt.setDate(9, (java.sql.Date) pilotoDtNasc);
            pstmt.setBoolean(10, pilotoFalecido);
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }                
        
    }

    @Override
    public void editar(Object objeto) {
        Piloto piloto = (Piloto) objeto;
        
        Integer pilotoId = piloto.getPilotoId();        
        String pilotoNome = piloto.getPilotoNome();
        String pilotoSobrenome = piloto.getPilotoSobrenome();
        Integer paisId = piloto.getPaisId();
        String pilotoSigla = piloto.getPilotoSigla();
        Integer pilotoNum = piloto.getPilotoNum();
        byte[] pilotoObs = piloto.getPilotoObs();
        byte[] pilotoCapacete = piloto.getPilotoCapacete();
        byte[] pilotoFoto = piloto.getPilotoFoto();        
        Date pilotoDtNasc = piloto.getPilotoDtNasc();
        Boolean pilotoFalecido = piloto.getPilotoFalecido();
        
        prepSQL = "UPDATE `piloto` SET "
                + "`Piloto_Nome`=?,"
                + "`Piloto_Sobrenome`=?,"
                + "`Pais_Id`=?,"
                + "`Piloto_Sigla`=?,"
                + "`Piloto_Num`=?,"
                + "`Piloto_Obs`=?,"
                + "`Piloto_Foto`=?,"
                + "`Piloto_Capacete`=?,"
                + "`Piloto_DtNasc`=?,"
                + "`Piloto_Falecido`=? "
                + "WHERE "
                + "`Piloto_Id`=?";
        
        try {
            con = Factory.conectar();            
            pstmt = con.prepareStatement(prepSQL);

            pstmt.setString(1, pilotoNome);
            pstmt.setString(2, pilotoSobrenome);
            pstmt.setInt(3, paisId);
            pstmt.setString(4, pilotoSigla);
            pstmt.setInt(5, pilotoNum);
            pstmt.setBytes(6, pilotoObs);
            pstmt.setBytes(7, pilotoFoto);
            pstmt.setBytes(8, pilotoCapacete);
            pstmt.setDate(9, (java.sql.Date) pilotoDtNasc);
            pstmt.setBoolean(10, pilotoFalecido);
            pstmt.setInt(11, pilotoId);
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }            
    }

    @Override
    public void excluir(int id) {
        String prepSQL = "DELETE FROM `piloto` WHERE `Piloto_Id`=?";                
        try {
            con = Factory.conectar();            
            pstmt = con.prepareStatement(prepSQL);            
            pstmt.setInt(1, id);            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }                                
    }

    @Override
    public Object getObjetoById(int id) {
        sql = "SELECT * FROM `piloto` WHERE `Piloto_Id`=" + id; 
        Piloto pilotoTemp = new Piloto();

        try {
            con = Factory.conectar();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            
            rs.next(); //ponteiro no primeiro. Só vai ter um mesmo                         
            pilotoTemp.setPilotoId(rs.getInt("Piloto_Id"));
            pilotoTemp.setPilotoNum(rs.getInt("Piloto_Num"));
            pilotoTemp.setPilotoNome(rs.getString("Piloto_Nome"));
            pilotoTemp.setPilotoSobrenome(rs.getString("Piloto_Sobrenome"));
            pilotoTemp.setPilotoSigla(rs.getString("Piloto_Sigla"));
            pilotoTemp.setPaisId(rs.getInt("Pais_Id"));
            pilotoTemp.setPilotoFoto(rs.getBytes("Piloto_Foto"));
            pilotoTemp.setPilotoCapacete(rs.getBytes("Piloto_Capacete"));
            pilotoTemp.setPilotoObs(rs.getBytes("Piloto_Obs"));
            pilotoTemp.setPilotoDtNasc(rs.getDate("Piloto_DtNasc"));
            pilotoTemp.setPilotoFalecido(rs.getBoolean("Piloto_Falecido"));
                     
            return pilotoTemp;
            
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
        
        return null;
    }

    @Override
    public List<Object> listaBusca(String textoBusca) {
        sql = "SELECT * FROM `piloto` WHERE `Piloto_Nome` LIKE '%"+textoBusca+"%'";        
        List<Piloto> lista = new ArrayList<Piloto>();
        
        try {
            this.con = Factory.conectar();
            this.stmt = con.createStatement();
            this.rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Piloto pilotoTemp = new Piloto();
                pilotoTemp.setPilotoId(rs.getInt("Piloto_Id"));
                pilotoTemp.setPilotoNum(rs.getInt("Piloto_Num"));
                pilotoTemp.setPilotoNome(rs.getString("Piloto_Nome"));
                pilotoTemp.setPilotoSobrenome(rs.getString("Piloto_Sobrenome"));
                pilotoTemp.setPilotoSigla(rs.getString("Piloto_Sigla"));
                pilotoTemp.setPaisId(rs.getInt("Pais_Id"));
                pilotoTemp.setPilotoFoto(rs.getBytes("Piloto_Foto"));
                pilotoTemp.setPilotoCapacete(rs.getBytes("Piloto_Capacete"));
                pilotoTemp.setPilotoObs(rs.getBytes("Piloto_Obs"));
                pilotoTemp.setPilotoDtNasc(rs.getDate("Piloto_DtNasc"));
                pilotoTemp.setPilotoFalecido(rs.getBoolean("Piloto_Falecido"));
                
                lista.add(pilotoTemp);
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