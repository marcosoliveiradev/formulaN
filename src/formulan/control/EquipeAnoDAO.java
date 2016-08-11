package formulan.control;

import formulan.access.Factory;
import formulan.model.EquipeAno;
import formulan.model.EquipeAnoPK;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EquipeAnoDAO implements DAOBasico {

    private String prepSQL;
    private String sql;
    private Statement stmt;
    private Connection con;
    private ResultSet rs;
    private PreparedStatement pstmt;    

    @Override
    public void inserir(Object objeto) {
        EquipeAno equipeAno = (EquipeAno)objeto;

        this.prepSQL="INSERT INTO `equipeano`(`EquipeAno_Carro`, `EquipeAno_Sponsor`, `EquipeAno_Cor1`, `EquipeAno_Cor2`, `EquipeAno_Cor3`, `Motor_Id`, `EquipeAno_Potencia`, `EquipeAno_Chefe`, `EquipeAno_Projetista`, `EquipeAno_Obs`, `EquipeAno_Foto`, `EquipeAno_Foto2`,`Equipe_Id`, `Temp_Ano`) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        executarUpdate(equipeAno);
    }

    @Override
    public void editar(Object objeto) {
        EquipeAno equipeAno = (EquipeAno)objeto;

        this.prepSQL="UPDATE `equipeano` SET "
                + "`EquipeAno_Carro`=?,"
                + "`EquipeAno_Sponsor`=?,"
                + "`EquipeAno_Cor1`=?,"
                + "`EquipeAno_Cor2`=?,"
                + "`EquipeAno_Cor3`=?,"
                + "`Motor_Id`=?,"
                + "`EquipeAno_Potencia`=?,"
                + "`EquipeAno_Chefe`=?,"
                + "`EquipeAno_Projetista`=?,"
                + "`EquipeAno_Obs`=?,"
                + "`EquipeAno_Foto`=?, "
                + "`EquipeAno_Foto2`=? "
                + "WHERE "
                + "`Equipe_Id`=? AND "
                + "`Temp_Ano`=?";

        executarUpdate(equipeAno);
    }

    @Override
    public void excluir(int id) { /*MODIFICADO ABAIXO*/  }

    public void excluir(int id, short ano) {
        this.prepSQL="DELETE FROM `equipeano` WHERE "
                + "Equipe_Id`="+id+" AND "
                + "`Temp_Ano`="+ano;
        
        executarUpdate(null);
    }

    @Override
    public Object getObjetoById(int id) { /*MODIFICADO ABAIXO*/ return null; }

    public Object getObjetoById(int id, short ano) {
        this.sql = "SELECT * FROM `equipeano` WHERE "
                + "`Equipe_Id`="+id+" AND "
                + "`Temp_Ano`="+ano;
        
        EquipeAno equipeAnoTemp = new EquipeAno();
        
        try {
            this.con = Factory.conectar();
            this.stmt = con.createStatement();
            this.rs = stmt.executeQuery(this.sql);
            
            rs.next();
            equipeAnoTemp.setEquipeAnoCarro(rs.getString("EquipeAno_Carro"));
            equipeAnoTemp.setEquipeAnoSponsor(rs.getString("EquipeAno_Sponsor"));
            equipeAnoTemp.setEquipeAnoCor1(rs.getString("EquipeAno_Cor1"));
            equipeAnoTemp.setEquipeAnoCor2(rs.getString("EquipeAno_Cor2"));
            equipeAnoTemp.setEquipeAnoCor3(rs.getString("EquipeAno_Cor3"));
            equipeAnoTemp.setMotorId(rs.getInt("Motor_Id"));
            equipeAnoTemp.setEquipeAnoPotencia(rs.getString("EquipeAno_Potencia"));
            equipeAnoTemp.setEquipeAnoChefe(rs.getString("EquipeAno_Chefe"));
            equipeAnoTemp.setEquipeAnoProjetista(rs.getString("EquipeAno_Projetista"));
            equipeAnoTemp.setEquipeAnoObs(rs.getBytes("EquipeAno_Obs"));
            equipeAnoTemp.setEquipeAnoFoto(rs.getBytes("EquipeAno_Foto"));
            equipeAnoTemp.setEquipeAnoFoto2(rs.getBytes("EquipeAno_Foto2"));
            EquipeAnoPK equipeAnoPK = new EquipeAnoPK(rs.getInt("Equipe_Id"), rs.getShort("Temp_Ano"));
            equipeAnoTemp.setEquipeAnoPK(equipeAnoPK);
        
            return equipeAnoTemp;            
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
        
        return null;
    }

    @Override
    public List<Object> listaBusca(String textoBusca) {
        return listaBusca(null, Short.valueOf(textoBusca));
    }

    public List<Object> listaBusca(Integer id, short ano) {
        if (id != null) {
            this.sql = "SELECT * FROM `equipeano` WHERE "
                    + "Equipe_Id`=" + id + " AND "
                    + "`Temp_Ano`=" + ano;            
        } else 
            this.sql = "SELECT * FROM `equipeano` WHERE `Temp_Ano`=" + ano;                        

        List<EquipeAno> lista = new ArrayList<EquipeAno>();

        try {
            this.con = Factory.conectar();
            this.stmt = con.createStatement();
            this.rs = stmt.executeQuery(sql);
            while (rs.next()) {
                EquipeAno equipeAnoTemp = new EquipeAno();
                equipeAnoTemp.setEquipeAnoCarro(rs.getString("EquipeAno_Carro"));
                equipeAnoTemp.setEquipeAnoSponsor(rs.getString("EquipeAno_Sponsor"));
                equipeAnoTemp.setEquipeAnoCor1(rs.getString("EquipeAno_Cor1"));
                equipeAnoTemp.setEquipeAnoCor2(rs.getString("EquipeAno_Cor2"));
                equipeAnoTemp.setEquipeAnoCor3(rs.getString("EquipeAno_Cor3"));
                equipeAnoTemp.setMotorId(rs.getInt("Motor_Id"));
                equipeAnoTemp.setEquipeAnoPotencia(rs.getString("EquipeAno_Potencia"));
                equipeAnoTemp.setEquipeAnoChefe(rs.getString("EquipeAno_Chefe"));
                equipeAnoTemp.setEquipeAnoProjetista(rs.getString("EquipeAno_Projetista"));
                equipeAnoTemp.setEquipeAnoObs(rs.getBytes("EquipeAno_Obs"));
                equipeAnoTemp.setEquipeAnoFoto(rs.getBytes("EquipeAno_Foto"));
                equipeAnoTemp.setEquipeAnoFoto2(rs.getBytes("EquipeAno_Foto2"));
                EquipeAnoPK equipeAnoPK = new EquipeAnoPK(rs.getInt("Equipe_Id"), rs.getShort("Temp_Ano"));
                equipeAnoTemp.setEquipeAnoPK(equipeAnoPK);                
                
                lista.add(equipeAnoTemp);
            }
            return (List)lista;
        } catch (SQLException ex) {
            System.out.println(ex);
        }                       

        return null;
    }

    @Override
    public void executarUpdate(Object objeto) {
        String equipeAnoCarro = null;
        String equipeAnoSponsor = null;
        String equipeAnoCor1 = null;
        String equipeAnoCor2 = null;
        String equipeAnoCor3 = null;
        Integer motorId = null;
        String equipeAnoPotencia = null;
        String equipeAnoChefe = null;
        String equipeAnoProjetista = null;
        byte[] equipeAnoObs = null;
        byte[] equipeAnoFoto = null;
        byte[] equipeAnoFoto2 = null;
        EquipeAnoPK equipeAnoPK = null;
        
        if (objeto != null) { //INSERIR ou EDITAR (null é Excluir)
            EquipeAno equipeAno = (EquipeAno)objeto;

            equipeAnoCarro = equipeAno.getEquipeAnoCarro();
            equipeAnoSponsor = equipeAno.getEquipeAnoSponsor();
            equipeAnoCor1 = equipeAno.getEquipeAnoCor1();
            equipeAnoCor2 = equipeAno.getEquipeAnoCor2();
            equipeAnoCor3 = equipeAno.getEquipeAnoCor3();
            motorId = equipeAno.getMotorId();
            equipeAnoPotencia = equipeAno.getEquipeAnoPotencia();
            equipeAnoChefe = equipeAno.getEquipeAnoChefe();
            equipeAnoProjetista = equipeAno.getEquipeAnoProjetista();
            equipeAnoObs = equipeAno.getEquipeAnoObs();
            equipeAnoFoto = equipeAno.getEquipeAnoFoto();
            equipeAnoFoto2 = equipeAno.getEquipeAnoFoto2();
            equipeAnoPK = equipeAno.getEquipeAnoPK();
        }
        
        try {        
            this.con = Factory.conectar();
            this.pstmt = con.prepareStatement(this.prepSQL);

            if (objeto != null) { //INSERIR ou EDITAR (null é Excluir, não seta variáveis)
                pstmt.setString(1, equipeAnoCarro);
                pstmt.setString(2, equipeAnoSponsor);
                pstmt.setString(3, equipeAnoCor1);
                pstmt.setString(4, equipeAnoCor2);
                pstmt.setString(5, equipeAnoCor3);
                pstmt.setInt(6, motorId);
                pstmt.setString(7, equipeAnoPotencia);
                pstmt.setString(8, equipeAnoChefe);
                pstmt.setString(9, equipeAnoProjetista);
                pstmt.setBytes(10, equipeAnoObs);
                pstmt.setBytes(11, equipeAnoFoto);                
                pstmt.setBytes(12, equipeAnoFoto2);                
                if (equipeAnoPK!=null) {
                    pstmt.setInt(13, equipeAnoPK.getEquipeId());
                    pstmt.setInt(14, equipeAnoPK.getTempAno());
                }
            }
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }            
    }
    
}