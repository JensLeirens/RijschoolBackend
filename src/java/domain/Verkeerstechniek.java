package domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Verkeerstechniek {
    @Id @GeneratedValue
    private int id;
    @Embedded
    private KnopUitgebreid aanwijzers;
    @Embedded
    private KnopUitgebreid rechtsaf;
    @Embedded
    private KnopUitgebreid openbareWeg;
    @Embedded
    private KnopUitgebreid voorrang;
    @Embedded
    private KnopUitgebreid tekens;
    @Embedded
    private KnopUitgebreid snelheid;
    @Embedded
    private KnopUitgebreid afstanden;
    @Embedded
    private KnopUitgebreid inhalen;
    @Embedded
    private KnopUitgebreid kruisen;
    @Embedded
    private KnopUitgebreid linksaf;

    public Verkeerstechniek() {
        this.aanwijzers = new KnopUitgebreid();
        this.rechtsaf = new KnopUitgebreid();
        this.openbareWeg = new KnopUitgebreid();
        this.voorrang = new KnopUitgebreid();
        this.tekens = new KnopUitgebreid();
        this.snelheid = new KnopUitgebreid();
        this.afstanden = new KnopUitgebreid();
        this.inhalen = new KnopUitgebreid();
        this.kruisen = new KnopUitgebreid();
        this.linksaf = new KnopUitgebreid();
    }
    
    public Verkeerstechniek(Verkeerstechniek v){
        this.aanwijzers = new KnopUitgebreid(v.getAanwijzers());
        this.rechtsaf = new KnopUitgebreid(v.getRechtsaf());
        this.openbareWeg = new KnopUitgebreid(v.getOpenbareWeg());
        this.voorrang = new KnopUitgebreid(v.getVoorrang());
        this.tekens = new KnopUitgebreid(v.getTekens());
        this.snelheid = new KnopUitgebreid(v.getSnelheid());
        this.afstanden = new KnopUitgebreid(v.getAfstanden());
        this.inhalen = new KnopUitgebreid(v.getInhalen());
        this.kruisen = new KnopUitgebreid(v.getKruisen());
        this.linksaf = new KnopUitgebreid(v.getLinksaf());

    }

    public KnopUitgebreid getAanwijzers() {
        return aanwijzers;
    }

    public void setAanwijzers(KnopUitgebreid aanwijzer) {
        this.aanwijzers = aanwijzer;
    }

    public KnopUitgebreid getRechtsaf() {
        return rechtsaf;
    }

    public void setRechtsaf(KnopUitgebreid rechtsaf) {
        this.rechtsaf = rechtsaf;
    }

    public KnopUitgebreid getOpenbareWeg() {
        return openbareWeg;
    }

    public void setOpenbareWeg(KnopUitgebreid openbareWeg) {
        this.openbareWeg = openbareWeg;
    }

    public KnopUitgebreid getVoorrang() {
        return voorrang;
    }

    public void setVoorrang(KnopUitgebreid voorrang) {
        this.voorrang = voorrang;
    }

    public KnopUitgebreid getTekens() {
        return tekens;
    }

    public void setTekens(KnopUitgebreid tekens) {
        this.tekens = tekens;
    }

    public KnopUitgebreid getSnelheid() {
        return snelheid;
    }

    public void setSnelheid(KnopUitgebreid snelheid) {
        this.snelheid = snelheid;
    }

    public KnopUitgebreid getAfstanden() {
        return afstanden;
    }

    public void setAfstanden(KnopUitgebreid afstanden) {
        this.afstanden = afstanden;
    }

    public KnopUitgebreid getInhalen() {
        return inhalen;
    }

    public void setInhalen(KnopUitgebreid inhalen) {
        this.inhalen = inhalen;
    }

    public KnopUitgebreid getKruisen() {
        return kruisen;
    }

    public void setKruisen(KnopUitgebreid kruisen) {
        this.kruisen = kruisen;
    }

    public KnopUitgebreid getLinksaf() {
        return linksaf;
    }

    public void setLinksaf(KnopUitgebreid linksaf) {
        this.linksaf = linksaf;
    }
    
    
}
