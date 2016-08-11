/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulan.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marco
 */
@Entity
@Table(name = "motor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Motor.findAll", query = "SELECT m FROM Motor m"),
    @NamedQuery(name = "Motor.findByMotorId", query = "SELECT m FROM Motor m WHERE m.motorId = :motorId"),
    @NamedQuery(name = "Motor.findByMotorNome", query = "SELECT m FROM Motor m WHERE m.motorNome = :motorNome"),
    @NamedQuery(name = "Motor.findByPaisId", query = "SELECT m FROM Motor m WHERE m.paisId = :paisId")})
public class Motor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Motor_Id")
    private Integer motorId;
    @Column(name = "Motor_Nome")
    private String motorNome;
    @Column(name = "Pais_Id")
    private Integer paisId;
    @Lob
    @Column(name = "Motor_Obs")
    private byte[] motorObs;
    @Lob
    @Column(name = "Motor_Logo")
    private byte[] motorLogo;

    public Motor() {
    }

    public Motor(Integer motorId) {
        this.motorId = motorId;
    }

    public Integer getMotorId() {
        return motorId;
    }

    public void setMotorId(Integer motorId) {
        this.motorId = motorId;
    }

    public String getMotorNome() {
        return motorNome;
    }

    public void setMotorNome(String motorNome) {
        this.motorNome = motorNome;
    }

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
    }

    public byte[] getMotorObs() {
        return motorObs;
    }

    public void setMotorObs(byte[] motorObs) {
        this.motorObs = motorObs;
    }

    public byte[] getMotorLogo() {
        return motorLogo;
    }

    public void setMotorLogo(byte[] motorLogo) {
        this.motorLogo = motorLogo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (motorId != null ? motorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motor)) {
            return false;
        }
        Motor other = (Motor) object;
        if ((this.motorId == null && other.motorId != null) || (this.motorId != null && !this.motorId.equals(other.motorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formulan.dados.Motor[ motorId=" + motorId + " ]";
    }
    
}
