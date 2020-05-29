import java.util.*;
/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordi Olijve
 * @version 1.0
 */

public class KassaRij {
    private LinkedList<Dienblad> persoon;

    /**
     * Constructor
     */
    public KassaRij() {
        persoon = new LinkedList<Dienblad>();
    }

    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant
     */
    public void sluitAchteraan(Dienblad klant) {
        persoon.add(klant);
    }

    /**
     * Indien er een rij bestaat, de eerste klant uit de rij verwijderen en retourneren. Als er
     * niemand in de rij staat geeft deze null terug.
     *
     * @return Eerste klant in de rij of null
     */
    public Dienblad eerstePersoonInRij() {
        if (erIsEenRij()) {
            Dienblad temp = persoon.get(0);
            persoon.remove(0);
            return temp;
        }
        return null;
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {
        if(persoon.size()>0){
            return true;
        }
        return false;
    }
}