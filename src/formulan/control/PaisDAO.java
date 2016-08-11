package formulan.control;

import formulan.access.Factory;
import formulan.model.Pais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PaisDAO implements DAOBasico {    
    private Connection con;
    private Statement stmt;
    private String sql;
    private String prepSQL;
    private PreparedStatement pstmt;
    ResultSet rs;

    @Override
    public void inserir(Object objeto) {
        Pais pais = (Pais)objeto;
        
        this.prepSQL = "INSERT INTO `pais`(`Pais_Nome`, `Pais_Sigla`, `Pais_BandeiraMini`, `Pais_BandeiraMaior`) "
                + "VALUES (?, ?, ?, ?)";

        executarUpdate(pais);
    }

    @Override
    public void editar(Object objeto) {
        Pais pais = (Pais)objeto;

        this.prepSQL = "UPDATE `pais` SET `Pais_Nome`=?,"
                + "`Pais_Sigla`=?,"
                + "`Pais_BandeiraMini`=?,"
                + "`Pais_BandeiraMaior`=? "
                + "WHERE `Pais_Id`=?";

        executarUpdate(pais);
    }

    @Override
    public void excluir(int id) {
        this.prepSQL = "DELETE FROM `pais` WHERE `Pais_Id`=" + id;
        
        executarUpdate(null);
    }    
    
    @Override
    public void executarUpdate(Object objeto) {
        Integer paisId=null;
        String paisNome="";
        String paisSigla="";
        byte[] paisBandeiraMini=null;
        byte[] paisBandeiraMaior=null;
                
        if (objeto != null) { //INSERIR ou EDITAR (null é Excluir)
            Pais pais = (Pais) objeto;

            paisId = pais.getPaisId();
            paisNome = pais.getPaisNome();
            paisSigla = pais.getPaisSigla();
            paisBandeiraMini = pais.getPaisBandeiraMini();
            paisBandeiraMaior = pais.getPaisBandeiraMaior();
        }
        
        try {        
            con = Factory.conectar();
            pstmt = con.prepareStatement(this.prepSQL);

            if (objeto != null) { //INSERIR ou EDITAR (null é Excluir, não sera variáveis)
                pstmt.setString(1, paisNome);
                pstmt.setString(2, paisSigla);
                pstmt.setBytes(3, paisBandeiraMini);
                pstmt.setBytes(4, paisBandeiraMaior);          
                if (paisId!=null) pstmt.setInt(5, paisId); //EDITAR       
            }
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }            
    }    
    
    
    @Override
    public List<Object> listaBusca(String textoBusca) {
        sql = "SELECT * FROM `pais` WHERE `Pais_Nome` LIKE '%"+textoBusca+"%'";
        List<Pais> lista = new ArrayList<Pais>();
        
        try {
            con = Factory.conectar();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {             
                Pais paisTemp = new Pais();
                
                paisTemp.setPaisId(rs.getInt("Pais_Id")); 
                paisTemp.setPaisNome(rs.getString("Pais_Nome")); 
                paisTemp.setPaisSigla(rs.getString("Pais_Sigla"));
                paisTemp.setPaisBandeiraMini(rs.getBytes("Pais_BandeiraMini"));
                paisTemp.setPaisBandeiraMaior(rs.getBytes("Pais_BandeiraMaior"));                
                lista.add(paisTemp);
            }
            return (List)lista;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
    @Override
    public Pais getObjetoById (int id) {
        sql = "SELECT * FROM `pais` WHERE `Pais_Id`=" + id; 
        Pais paisTemp = new Pais();

        try {
            con = Factory.conectar();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            
            rs.next(); //ponteiro no primeiro. Só vai ter um mesmo 
            paisTemp.setPaisId(rs.getInt("Pais_Id"));
            paisTemp.setPaisNome(rs.getString("Pais_Nome"));
            paisTemp.setPaisSigla(rs.getString("Pais_Sigla"));
            paisTemp.setPaisBandeiraMini(rs.getBytes("Pais_BandeiraMini"));
            paisTemp.setPaisBandeiraMaior(rs.getBytes("Pais_BandeiraMaior"));
            return paisTemp;
            
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
        
        return null;
    }    
}