/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Jorit
 */
public class Hoofdscherm {
    
    private KnopUitgebreid banden;
    private KnopUitgebreid vloeistof;
    private KnopUitgebreid schakelaar;
    
    private KnopUitgebreid rotonde;
    private KnopUitgebreid rijBaanMetRijstroken;
    private KnopUitgebreid stad;
    private KnopUitgebreid autoSnelweg;
    
    private KnopUitgebreid tanken;
    private KnopUitgebreid gps;
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
