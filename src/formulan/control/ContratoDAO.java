package formulan.control;

import formulan.access.Factory;
import formulan.model.Contrato;
import formulan.model.ContratoPK;
import formulan.util.util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContratoDAO implements DAOBasico{

    private String prepSQL;
    private String sql;
    private Statement stmt;
    private Connection con;
    private ResultSet rs;
    private PreparedStatement pstmt;    
    
    @Override
    public void inserir(Object objeto) {
        Contrato contrato = (Contrato)objeto;
        
        this.prepSQL="INSERT INTO `contrato`(`Contrato_Fim`, `Contrato_Obs`, `Equipe_Id`, `Piloto_Id`, `Contrato_Inicio`) "
                                  + "VALUES (?,?,?,?,?)";
                
        executarUpdate(contrato);
    }

    @Override
    public void editar(Object objeto) {
        Contrato contrato = (Contrato)objeto;        
        
        this.prepSQL="UPDATE `contrato` SET "
                + "`Contrato_Fim`=?,"
                + "`Contrato_Obs`=? "
                + "WHERE "
                + "`Equipe_Id`=? AND"
                + "`Piloto_Id`=? AND"
                + "`Contrato_Inicio`=?";
        
        executarUpdate(contrato);
    }

    @Override
    public void excluir(int id) { /*Modificado*/    }
    
    public void excluir(int equipeId, Date contratoInicio, int pilotoId) { 
        
        this.prepSQL="DELETE FROM `contrato` WHERE "
                + "`Equipe_Id`="+equipeId+" AND"
                + "`Piloto_Id`="+pilotoId+" AND"
                + "`Contrato_Inicio`="+contratoInicio;
        
        executarUpdate(null);
    }

    @Override
    public Object getObjetoById(int id) { /*Modificado*/  return null;}

    public Object getObjetoById(int equipeId, Date contratoInicio, int pilotoId) { 
        this.sql="SELECT * FROM `contrato` WHERE "
                + "`Equipe_Id`="+equipeId+" AND"
                + "`Piloto_Id`="+pilotoId+" AND"
                + "`Contrato_Inicio`="+contratoInicio;
        
        Contrato contratoTemp = new Contrato();

        try {
            this.con = Factory.conectar();
            this.stmt = con.createStatement();
            this.rs = stmt.executeQuery(this.sql);
            
            rs.next();
            contratoTemp.setContratoFim(rs.getDate("Contrato_Fim"));            
            contratoTemp.setContratoObs(rs.getBytes("Contrato_Obs"));            
            contratoTemp.setContratoPK(new ContratoPK(rs.getInt("Equipe_Id"), 
                                                      rs.getDate("Contrato_Inicio"), 
                                                      rs.getInt("Piloto_Id")));            
            return contratoTemp;            
        } catch (SQLException ex) {
            System.out.println(ex);            
        }        

        return null;        
    }

    @Override
    public List<Object> listaBusca(String textoBusca) { /*MODIFICADO*/ return null;  }

    /**
     * Retorna Contratos iniciados em anoTemporada (ou antes) e ainda vigentes. 
     * A data de vigência ajuda a eliminar demitidos no meio da temporada
     * @param equipeId
     * @param anoTemporada
     * @param dataVigencia null=31/12/anoTemporada
     * @return Lista de Contratos da equipeId
     */
    public List<Object> listaBusca(int equipeId, Short anoTemporada, Date dataVigencia) {         
        String inicioAnoTemporada = "01/01/"+anoTemporada;                
        if (dataVigencia == null) dataVigencia = util.strToDate("31/12/"+anoTemporada);
                
        this.sql="SELECT * FROM `contrato` WHERE "
                + "`Equipe_Id`="+equipeId+" AND "
                + "`Contrato_Inicio` <= "+inicioAnoTemporada+" AND "
                + "`Contrato_Fim` <= "+dataVigencia;
        
        List<Contrato> lista = new ArrayList<Contrato>();

        try {
            this.con = Factory.conectar();
            this.stmt = con.createStatement();
            this.rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Contrato contratoTemp = new Contrato();
                contratoTemp.setContratoFim(rs.getDate("Contrato_Fim"));
                contratoTemp.setContratoObs(rs.getBytes("Contrato_Obs"));
                contratoTemp.setContratoPK(new ContratoPK(rs.getInt("Equipe_Id"), 
                                                          rs.getDate("Contrato_Inicio"), 
                                                          rs.getInt("Piloto_Id")));                
                lista.add(contratoTemp);
            }
            return (List)lista;
        } catch (SQLException ex) {
            System.out.println(ex);
        }                       
        
        return null;
    }

    @Override
    public void executarUpdate(Object objeto) {
        Date contratoFim = null;
        byte[] contratoObs = null;
        ContratoPK contratoPK = null;
            
        if (objeto != null) { //INSERIR ou EDITAR (null é Excluir)
            Contrato contrato = (Contrato)objeto;

            contratoFim = contrato.getContratoFim();
            contratoObs = contrato.getContratoObs();
            contratoPK = contrato.getContratoPK();            
        }
        
        try {        
            this.con = Factory.conectar();
            this.pstmt = con.prepareStatement(this.prepSQL);

            if (objeto != null) { //INSERIR ou EDITAR (null é Excluir, não seta variáveis)
                pstmt.setDate(1, (java.sql.Date) contratoFim);
                pstmt.setBytes(2, contratoObs);
                if (contratoPK!=null) {
                    pstmt.setInt(3, contratoPK.getEquipeId());
                    pstmt.setInt(4, contratoPK.getPilotoId());
                    pstmt.setDate(5, (java.sql.Date) contratoPK.getContratoInicio());
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
