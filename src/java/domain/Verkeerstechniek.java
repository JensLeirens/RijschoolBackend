package domain;


public class Verkeerstechniek {
    
    private KnopUitgebreid aanwijzers;
    private KnopUitgebreid rechtsaf;
    private KnopUitgebreid openbareWeg;
    private KnopUitgebreid voorrang;
    private KnopUitgebreid tekens;
    private KnopUitgebreid snelheid;
    private KnopUitgebreid afstanden;
    private KnopUitgebreid inhalen;
    private KnopUitgebreid kruisen;
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
