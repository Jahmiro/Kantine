import java.util.*;
/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordy Olijve
 * @version 1.0
 */

public class Dienblad {
    private Persoon klant;
    private Stack<Artikel> artikelen;

    /** Constructor */
    public Dienblad() {
        artikelen = new Stack<Artikel>();
    }

    public Dienblad(Persoon klant){
        this.klant= klant;
    }
    /**
     * Methode om artikel aan dienblad toe te voegen
     * @param artikel
     */

    public void voegToe(Artikel artikel) {
        artikelen.push(artikel);
    }

    public Iterator<Artikel> getArtikelIterator(){
        return artikelen.iterator();
    }

    /**
     * Getter voor de klant als type Persoon
     * @return klant
     */
    public Persoon getKlant() {
        return klant;
    }

    /**
     * setter voor de klant als type Persoon
     * @param klant
     */
    public void setKlant(Persoon klant) {
        this.klant = klant;
    }

}
