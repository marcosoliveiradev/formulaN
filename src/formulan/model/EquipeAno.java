/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulan.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 316602490132
 */
@Entity
@Table(name = "equipeano")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EquipeAno.findAll", query = "SELECT e FROM EquipeAno e"),
    @NamedQuery(name = "EquipeAno.findByEquipeId", query = "SELECT e FROM EquipeAno e WHERE e.equipeAnoPK.equipeId = :equipeId"),
    @NamedQuery(name = "EquipeAno.findByTempAno", query = "SELECT e FROM EquipeAno e WHERE e.equipeAnoPK.tempAno = :tempAno"),
    @NamedQuery(name = "EquipeAno.findByEquipeAnoCarro", query = "SELECT e FROM EquipeAno e WHERE e.equipeAnoCarro = :equipeAnoCarro"),
    @NamedQuery(name = "EquipeAno.findByEquipeAnoSponsor", query = "SELECT e FROM EquipeAno e WHERE e.equipeAnoSponsor = :equipeAnoSponsor"),
    @NamedQuery(name = "EquipeAno.findByEquipeAnoCor1", query = "SELECT e FROM EquipeAno e WHERE e.equipeAnoCor1 = :equipeAnoCor1"),
    @NamedQuery(name = "EquipeAno.findByEquipeAnoCor2", query = "SELECT e FROM EquipeAno e WHERE e.equipeAnoCor2 = :equipeAnoCor2"),
    @NamedQuery(name = "EquipeAno.findByEquipeAnoCor3", query = "SELECT e FROM EquipeAno e WHERE e.equipeAnoCor3 = :equipeAnoCor3"),
    @NamedQuery(name = "EquipeAno.findByMotorId", query = "SELECT e FROM EquipeAno e WHERE e.motorId = :motorId"),
    @NamedQuery(name = "EquipeAno.findByEquipeAnoPotencia", query = "SELECT e FROM EquipeAno e WHERE e.equipeAnoPotencia = :equipeAnoPotencia"),
    @NamedQuery(name = "EquipeAno.findByEquipeAnoChefe", query = "SELECT e FROM EquipeAno e WHERE e.equipeAnoChefe = :equipeAnoChefe"),
    @NamedQuery(name = "EquipeAno.findByEquipeAnoProjetista", query = "SELECT e FROM EquipeAno e WHERE e.equipeAnoProjetista = :equipeAnoProjetista")})
public class EquipeAno implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EquipeAnoPK equipeAnoPK;
    @Column(name = "EquipeAno_Carro")
    private String equipeAnoCarro;
    @Column(name = "EquipeAno_Sponsor")
    private String equipeAnoSponsor;
    @Column(name = "EquipeAno_Cor1")
    private String equipeAnoCor1;
    @Column(name = "EquipeAno_Cor2")
    private String equipeAnoCor2;
    @Column(name = "EquipeAno_Cor3")
    private String equipeAnoCor3;
    @Column(name = "Motor_Id")
    private Integer motorId;
    @Column(name = "EquipeAno_Potencia")
    private String equipeAnoPotencia;
    @Column(name = "EquipeAno_Chefe")
    private String equipeAnoChefe;
    @Column(name = "EquipeAno_Projetista")
    private String equipeAnoProjetista;
    @Lob
    @Column(name = "EquipeAno_Obs")
    private byte[] equipeAnoObs;
    @Lob
    @Column(name = "EquipeAno_Foto")
    private byte[] equipeAnoFoto;
    @Lob
    @Column(name = "EquipeAno_Foto2")
    private byte[] equipeAnoFoto2;

    public EquipeAno() {
    }

    public EquipeAno(EquipeAnoPK equipeAnoPK) {
        this.equipeAnoPK = equipeAnoPK;
    }

    public EquipeAno(int equipeId, int tempAno) {
        this.equipeAnoPK = new EquipeAnoPK(equipeId, tempAno);
    }

    public EquipeAnoPK getEquipeAnoPK() {
        return equipeAnoPK;
    }

    public void setEquipeAnoPK(EquipeAnoPK equipeAnoPK) {
        this.equipeAnoPK = equipeAnoPK;
    }

    public String getEquipeAnoCarro() {
        return equipeAnoCarro;
    }

    public void setEquipeAnoCarro(String equipeAnoCarro) {
        this.equipeAnoCarro = equipeAnoCarro;
    }

    public String getEquipeAnoSponsor() {
        return equipeAnoSponsor;
    }

    public void setEquipeAnoSponsor(String equipeAnoSponsor) {
        this.equipeAnoSponsor = equipeAnoSponsor;
    }

    public String getEquipeAnoCor1() {
        return equipeAnoCor1;
    }

    public void setEquipeAnoCor1(String equipeAnoCor1) {
        this.equipeAnoCor1 = equipeAnoCor1;
    }

    public String getEquipeAnoCor2() {
        return equipeAnoCor2;
    }

    public void setEquipeAnoCor2(String equipeAnoCor2) {
        this.equipeAnoCor2 = equipeAnoCor2;
    }

    public String getEquipeAnoCor3() {
        return equipeAnoCor3;
    }

    public void setEquipeAnoCor3(String equipeAnoCor3) {
        this.equipeAnoCor3 = equipeAnoCor3;
    }

    public Integer getMotorId() {
        return motorId;
    }

    public void setMotorId(Integer motorId) {
        this.motorId = motorId;
    }

    public String getEquipeAnoPotencia() {
        return equipeAnoPotencia;
    }

    public void setEquipeAnoPotencia(String equipeAnoPotencia) {
        this.equipeAnoPotencia = equipeAnoPotencia;
    }

    public String getEquipeAnoChefe() {
        return equipeAnoChefe;
    }

    public void setEquipeAnoChefe(String equipeAnoChefe) {
        this.equipeAnoChefe = equipeAnoChefe;
    }

    public String getEquipeAnoProjetista() {
        return equipeAnoProjetista;
    }

    public void setEquipeAnoProjetista(String equipeAnoProjetista) {
        this.equipeAnoProjetista = equipeAnoProjetista;
    }

    public byte[] getEquipeAnoObs() {
        return equipeAnoObs;
    }

    public void setEquipeAnoObs(byte[] equipeAnoObs) {
        this.equipeAnoObs = equipeAnoObs;
    }

    public byte[] getEquipeAnoFoto() {
        return equipeAnoFoto;
    }

    public void setEquipeAnoFoto(byte[] equipeAnoFoto) {
        this.equipeAnoFoto = equipeAnoFoto;
    }

    public byte[] getEquipeAnoFoto2() {
        return equipeAnoFoto2;
    }

    public void setEquipeAnoFoto2(byte[] equipeAnoFoto2) {
        this.equipeAnoFoto2 = equipeAnoFoto2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equipeAnoPK != null ? equipeAnoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipeAno)) {
            return false;
        }
        EquipeAno other = (EquipeAno) object;
        if ((this.equipeAnoPK == null && other.equipeAnoPK != null) || (this.equipeAnoPK != null && !this.equipeAnoPK.equals(other.equipeAnoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formulan.model.EquipeAno[ equipeAnoPK=" + equipeAnoPK + " ]";
    }
    
}
