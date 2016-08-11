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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marco
 */
@Entity
@Table(name = "corrida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Corrida.findAll", query = "SELECT c FROM Corrida c"),
    @NamedQuery(name = "Corrida.findByCorridaNum", query = "SELECT c FROM Corrida c WHERE c.corridaNum = :corridaNum"),
    @NamedQuery(name = "Corrida.findByCorridaGP", query = "SELECT c FROM Corrida c WHERE c.corridaGP = :corridaGP"),
    @NamedQuery(name = "Corrida.findByPistaId", query = "SELECT c FROM Corrida c WHERE c.pistaId = :pistaId"),
    @NamedQuery(name = "Corrida.findByCorridaData", query = "SELECT c FROM Corrida c WHERE c.corridaData = :corridaData"),
    @NamedQuery(name = "Corrida.findByTempAno", query = "SELECT c FROM Corrida c WHERE c.tempAno = :tempAno"),
    @NamedQuery(name = "Corrida.findByCorridaMetade", query = "SELECT c FROM Corrida c WHERE c.corridaMetade = :corridaMetade")})
public class Corrida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Corrida_Num")
    private Integer corridaNum;
    @Column(name = "Corrida_GP")
    private String corridaGP;
    @Column(name = "Pista_Id")
    private Integer pistaId;
    @Column(name = "Corrida_Data")
    @Temporal(TemporalType.DATE)
    private Date corridaData;
    @Column(name = "Temp_Ano")
    private Short tempAno;
    @Column(name = "Corrida_Metade")
    private Boolean corridaMetade;

    public Corrida() {
    }

    public Corrida(Integer corridaNum) {
        this.corridaNum = corridaNum;
    }

    public Integer getCorridaNum() {
        return corridaNum;
    }

    public void setCorridaNum(Integer corridaNum) {
        this.corridaNum = corridaNum;
    }

    public String getCorridaGP() {
        return corridaGP;
    }

    public void setCorridaGP(String corridaGP) {
        this.corridaGP = corridaGP;
    }

    public Integer getPistaId() {
        return pistaId;
    }

    public void setPistaId(Integer pistaId) {
        this.pistaId = pistaId;
    }

    public Date getCorridaData() {
        return corridaData;
    }

    public void setCorridaData(Date corridaData) {
        this.corridaData = corridaData;
    }

    public Short getTempAno() {
        return tempAno;
    }

    public void setTempAno(Short tempAno) {
        this.tempAno = tempAno;
    }

    public Boolean getCorridaMetade() {
        return corridaMetade;
    }

    public void setCorridaMetade(Boolean corridaMetade) {
        this.corridaMetade = corridaMetade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (corridaNum != null ? corridaNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Corrida)) {
            return false;
        }
        Corrida other = (Corrida) object;
        if ((this.corridaNum == null && other.corridaNum != null) || (this.corridaNum != null && !this.corridaNum.equals(other.corridaNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formulan.model.Corrida[ corridaNum=" + corridaNum + " ]";
    }
    
}
