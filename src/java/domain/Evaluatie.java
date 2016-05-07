package domain;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Evaluatie {
    
    @OneToOne
    private Verkeerstechniek VT;
    @OneToOne
    private Rijtechniek RT;
    @OneToOne
    private Hoofdscherm hoofdscherm;
    private List<String> attitude;
    @Id
    private int nummer;
    

    public Evaluatie(Verkeerstechniek VT, Rijtechniek RT, Hoofdscherm hoofdscherm, List<String> attitude, int nummer) {
        this.VT = new Verkeerstechniek(VT);
        this.RT = new Rijtechniek(RT);
        this.hoofdscherm = new Hoofdscherm(hoofdscherm);
        this.attitude = new ArrayList<>(attitude);
        this.nummer = nummer;
    }

    public Evaluatie() {
    }

    public List<String> getAttitude() {
        return attitude;
    }

    public void setAttitude(List<String> attitude) {
        this.attitude = attitude;

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
