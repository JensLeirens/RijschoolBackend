
package domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Embeddable
public class KnopUitgebreid {
    
    @Enumerated(EnumType.STRING)
    private Kleur kleur ; 
    private List<String> opmerking; 

    public KnopUitgebreid() {
        this.kleur = Kleur.WHITE;
        this.opmerking = new ArrayList<>();
    }
    
    public KnopUitgebreid(KnopUitgebreid k){
        this.kleur = k.getKleur();
        this.opmerking = new ArrayList<> (k.getOpmerking());

    }
    
    public Kleur getKleur() {
        return kleur;
    }

    public void setKleur(Kleur kleur) {
        this.kleur = kleur;
    }

    public List<String> getOpmerking() {
        return opmerking;
    }

    public void setOpmerking(List<String> opmerking) {
        this.opmerking = opmerking;
    }
    
}
