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
@Table(name = "piloto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Piloto.findAll", query = "SELECT p FROM Piloto p"),
    @NamedQuery(name = "Piloto.findByPilotoId", query = "SELECT p FROM Piloto p WHERE p.pilotoId = :pilotoId"),
    @NamedQuery(name = "Piloto.findByPilotoNum", query = "SELECT p FROM Piloto p WHERE p.pilotoNum = :pilotoNum"),
    @NamedQuery(name = "Piloto.findByPilotoNome", query = "SELECT p FROM Piloto p WHERE p.pilotoNome = :pilotoNome"),
    @NamedQuery(name = "Piloto.findByPilotoSobrenome", query = "SELECT p FROM Piloto p WHERE p.pilotoSobrenome = :pilotoSobrenome"),
    @NamedQuery(name = "Piloto.findByPilotoSigla", query = "SELECT p FROM Piloto p WHERE p.pilotoSigla = :pilotoSigla"),
    @NamedQuery(name = "Piloto.findByPaisId", query = "SELECT p FROM Piloto p WHERE p.paisId = :paisId"),
    @NamedQuery(name = "Piloto.findByPilotoDtNasc", query = "SELECT p FROM Piloto p WHERE p.pilotoDtNasc = :pilotoDtNasc"),
    @NamedQuery(name = "Piloto.findByPilotoFalecido", query = "SELECT p FROM Piloto p WHERE p.pilotoFalecido = :pilotoFalecido")})
public class Piloto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Piloto_Id")
    private Integer pilotoId;
    @Column(name = "Piloto_Num")
    private Integer pilotoNum;
    @Column(name = "Piloto_Nome")
    private String pilotoNome;
    @Column(name = "Piloto_Sobrenome")
    private String pilotoSobrenome;
    @Column(name = "Piloto_Sigla")
    private String pilotoSigla;
    @Column(name = "Pais_Id")
    private Integer paisId;
    @Lob
    @Column(name = "Piloto_Foto")
    private byte[] pilotoFoto;
    @Lob
    @Column(name = "Piloto_Capacete")
    private byte[] pilotoCapacete;
    @Lob
    @Column(name = "Piloto_Obs")
    private byte[] pilotoObs;
    @Column(name = "Piloto_DtNasc")
    @Temporal(TemporalType.DATE)
    private Date pilotoDtNasc;
    @Column(name = "Piloto_Falecido")
    private Boolean pilotoFalecido;

    public Piloto() {
    }

    public Piloto(Integer pilotoId) {
        this.pilotoId = pilotoId;
    }

    public Integer getPilotoId() {
        return pilotoId;
    }

    public void setPilotoId(Integer pilotoId) {
        this.pilotoId = pilotoId;
    }

    public Integer getPilotoNum() {
        return pilotoNum;
    }

    public void setPilotoNum(Integer pilotoNum) {
        this.pilotoNum = pilotoNum;
    }

    public String getPilotoNome() {
        return pilotoNome;
    }

    public void setPilotoNome(String pilotoNome) {
        this.pilotoNome = pilotoNome;
    }

    public String getPilotoSobrenome() {
        return pilotoSobrenome;
    }

    public void setPilotoSobrenome(String pilotoSobrenome) {
        this.pilotoSobrenome = pilotoSobrenome;
    }

    public String getPilotoSigla() {
        return pilotoSigla;
    }

    public void setPilotoSigla(String pilotoSigla) {
        this.pilotoSigla = pilotoSigla;
    }

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
    }

    public byte[] getPilotoFoto() {
        return pilotoFoto;
    }

    public void setPilotoFoto(byte[] pilotoFoto) {
        this.pilotoFoto = pilotoFoto;
    }

    public byte[] getPilotoCapacete() {
        return pilotoCapacete;
    }

    public void setPilotoCapacete(byte[] pilotoCapacete) {
        this.pilotoCapacete = pilotoCapacete;
    }

    public byte[] getPilotoObs() {
        return pilotoObs;
    }

    public void setPilotoObs(byte[] pilotoObs) {
        this.pilotoObs = pilotoObs;
    }

    public Date getPilotoDtNasc() {
        return pilotoDtNasc;
    }

    public void setPilotoDtNasc(Date pilotoDtNasc) {
        this.pilotoDtNasc = pilotoDtNasc;
    }

    public Boolean getPilotoFalecido() {
        return pilotoFalecido;
    }

    public void setPilotoFalecido(Boolean pilotoFalecido) {
        this.pilotoFalecido = pilotoFalecido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pilotoId != null ? pilotoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Piloto)) {
            return false;
        }
        Piloto other = (Piloto) object;
        if ((this.pilotoId == null && other.pilotoId != null) || (this.pilotoId != null && !this.pilotoId.equals(other.pilotoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formulan.model.Piloto[ pilotoId=" + pilotoId + " ]";
    }
    
}
