/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulan.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author 316602490132
 */
@Embeddable
public class EquipeAnoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Equipe_Id")
    private int equipeId;
    @Basic(optional = false)
    @Column(name = "Temp_Ano")
    private int tempAno;

    public EquipeAnoPK() {
    }

    public EquipeAnoPK(int equipeId, int tempAno) {
        this.equipeId = equipeId;
        this.tempAno = tempAno;
    }

    public int getEquipeId() {
        return equipeId;
    }

    public void setEquipeId(int equipeId) {
        this.equipeId = equipeId;
    }

    public int getTempAno() {
        return tempAno;
    }

    public void setTempAno(int tempAno) {
        this.tempAno = tempAno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) equipeId;
        hash += (int) tempAno;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipeAnoPK)) {
            return false;
        }
        EquipeAnoPK other = (EquipeAnoPK) object;
        if (this.equipeId != other.equipeId) {
            return false;
        }
        if (this.tempAno != other.tempAno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formulan.model.EquipeAnoPK[ equipeId=" + equipeId + ", tempAno=" + tempAno + " ]";
    }
    
}
