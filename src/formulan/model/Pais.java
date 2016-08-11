package formulan.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "pais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pais.findAll", query = "SELECT p FROM Pais p"),
    @NamedQuery(name = "Pais.findByPaisId", query = "SELECT p FROM Pais p WHERE p.paisId = :paisId"),
    @NamedQuery(name = "Pais.findByPaisNome", query = "SELECT p FROM Pais p WHERE p.paisNome = :paisNome"),
    @NamedQuery(name = "Pais.findByPaisSigla", query = "SELECT p FROM Pais p WHERE p.paisSigla = :paisSigla")})
public class Pais implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Pais_Id")
    private Integer paisId;
    @Column(name = "Pais_Nome")
    private String paisNome;
    @Column(name = "Pais_Sigla")
    private String paisSigla;
    @Lob
    @Column(name = "Pais_BandeiraMini")
    private byte[] paisBandeiraMini;
    @Lob
    @Column(name = "Pais_BandeiraMaior")
    private byte[] paisBandeiraMaior;

    public Pais() {
    }

    public Pais(Integer paisId) {
        this.paisId = paisId;
    }

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        Integer oldPaisId = this.paisId;
        this.paisId = paisId;
        changeSupport.firePropertyChange("paisId", oldPaisId, paisId);
    }

    public String getPaisNome() {
        return paisNome;
    }

    public void setPaisNome(String paisNome) {
        String oldPaisNome = this.paisNome;
        this.paisNome = paisNome;
        changeSupport.firePropertyChange("paisNome", oldPaisNome, paisNome);
    }

    public String getPaisSigla() {
        return paisSigla;
    }

    public void setPaisSigla(String paisSigla) {
        String oldPaisSigla = this.paisSigla;
        this.paisSigla = paisSigla;
        changeSupport.firePropertyChange("paisSigla", oldPaisSigla, paisSigla);
    }

    public byte[] getPaisBandeiraMini() {
        return paisBandeiraMini;
    }

    public void setPaisBandeiraMini(byte[] paisBandeiraMini) {
        byte[] oldPaisBandeiraMini = this.paisBandeiraMini;
        this.paisBandeiraMini = paisBandeiraMini;
        changeSupport.firePropertyChange("paisBandeiraMini", oldPaisBandeiraMini, paisBandeiraMini);
    }

    public byte[] getPaisBandeiraMaior() {
        return paisBandeiraMaior;
    }

    public void setPaisBandeiraMaior(byte[] paisBandeiraMaior) {
        byte[] oldPaisBandeiraMaior = this.paisBandeiraMaior;
        this.paisBandeiraMaior = paisBandeiraMaior;
        changeSupport.firePropertyChange("paisBandeiraMaior", oldPaisBandeiraMaior, paisBandeiraMaior);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paisId != null ? paisId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.paisId == null && other.paisId != null) || (this.paisId != null && !this.paisId.equals(other.paisId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //return "formulan.dados.Pais[ paisId=" + paisId + " ]";
        return paisSigla;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
