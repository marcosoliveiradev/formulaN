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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "pista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pista.findAll", query = "SELECT p FROM Pista p"),
    @NamedQuery(name = "Pista.findByPistaId", query = "SELECT p FROM Pista p WHERE p.pistaId = :pistaId"),
    @NamedQuery(name = "Pista.findByPistaNome", query = "SELECT p FROM Pista p WHERE p.pistaNome = :pistaNome"),
    @NamedQuery(name = "Pista.findByPistaCidade", query = "SELECT p FROM Pista p WHERE p.pistaCidade = :pistaCidade"),
    @NamedQuery(name = "Pista.findByPaisId", query = "SELECT p FROM Pista p WHERE p.paisId = :paisId"),
    @NamedQuery(name = "Pista.findByPistaKm", query = "SELECT p FROM Pista p WHERE p.pistaKm = :pistaKm"),
    @NamedQuery(name = "Pista.findByPistaRecorde", query = "SELECT p FROM Pista p WHERE p.pistaRecorde = :pistaRecorde"),
    @NamedQuery(name = "Pista.findByPilotoId", query = "SELECT p FROM Pista p WHERE p.pilotoId = :pilotoId")})
public class Pista implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Pista_Id")
    private Integer pistaId;
    @Column(name = "Pista_Nome")
    private String pistaNome;
    @Column(name = "Pista_Cidade")
    private String pistaCidade;
    @Column(name = "Pais_Id")
    private Integer paisId;
    @Lob
    @Column(name = "Pista_Tracado")
    private byte[] pistaTracado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Pista_Km")
    private Double pistaKm;
    @Column(name = "Pista_Recorde")
    @Temporal(TemporalType.TIME)
    private Date pistaRecorde;
    @Column(name = "Piloto_Id")
    private Integer pilotoId;
    @Lob
    @Column(name = "Pista_Obs")
    private byte[] pistaObs;

    public Pista() {
    }

    public Pista(Integer pistaId) {
        this.pistaId = pistaId;
    }

    public Integer getPistaId() {
        return pistaId;
    }

    public void setPistaId(Integer pistaId) {
        this.pistaId = pistaId;
    }

    public String getPistaNome() {
        return pistaNome;
    }

    public void setPistaNome(String pistaNome) {
        this.pistaNome = pistaNome;
    }

    public String getPistaCidade() {
        return pistaCidade;
    }

    public void setPistaCidade(String pistaCidade) {
        this.pistaCidade = pistaCidade;
    }

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
    }

    public byte[] getPistaTracado() {
        return pistaTracado;
    }

    public void setPistaTracado(byte[] pistaTracado) {
        this.pistaTracado = pistaTracado;
    }

    public Double getPistaKm() {
        return pistaKm;
    }

    public void setPistaKm(Double pistaKm) {
        this.pistaKm = pistaKm;
    }

    public Date getPistaRecorde() {
        return pistaRecorde;
    }

    public void setPistaRecorde(Date pistaRecorde) {
        this.pistaRecorde = pistaRecorde;
    }

    public Integer getPilotoId() {
        return pilotoId;
    }

    public void setPilotoId(Integer pilotoId) {
        this.pilotoId = pilotoId;
    }

    public byte[] getPistaObs() {
        return pistaObs;
    }

    public void setPistaObs(byte[] pistaObs) {
        this.pistaObs = pistaObs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pistaId != null ? pistaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pista)) {
            return false;
        }
        Pista other = (Pista) object;
        if ((this.pistaId == null && other.pistaId != null) || (this.pistaId != null && !this.pistaId.equals(other.pistaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formulan.dados.Pista[ pistaId=" + pistaId + " ]";
    }
    
}
