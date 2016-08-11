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
@Table(name = "temporada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Temporada.findAll", query = "SELECT t FROM Temporada t"),
    @NamedQuery(name = "Temporada.findByTempAno", query = "SELECT t FROM Temporada t WHERE t.tempAno = :tempAno"),
    @NamedQuery(name = "Temporada.findByPontosRegra", query = "SELECT t FROM Temporada t WHERE t.pontosRegra = :pontosRegra")})
public class Temporada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Temp_Ano")
    private Short tempAno;
    @Lob
    @Column(name = "Temp_Obs")
    private byte[] tempObs;
    @Column(name = "Pontos_Regra")
    private Short pontosRegra;

    public Temporada() {
    }

    public Temporada(Short tempAno) {
        this.tempAno = tempAno;
    }

    public Short getTempAno() {
        return tempAno;
    }

    public void setTempAno(Short tempAno) {
        this.tempAno = tempAno;
    }

    public byte[] getTempObs() {
        return tempObs;
    }

    public void setTempObs(byte[] tempObs) {
        this.tempObs = tempObs;
    }

    public Short getPontosRegra() {
        return pontosRegra;
    }

    public void setPontosRegra(Short pontosRegra) {
        this.pontosRegra = pontosRegra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tempAno != null ? tempAno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Temporada)) {
            return false;
        }
        Temporada other = (Temporada) object;
        if ((this.tempAno == null && other.tempAno != null) || (this.tempAno != null && !this.tempAno.equals(other.tempAno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formulan.model.Temporada[ tempAno=" + tempAno + " ]";
    }
    
}
