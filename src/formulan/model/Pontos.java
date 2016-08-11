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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marco
 */
@Entity
@Table(name = "pontos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pontos.findAll", query = "SELECT p FROM Pontos p"),
    @NamedQuery(name = "Pontos.findByPontosRegra", query = "SELECT p FROM Pontos p WHERE p.pontosRegra = :pontosRegra"),
    @NamedQuery(name = "Pontos.findByPontos1", query = "SELECT p FROM Pontos p WHERE p.pontos1 = :pontos1"),
    @NamedQuery(name = "Pontos.findByPontos2", query = "SELECT p FROM Pontos p WHERE p.pontos2 = :pontos2"),
    @NamedQuery(name = "Pontos.findByPontos3", query = "SELECT p FROM Pontos p WHERE p.pontos3 = :pontos3"),
    @NamedQuery(name = "Pontos.findByPontos4", query = "SELECT p FROM Pontos p WHERE p.pontos4 = :pontos4"),
    @NamedQuery(name = "Pontos.findByPontos5", query = "SELECT p FROM Pontos p WHERE p.pontos5 = :pontos5"),
    @NamedQuery(name = "Pontos.findByPontos6", query = "SELECT p FROM Pontos p WHERE p.pontos6 = :pontos6"),
    @NamedQuery(name = "Pontos.findByPontos7", query = "SELECT p FROM Pontos p WHERE p.pontos7 = :pontos7"),
    @NamedQuery(name = "Pontos.findByPontos8", query = "SELECT p FROM Pontos p WHERE p.pontos8 = :pontos8"),
    @NamedQuery(name = "Pontos.findByPontos9", query = "SELECT p FROM Pontos p WHERE p.pontos9 = :pontos9"),
    @NamedQuery(name = "Pontos.findByPontos10", query = "SELECT p FROM Pontos p WHERE p.pontos10 = :pontos10")})
public class Pontos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Pontos_Regra")
    private Short pontosRegra;
    @Column(name = "Pontos_1")
    private Short pontos1;
    @Column(name = "Pontos_2")
    private Short pontos2;
    @Column(name = "Pontos_3")
    private Short pontos3;
    @Column(name = "Pontos_4")
    private Short pontos4;
    @Column(name = "Pontos_5")
    private Short pontos5;
    @Column(name = "Pontos_6")
    private Short pontos6;
    @Column(name = "Pontos_7")
    private Short pontos7;
    @Column(name = "Pontos_8")
    private Short pontos8;
    @Column(name = "Pontos_9")
    private Short pontos9;
    @Column(name = "Pontos_10")
    private Short pontos10;

    public Pontos() {
    }

    public Pontos(Short pontosRegra) {
        this.pontosRegra = pontosRegra;
    }

    public Short getPontosRegra() {
        return pontosRegra;
    }

    public void setPontosRegra(Short pontosRegra) {
        this.pontosRegra = pontosRegra;
    }

    public Short getPontos1() {
        return pontos1;
    }

    public void setPontos1(Short pontos1) {
        this.pontos1 = pontos1;
    }

    public Short getPontos2() {
        return pontos2;
    }

    public void setPontos2(Short pontos2) {
        this.pontos2 = pontos2;
    }

    public Short getPontos3() {
        return pontos3;
    }

    public void setPontos3(Short pontos3) {
        this.pontos3 = pontos3;
    }

    public Short getPontos4() {
        return pontos4;
    }

    public void setPontos4(Short pontos4) {
        this.pontos4 = pontos4;
    }

    public Short getPontos5() {
        return pontos5;
    }

    public void setPontos5(Short pontos5) {
        this.pontos5 = pontos5;
    }

    public Short getPontos6() {
        return pontos6;
    }

    public void setPontos6(Short pontos6) {
        this.pontos6 = pontos6;
    }

    public Short getPontos7() {
        return pontos7;
    }

    public void setPontos7(Short pontos7) {
        this.pontos7 = pontos7;
    }

    public Short getPontos8() {
        return pontos8;
    }

    public void setPontos8(Short pontos8) {
        this.pontos8 = pontos8;
    }

    public Short getPontos9() {
        return pontos9;
    }

    public void setPontos9(Short pontos9) {
        this.pontos9 = pontos9;
    }

    public Short getPontos10() {
        return pontos10;
    }

    public void setPontos10(Short pontos10) {
        this.pontos10 = pontos10;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pontosRegra != null ? pontosRegra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pontos)) {
            return false;
        }
        Pontos other = (Pontos) object;
        if ((this.pontosRegra == null && other.pontosRegra != null) || (this.pontosRegra != null && !this.pontosRegra.equals(other.pontosRegra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formulan.model.Pontos[ pontosRegra=" + pontosRegra + " ]";
    }
    
}
