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
@Table(name = "equipe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipe.findAll", query = "SELECT e FROM Equipe e"),
    @NamedQuery(name = "Equipe.findByEquipeId", query = "SELECT e FROM Equipe e WHERE e.equipeId = :equipeId"),
    @NamedQuery(name = "Equipe.findByEquipeAnoInicio", query = "SELECT e FROM Equipe e WHERE e.equipeAnoInicio = :equipeAnoInicio"),
    @NamedQuery(name = "Equipe.findByEquipeAnoFim", query = "SELECT e FROM Equipe e WHERE e.equipeAnoFim = :equipeAnoFim"),
    @NamedQuery(name = "Equipe.findByEquipeNome", query = "SELECT e FROM Equipe e WHERE e.equipeNome = :equipeNome"),
    @NamedQuery(name = "Equipe.findByPaisId", query = "SELECT e FROM Equipe e WHERE e.paisId = :paisId"),
    @NamedQuery(name = "Equipe.findByEquipeOrigemId", query = "SELECT e FROM Equipe e WHERE e.equipeOrigemId = :equipeOrigemId")})
public class Equipe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Equipe_Id")
    private Integer equipeId;
    @Column(name = "Equipe_AnoInicio")
    private Short equipeAnoInicio;
    @Column(name = "Equipe_AnoFim")
    private Short equipeAnoFim;
    @Column(name = "Equipe_Nome")
    private String equipeNome;
    @Column(name = "Pais_Id")
    private Integer paisId;
    @Column(name = "Equipe_OrigemId")
    private Integer equipeOrigemId;
    @Lob
    @Column(name = "Equipe_Obs")
    private byte[] equipeObs;
    @Lob
    @Column(name = "Equipe_Logo")
    private byte[] equipeLogo;

    public Equipe() {
    }

    public Equipe(Integer equipeId) {
        this.equipeId = equipeId;
    }

    public Integer getEquipeId() {
        return equipeId;
    }

    public void setEquipeId(Integer equipeId) {
        this.equipeId = equipeId;
    }

    public Short getEquipeAnoInicio() {
        return equipeAnoInicio;
    }

    public void setEquipeAnoInicio(Short equipeAnoInicio) {
        this.equipeAnoInicio = equipeAnoInicio;
    }

    public Short getEquipeAnoFim() {
        return equipeAnoFim;
    }

    public void setEquipeAnoFim(Short equipeAnoFim) {
        this.equipeAnoFim = equipeAnoFim;
    }

    public String getEquipeNome() {
        return equipeNome;
    }

    public void setEquipeNome(String equipeNome) {
        this.equipeNome = equipeNome;
    }

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
    }

    public Integer getEquipeOrigemId() {
        return equipeOrigemId;
    }

    public void setEquipeOrigemId(Integer equipeOrigemId) {
        this.equipeOrigemId = equipeOrigemId;
    }

    public byte[] getEquipeObs() {
        return equipeObs;
    }

    public void setEquipeObs(byte[] equipeObs) {
        this.equipeObs = equipeObs;
    }

    public byte[] getEquipeLogo() {
        return equipeLogo;
    }

    public void setEquipeLogo(byte[] equipeLogo) {
        this.equipeLogo = equipeLogo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equipeId != null ? equipeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipe)) {
            return false;
        }
        Equipe other = (Equipe) object;
        if ((this.equipeId == null && other.equipeId != null) || (this.equipeId != null && !this.equipeId.equals(other.equipeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //return "formulan.model.Equipe[ equipeId=" + equipeId + " ]";
        return equipeNome;
        
    }
    
}
