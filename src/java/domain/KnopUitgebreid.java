
package domain;

import java.util.ArrayList;
import java.util.List;

public class KnopUitgebreid {
    private Kleur kleur ; 
    private List<String> opmerking; 

    public KnopUitgebreid() {
        this.kleur = Kleur.WHITE;
        this.opmerking = new ArrayList<>();
        
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
