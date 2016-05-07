package domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author jens
 */
@Entity
public class Rijtechniek {
    
    @Id @GeneratedValue
    private int id;
    @Embedded
    private KnopUitgebreid parkeren;
    @Embedded
    private KnopUitgebreid keren;
    @Embedded
    private KnopUitgebreid garage;
    @Embedded
    private KnopUitgebreid achteruit;
    @Embedded
    private KnopUitgebreid stuurOef;
    @Embedded
    private KnopUitgebreid kijk;
    @Embedded
    private KnopUitgebreid aanzettenHelling;
    @Embedded
    private KnopUitgebreid schakel;
    @Embedded
    private KnopUitgebreid stuurtechniek;
    @Embedded
    private KnopUitgebreid rem;
    @Embedded
    private KnopUitgebreid koppeling;
    @Embedded
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
    
    public Rijtechniek(Rijtechniek r) {
        this.parkeren = new KnopUitgebreid(r.getParkeren());
        this.keren = new KnopUitgebreid(r.getKeren());
        this.garage = new KnopUitgebreid(r.getGarage());
        this.achteruit = new KnopUitgebreid(r.getAchteruit());
        this.stuurOef = new KnopUitgebreid(r.getStuurOef());
        
        this.aanzettenHelling = new KnopUitgebreid(r.getAanzettenHelling());
        this.kijk = new KnopUitgebreid(r.getKijk());
        this.schakel = new KnopUitgebreid(r.getSchakel());
        this.stuurtechniek = new KnopUitgebreid(r.getStuurtechniek());
        this.rem = new KnopUitgebreid(r.getRem());
        this.koppeling = new KnopUitgebreid(r.getKoppeling());
        this.zithouding = new KnopUitgebreid(r.getZithouding());

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
