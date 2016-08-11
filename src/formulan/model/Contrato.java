/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulan.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 316602490132
 */
@Entity
@Table(name = "contrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c"),
    @NamedQuery(name = "Contrato.findByEquipeId", query = "SELECT c FROM Contrato c WHERE c.contratoPK.equipeId = :equipeId"),
    @NamedQuery(name = "Contrato.findByContratoInicio", query = "SELECT c FROM Contrato c WHERE c.contratoPK.contratoInicio = :contratoInicio"),
    @NamedQuery(name = "Contrato.findByContratoFim", query = "SELECT c FROM Contrato c WHERE c.contratoFim = :contratoFim"),
    @NamedQuery(name = "Contrato.findByPilotoId", query = "SELECT c FROM Contrato c WHERE c.contratoPK.pilotoId = :pilotoId")})
public class Contrato implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContratoPK contratoPK;
    @Basic(optional = false)
    @Column(name = "Contrato_Fim")
    @Temporal(TemporalType.DATE)
    private Date contratoFim;
    @Lob
    @Column(name = "Contrato_Obs")
    private byte[] contratoObs;

    public Contrato() {
    }

    public Contrato(ContratoPK contratoPK) {
        this.contratoPK = contratoPK;
    }

    public Contrato(ContratoPK contratoPK, Date contratoFim) {
        this.contratoPK = contratoPK;
        this.contratoFim = contratoFim;
    }

    public Contrato(int equipeId, Date contratoInicio, int pilotoId) {
        this.contratoPK = new ContratoPK(equipeId, contratoInicio, pilotoId);
    }

    public ContratoPK getContratoPK() {
        return contratoPK;
    }

    public void setContratoPK(ContratoPK contratoPK) {
        this.contratoPK = contratoPK;
    }

    public Date getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(Date contratoFim) {
        this.contratoFim = contratoFim;
    }

    public byte[] getContratoObs() {
        return contratoObs;
    }

    public void setContratoObs(byte[] contratoObs) {
        this.contratoObs = contratoObs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contratoPK != null ? contratoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.contratoPK == null && other.contratoPK != null) || (this.contratoPK != null && !this.contratoPK.equals(other.contratoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formulan.model.Contrato[ contratoPK=" + contratoPK + " ]";
    }
    
}
