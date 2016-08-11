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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 316602490132
 */
@Embeddable
public class ContratoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Equipe_Id")
    private int equipeId;
    @Basic(optional = false)
    @Column(name = "Contrato_Inicio")
    @Temporal(TemporalType.DATE)
    private Date contratoInicio;
    @Basic(optional = false)
    @Column(name = "Piloto_Id")
    private int pilotoId;

    public ContratoPK() {
    }

    public ContratoPK(int equipeId, Date contratoInicio, int pilotoId) {
        this.equipeId = equipeId;
        this.contratoInicio = contratoInicio;
        this.pilotoId = pilotoId;
    }

    public int getEquipeId() {
        return equipeId;
    }

    public void setEquipeId(int equipeId) {
        this.equipeId = equipeId;
    }

    public Date getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(Date contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public int getPilotoId() {
        return pilotoId;
    }

    public void setPilotoId(int pilotoId) {
        this.pilotoId = pilotoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) equipeId;
        hash += (contratoInicio != null ? contratoInicio.hashCode() : 0);
        hash += (int) pilotoId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContratoPK)) {
            return false;
        }
        ContratoPK other = (ContratoPK) object;
        if (this.equipeId != other.equipeId) {
            return false;
        }
        if ((this.contratoInicio == null && other.contratoInicio != null) || (this.contratoInicio != null && !this.contratoInicio.equals(other.contratoInicio))) {
            return false;
        }
        if (this.pilotoId != other.pilotoId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formulan.model.ContratoPK[ equipeId=" + equipeId + ", contratoInicio=" + contratoInicio + ", pilotoId=" + pilotoId + " ]";
    }
    
}
