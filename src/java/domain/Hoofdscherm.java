/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Jorit
 */
@Entity
public class Hoofdscherm {
    @Id @GeneratedValue
    private int id;
    
    @Embedded
    private KnopUitgebreid banden;
    @Embedded
    private KnopUitgebreid vloeistof;
    @Embedded
    private KnopUitgebreid schakelaar;
    @Embedded
    private KnopUitgebreid rotonde;
    @Embedded
    private KnopUitgebreid rijBaanMetRijstroken;
    @Embedded
    private KnopUitgebreid stad;
    @Embedded
    private KnopUitgebreid autoSnelweg;
    @Embedded
    private KnopUitgebreid tanken;
    @Embedded
    private KnopUitgebreid gps;
    @Embedded
    private KnopUitgebreid stop;
    private double evolutie;

    public Hoofdscherm() {
        banden = new KnopUitgebreid();
        vloeistof = new KnopUitgebreid();
        schakelaar = new KnopUitgebreid();
        
        rotonde = new KnopUitgebreid();
        rijBaanMetRijstroken = new KnopUitgebreid();
        stad = new KnopUitgebreid();
        autoSnelweg = new KnopUitgebreid();
        
        tanken = new KnopUitgebreid();
        gps = new KnopUitgebreid();
        stop = new KnopUitgebreid();
        evolutie = 0;
    }
    
    public Hoofdscherm(Hoofdscherm h){
        rotonde = new KnopUitgebreid(h.getRotonde());
        banden = new KnopUitgebreid(h.getBanden());
        vloeistof = new KnopUitgebreid(h.getVloeistof());
        schakelaar = new KnopUitgebreid(h.getSchakelaar());
        
        rotonde = new KnopUitgebreid(h.getRotonde());
        rijBaanMetRijstroken = new KnopUitgebreid(h.getRijBaanMetRijstroken());
        stad = new KnopUitgebreid(h.getStad());
        autoSnelweg = new KnopUitgebreid(h.getAutoSnelweg());
        
        tanken = new KnopUitgebreid(h.getTanken());
        gps = new KnopUitgebreid(h.getGps());
        stop = new KnopUitgebreid(h.getStop());
        evolutie = h.getEvolutie();
    }
    
    public KnopUitgebreid getBanden() {
        return banden;
    }

    public double getEvolutie() {
        return evolutie;
    }

    public void setEvolutie(double evolutie) {
        this.evolutie = evolutie;
    }

    public void setBanden(KnopUitgebreid banden) {
        this.banden = banden;
    }

    public KnopUitgebreid getVloeistof() {
        return vloeistof;
    }

    public void setVloeistof(KnopUitgebreid vloeistof) {
        this.vloeistof = vloeistof;
    }

    public KnopUitgebreid getSchakelaar() {
        return schakelaar;
    }

    public void setSchakelaar(KnopUitgebreid schakelaar) {
        this.schakelaar = schakelaar;
    }

    public KnopUitgebreid getRotonde() {
        return rotonde;
    }

    public void setRotonde(KnopUitgebreid rotonde) {
        this.rotonde = rotonde;
    }

    public KnopUitgebreid getRijBaanMetRijstroken() {
        return rijBaanMetRijstroken;
    }

    public void setRijBaanMetRijstroken(KnopUitgebreid rijBaanMetRijstroken) {
        this.rijBaanMetRijstroken = rijBaanMetRijstroken;
    }

    public KnopUitgebreid getStad() {
        return stad;
    }

    public void setStad(KnopUitgebreid stad) {
        this.stad = stad;
    }

    public KnopUitgebreid getAutoSnelweg() {
        return autoSnelweg;
    }

    public void setAutoSnelweg(KnopUitgebreid autoSnelweg) {
        this.autoSnelweg = autoSnelweg;
    }

    public KnopUitgebreid getTanken() {
        return tanken;
    }

    public void setTanken(KnopUitgebreid tanken) {
        this.tanken = tanken;
    }

    public KnopUitgebreid getGps() {
        return gps;
    }

    public void setGps(KnopUitgebreid gps) {
        this.gps = gps;
    }

    public KnopUitgebreid getStop() {
        return stop;
    }

    public void setStop(KnopUitgebreid stop) {
        this.stop = stop;
    }

    
    
}
