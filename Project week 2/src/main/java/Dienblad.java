import java.util.*;
/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordi Olijve
 * @version 1.0
 */

public class Dienblad {
    private Stack<Artikel> artikelen;

    /** Constructor */
    public Dienblad() {
        artikelen = new Stack<Artikel>();
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

}
