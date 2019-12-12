package labosns;
// Generated Oct 27, 2019 7:19:04 PM by Hibernate Tools 4.3.1


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * RadnaMjesta generated by hbm2java
 */
@Entity
@Table(name="radna_mjesta"
    ,catalog="laboratorija"
)
public class RadnaMjesta  implements java.io.Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);


@Id
    @Column(name="id", unique=true, nullable=false)
     private int id;
@Column(name="Datum", length=45)
     private String datum;
@Column(name="Prijem1", length=45)
     private String prijem1;
@Column(name="Prijem2", length=45)
     private String prijem2;
@Column(name="Prijem3", length=45)
     private String prijem3;
@Column(name="Djeca", length=45)
     private String djeca;
@Column(name="Kucneposjete", length=45)
     private String kucnePosjete;
@Column(name="Drugasmijena", length=45)
     private String drugaSmijena;
@Column(name="Hitni", length=45)
     private String hitni;
@Column(name="Separacija", length=45)
     private String separacija;
@Column(name="Urinisediment", length=45)
     private String uriniSediment;
@Column(name="Urinipriprema", length=45)
     private String uriniPriprema;

    public RadnaMjesta() {
    }

	
    public RadnaMjesta(int id) {
        this.id = id;
    }
    public RadnaMjesta( String datum, String prijem1, String prijem2, String prijem3, String djeca, String kucnePosjete, String drugaSmijena, String hitni, String separacija, String uriniSediment, String uriniPriprema) {
       this.datum = datum;
       this.prijem1 = prijem1;
       this.prijem2 = prijem2;
       this.prijem3 = prijem3;
       this.djeca = djeca;
       this.kucnePosjete = kucnePosjete;
       this.drugaSmijena = drugaSmijena;
       this.hitni = hitni;
       this.separacija = separacija;
       this.uriniSediment = uriniSediment;
       this.uriniPriprema = uriniPriprema;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        int oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    
    public String getDatum() {
        return this.datum;
    }
    
    public void setDatum(String datum) {
        String oldDatum = this.datum;
        this.datum = datum;
        changeSupport.firePropertyChange("datum", oldDatum, datum);
    }

    
    public String getPrijem1() {
        return this.prijem1;
    }
    
    public void setPrijem1(String prijem1) {
        String oldPrijem1 = this.prijem1;
        this.prijem1 = prijem1;
        changeSupport.firePropertyChange("prijem1", oldPrijem1, prijem1);
    }

    
    public String getPrijem2() {
        return this.prijem2;
    }
    
    public void setPrijem2(String prijem2) {
        String oldPrijem2 = this.prijem2;
        this.prijem2 = prijem2;
        changeSupport.firePropertyChange("prijem2", oldPrijem2, prijem2);
    }

    
    public String getPrijem3() {
        return this.prijem3;
    }
    
    public void setPrijem3(String prijem3) {
        String oldPrijem3 = this.prijem3;
        this.prijem3 = prijem3;
        changeSupport.firePropertyChange("prijem3", oldPrijem3, prijem3);
    }

    
    public String getDjeca() {
        return this.djeca;
    }
    
    public void setDjeca(String djeca) {
        String oldDjeca = this.djeca;
        this.djeca = djeca;
        changeSupport.firePropertyChange("djeca", oldDjeca, djeca);
    }

    
    public String getKucnePosjete() {
        return this.kucnePosjete;
    }
    
    public void setKucnePosjete(String kucnePosjete) {
        String oldKucnePosjete = this.kucnePosjete;
        this.kucnePosjete = kucnePosjete;
        changeSupport.firePropertyChange("kucnePosjete", oldKucnePosjete, kucnePosjete);
    }

    
    public String getDrugaSmijena() {
        return this.drugaSmijena;
    }
    
    public void setDrugaSmijena(String drugaSmijena) {
        String oldDrugaSmijena = this.drugaSmijena;
        this.drugaSmijena = drugaSmijena;
        changeSupport.firePropertyChange("drugaSmijena", oldDrugaSmijena, drugaSmijena);
    }

    
    public String getHitni() {
        return this.hitni;
    }
    
    public void setHitni(String hitni) {
        String oldHitni = this.hitni;
        this.hitni = hitni;
        changeSupport.firePropertyChange("hitni", oldHitni, hitni);
    }

    
    public String getSeparacija() {
        return this.separacija;
    }
    
    public void setSeparacija(String separacija) {
        String oldSeparacija = this.separacija;
        this.separacija = separacija;
        changeSupport.firePropertyChange("separacija", oldSeparacija, separacija);
    }

    
    public String getUriniSediment() {
        return this.uriniSediment;
    }
    
    public void setUriniSediment(String uriniSediment) {
        String oldUriniSediment = this.uriniSediment;
        this.uriniSediment = uriniSediment;
        changeSupport.firePropertyChange("uriniSediment", oldUriniSediment, uriniSediment);
    }

    
    public String getUriniPriprema() {
        return this.uriniPriprema;
    }
    
    public void setUriniPriprema(String uriniPriprema) {
        String oldUriniPriprema = this.uriniPriprema;
        this.uriniPriprema = uriniPriprema;
        changeSupport.firePropertyChange("uriniPriprema", oldUriniPriprema, uriniPriprema);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }




}


