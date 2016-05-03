package domain;

public class Evaluatie {
    
    private Verkeerstechniek VT; 
    private Rijtechniek RT;
    private Hoofdscherm hoofdscherm;

    public Evaluatie(Verkeerstechniek VT, Rijtechniek RT, Hoofdscherm hoofdscherm) {
        this.VT = VT;
        this.RT = RT;
        this.hoofdscherm = hoofdscherm;
    }

    public Evaluatie() {
    }

    
    public Verkeerstechniek getVT() {
        return VT;
    }

    public void setVT(Verkeerstechniek VT) {
        this.VT = VT;
    }

    public Rijtechniek getRT() {
        return RT;
    }

    public void setRT(Rijtechniek RT) {
        this.RT = RT;
    }

    public Hoofdscherm getHoofdscherm() {
        return hoofdscherm;
    }

    public void setHoofdscherm(Hoofdscherm hoofdscherm) {
        this.hoofdscherm = hoofdscherm;
    }
    
    
    
    
}
