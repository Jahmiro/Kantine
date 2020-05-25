import java.util.ArrayList;

public class KassaRij {
    private ArrayList<Dienblad> dienbladen;

    /**
     * Constructor
     */
    public KassaRij() {
        ArrayList<Dienblad> dienbladen = new ArrayList<Dienblad>();

    }

    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant
     */
    public void sluitAchteraan(Dienblad klant) {
        dienbladen.add(klant);
    }

    /**
     * Indien er een rij bestaat, de eerste klant uit de rij verwijderen en retourneren. Als er
     * niemand in de rij staat geeft deze null terug.
     *
     * @return Eerste klant in de rij of null
     */
    public Dienblad eerstePersoonInRij() {
        if (erIsEenRij()) {
            Dienblad temp = dienbladen.get(0);
            dienbladen.remove(0);
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
        if(dienbladen.size()>0){
            return true;
        }
        return false;
    }
}