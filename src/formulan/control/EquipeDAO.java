package formulan.control;

import formulan.access.Factory;
import static formulan.access.Factory.con;
import formulan.model.Equipe;
import formulan.model.Pais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EquipeDAO implements DAOBasico {

    private String prepSQL;
    private String sql;
    private Statement stmt;
    private Connection con;
    private ResultSet rs;
    private PreparedStatement pstmt;

    @Override
    public void inserir(Object objeto) {
        Equipe equipe = (Equipe)objeto;
        
        this.prepSQL = "INSERT INTO `equipe`(`Equipe_Nome`, `Pais_Id`, `Equipe_OrigemId`, `Equipe_AnoInicio`, `Equipe_AnoFim`, `Equipe_Obs`, `Equipe_Logo`) "
                + "VALUES (?,?,?,?,?,?,?)";

        executarUpdate(equipe);
    }

    @Override
    public void editar(Object objeto) {
        Equipe equipe = (Equipe)objeto;

        this.prepSQL = "UPDATE `equipe` SET "
                + "`Equipe_Nome`=?,"
                + "`Pais_Id`=?,"
                + "`Equipe_OrigemId`=?,"
                + "`Equipe_AnoInicio`=?,"
                + "`Equipe_AnoFim`=?,"
                + "`Equipe_Obs`=?, "
                + "`Equipe_Logo`=? "
                + "WHERE `Equipe_Id`=? ";
        
        executarUpdate(equipe);
    }

    @Override
    public void excluir(int id) {
        this.prepSQL = "DELETE FROM `equipe` WHERE `Equipe_Id`=" + id;
        
        executarUpdate(null);
    }

    @Override
    public Object getObjetoById(int id) {
        this.sql = "SELECT * FROM `equipe` WHERE `Equipe_Id`=" + id; 
        Equipe equipeTemp = new Equipe();

        try {
            this.con = Factory.conectar();
            this.stmt = con.createStatement();
            this.rs = stmt.executeQuery(sql);
            
            rs.next(); //ponteiro no primeiro. Só vai ter um mesmo 
            equipeTemp.setEquipeId(rs.getInt("Equipe_Id"));
            equipeTemp.setEquipeNome(rs.getString("Equipe_Nome"));
            equipeTemp.setEquipeOrigemId(rs.getInt("Equipe_OrigemId"));
            equipeTemp.setEquipeAnoInicio(rs.getShort("Equipe_AnoInicio"));
            equipeTemp.setEquipeAnoFim(rs.getShort("Equipe_AnoFim"));
            equipeTemp.setEquipeObs(rs.getBytes("Equipe_Obs"));
            equipeTemp.setEquipeLogo(rs.getBytes("Equipe_Logo"));
            equipeTemp.setPaisId(rs.getInt("Pais_Id"));
            
            return equipeTemp;            
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
        
        return null;   
    }

    @Override
    public List<Object> listaBusca(String textoBusca) {
        this.sql = "SELECT * FROM `equipe` WHERE `Equipe_Nome` LIKE '%"+textoBusca+"%'";
        List<Equipe> lista = new ArrayList<Equipe>();

        try {            
            this.con = Factory.conectar();
            this.stmt = con.createStatement();
            this.rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Equipe equipeTemp = new Equipe();
                
                equipeTemp.setEquipeId(rs.getInt("Equipe_Id"));
                equipeTemp.setEquipeNome(rs.getString("Equipe_Nome"));
                equipeTemp.setEquipeOrigemId(rs.getInt("Equipe_OrigemId"));
                equipeTemp.setEquipeAnoInicio(rs.getShort("Equipe_AnoInicio"));
                equipeTemp.setEquipeAnoFim(rs.getShort("Equipe_AnoFim"));
                equipeTemp.setEquipeObs(rs.getBytes("Equipe_Obs"));
                equipeTemp.setEquipeLogo(rs.getBytes("Equipe_Logo"));
                equipeTemp.setPaisId(rs.getInt("Pais_Id"));
                lista.add(equipeTemp);
            }
            return (List)lista;
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
        
        return null;        
    }

    @Override
    public void executarUpdate(Object objeto) {
        Integer equipeId = null;
        String equipeNome = "";
        Integer equipeOrigemId = null;
        Short equipeAnoInicio = null;
        Short equipeAnoFim = null;
        byte[] equipeObs = null;
        byte[] equipeLogo = null;
        Integer paisId = null;
        
        if (objeto != null) { //INSERIR ou EDITAR (null é Excluir)
            Equipe equipe = (Equipe) objeto;
            
            equipeId = equipe.getEquipeId();
            equipeNome = equipe.getEquipeNome();
            equipeOrigemId = equipe.getEquipeOrigemId();
            equipeAnoInicio = equipe.getEquipeAnoInicio();
            equipeAnoFim = equipe.getEquipeAnoFim();
            equipeObs = equipe.getEquipeObs();
            equipeLogo = equipe.getEquipeLogo();
            paisId = equipe.getPaisId();            
        }
        
        try {        
            this.con = Factory.conectar();
            this.pstmt = con.prepareStatement(this.prepSQL);

            if (objeto != null) { //INSERIR ou EDITAR (null é Excluir, não terá variáveis)
                pstmt.setString(1, equipeNome);
                pstmt.setInt(2, paisId);
                pstmt.setInt(3, equipeOrigemId);
                pstmt.setShort(4, equipeAnoInicio);
                pstmt.setShort(5, equipeAnoFim);
                pstmt.setBytes(6, equipeObs);
                pstmt.setBytes(7, equipeLogo);
                if (equipeId!=null) pstmt.setInt(8, equipeId); //EDITAR       
            }
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }                    
    }

}