package formulan.control;

import formulan.access.Factory;
import formulan.model.Temporada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TemporadaDAO implements DAOBasico {
    
    private String prepSQL;
    private String sql;
    private Statement stmt;
    private Connection con;
    private ResultSet rs;
    private PreparedStatement pstmt;    

    @Override
    public void inserir(Object objeto) {
        Temporada temporada = (Temporada)objeto;
        
        this.prepSQL="INSERT INTO `temporada`(`Temp_Obs`, `Pontos_Regra`, `Temp_Ano`) "
                                   + "VALUES ([?,?,?)";
        
        executarUpdate(temporada);
    }

    @Override
    public void editar(Object objeto) {
        Temporada temporada = (Temporada)objeto;
        
        this.prepSQL="UPDATE `temporada` SET "
                + "`Temp_Obs`=?,"
                + "`Pontos_Regra`=? "
                + "WHERE Temp_Ano`=?";
        
        executarUpdate(temporada);
    }

    @Override
    public void excluir(int id) {
        this.prepSQL = "DELETE FROM `temporada` WHERE `Temp_Ano`=" + id;
        
        executarUpdate(null);
    }

    @Override
    public Object getObjetoById(int id) {
        this.sql = "SELECT * FROM `temporada` WHERE `Temp_Ano`=" + id; 
        Temporada temporadaTemp = new Temporada();
        
        try {
            this.con = Factory.conectar();
            this.stmt = con.createStatement();
            this.rs = stmt.executeQuery(this.sql);
            
            rs.next(); //ponteiro no primeiro. Só vai ter um mesmo 
            temporadaTemp.setTempAno(rs.getShort("Temp_Ano"));
            temporadaTemp.setTempObs(rs.getBytes("Temp_Obs"));
            temporadaTemp.setPontosRegra(rs.getShort("Pontos_Regra"));
        
            return temporadaTemp;            
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
        
        return null;
    }

    @Override
    public List<Object> listaBusca(String textoBusca) {
        this.sql = "SELECT * FROM `temporada` WHERE `Temp_Ano` LIKE '%"+textoBusca+"%'";        
        List<Temporada> lista = new ArrayList<Temporada>();

        try {
            this.con = Factory.conectar();
            this.stmt = con.createStatement();
            this.rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Temporada temporadaTemp = new Temporada();
                temporadaTemp.setTempAno(rs.getShort("Temp_Ano"));
                temporadaTemp.setTempObs(rs.getBytes("Temp_Obs"));
                temporadaTemp.setPontosRegra(rs.getShort("Pontos_Regra"));
                
                lista.add(temporadaTemp);
            }
            return (List)lista;
        } catch (SQLException ex) {
            System.out.println(ex);
        }                       
        return null;
    }

    @Override
    public void executarUpdate(Object objeto) {
        Short tempAno = null;
        byte[] tempObs = null;
        Short pontosRegra = null;

                
        if (objeto != null) { //INSERIR ou EDITAR (null é Excluir)
            Temporada temporada = (Temporada)objeto;

            tempAno = temporada.getTempAno();
            tempObs = temporada.getTempObs();
            pontosRegra = temporada.getPontosRegra();
        }
        
        try {        
            this.con = Factory.conectar();
            this.pstmt = con.prepareStatement(this.prepSQL);

            if (objeto != null) { //INSERIR ou EDITAR (null é Excluir, não seta variáveis)
                pstmt.setShort(1, tempAno);
                pstmt.setBytes(2, tempObs);
                if (tempAno!=null) pstmt.setShort(3, tempAno);
            }
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }            
    }
    
}