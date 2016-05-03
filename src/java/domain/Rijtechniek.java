package domain;

/**
 *
 * @author jens
 */
public class Rijtechniek {
    private KnopUitgebreid parkeren;
    private KnopUitgebreid keren;
    private KnopUitgebreid garage;
    private KnopUitgebreid achteruit;
    private KnopUitgebreid stuurOef;
    
    private KnopUitgebreid kijk;
    private KnopUitgebreid aanzettenHelling;
    private KnopUitgebreid schakel;
    private KnopUitgebreid stuurtechniek;
    private KnopUitgebreid rem;
    private KnopUitgebreid koppeling;
    private KnopUitgebreid zithouding;

    public Rijtechniek() {
        this.parkeren = new KnopUitgebreid();
        this.keren = new KnopUitgebreid();
        this.garage = new KnopUitgebreid();
        this.achteruit = new KnopUitgebreid();
        this.stuurOef = new KnopUitgebreid();
        
        this.aanzettenHelling = new KnopUitgebreid();
        this.kijk = new KnopUitgebreid();
        this.schakel = new KnopUitgebreid();
        this.stuurtechniek = new KnopUitgebreid();
        this.rem = new KnopUitgebreid();
        this.koppeling = new KnopUitgebreid();
        this.zithouding = new KnopUitgebreid();
    }

    public KnopUitgebreid getAanzettenHelling() {
        return aanzettenHelling;
    }

    public void setAanzettenHelling(KnopUitgebreid aanzettenHelling) {
        this.aanzettenHelling = aanzettenHelling;
    }

    public KnopUitgebreid getParkeren() {
        return parkeren;
    }

    public void setParkeren(KnopUitgebreid parkeren) {
        this.parkeren = parkeren;
    }

    public KnopUitgebreid getKeren() {
        return keren;
    }

    public void setKeren(KnopUitgebreid keren) {
        this.keren = keren;
    }

    public KnopUitgebreid getGarage() {
        return garage;
    }

    public void setGarage(KnopUitgebreid garage) {
        this.garage = garage;
    }

    public KnopUitgebreid getAchteruit() {
        return achteruit;
    }

    public void setAchteruit(KnopUitgebreid achteruit) {
        this.achteruit = achteruit;
    }

    public KnopUitgebreid getStuurOef() {
        return stuurOef;
    }

    public void setStuurOef(KnopUitgebreid stuurOef) {
        this.stuurOef = stuurOef;
    }

    public KnopUitgebreid getKijk() {
        return kijk;
    }

    public void setKijk(KnopUitgebreid kijk) {
        this.kijk = kijk;
    }

    public KnopUitgebreid getSchakel() {
        return schakel;
    }

    public void setSchakel(KnopUitgebreid schakel) {
        this.schakel = schakel;
    }

    public KnopUitgebreid getStuurtechniek() {
        return stuurtechniek;
    }

    public void setStuurtechniek(KnopUitgebreid stuurtechniek) {
        this.stuurtechniek = stuurtechniek;
    }

    public KnopUitgebreid getRem() {
        return rem;
    }

    public void setRem(KnopUitgebreid rem) {
        this.rem = rem;
    }

    public KnopUitgebreid getKoppeling() {
        return koppeling;
    }

    public void setKoppeling(KnopUitgebreid koppeling) {
        this.koppeling = koppeling;
    }

    public KnopUitgebreid getZithouding() {
        return zithouding;
    }

    public void setZithouding(KnopUitgebreid zithouding) {
        this.zithouding = zithouding;
    }
    
    
}
