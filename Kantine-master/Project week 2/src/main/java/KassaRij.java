import java.util.*;
/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordi Olijve
 * @version 1.0
 */

public class KassaRij {

    private LinkedList<Persoon> rij;

    /**
     * Constructor
     */
    public KassaRij() {
        // Nieuwe rij maken
        rij = new LinkedList<Persoon>();
    }

    /**
     * Persoon sluit achter in de rij aan
     * @param persoon
     */
    public void sluitAchteraan(Persoon persoon) {
        //Zet persoon achter in de ArrayList
        rij.add(persoon);
    }

    /**
     * Indien er een rij bestaat, de eerste Persoon uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze null terug.
     * @return Eerste persoon in de rij of null
     */
    public Persoon eerstePersoonInRij() {
        if(rij.size() == 0)
        {
            return null;
        }
        else
        {
            // Eerste in de rij in een extra variabele zetten
            Persoon eerste = rij.get(0);
            // Verwijderen uit de rij
            rij.remove(0);
            // Variabele die eerste stond verwijderen;
            return eerste;
        }

    }

    /**
     * Methode kijkt of er personen in de rij staan.
     * Of er wel of geen rij bestaat
     * @return boolean
     */
    public boolean erIsEenRij() {
        //method body omitted
        return(rij.size() > 0);
    }

}