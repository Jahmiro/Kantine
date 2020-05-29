import java.util.*;
/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordi Olijve
 * @version 1.0
 */

public class Dienblad {
    public Stack<Artikel> artikelen;
    private String klant;
    /**
     * Constructor
     */
    public Dienblad() {
        artikelen = new Stack<Artikel>();
    }

    public Dienblad(Stack<Artikel> artikelen) {
        this.artikelen = artikelen;
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     *
     * @param artikel
     */
    public void voegToe(Artikel artikel) {
        artikelen.add(artikel);

    }

    /**
     * Methode om aantal artikelen op dienblad te tellen
     *
     * @return Het aantal artikelen
     */

    public int getAantalArtikelen() {

        return artikelen.size();
    }

    public String getKlant() {
        return this.klant;
    }

    public void setKlant(String klant) {
        this.klant = klant;
    }
    /**
     * Methode om de totaalprijs van de artikelen op dienblad uit te rekenen
     *
     * @return De totaalprijs
     */
    public double getTotaalPrijs() {
        double totaalPrijs = new double(0.00);
        for(Artikel artikel : artikelen) {
            totaalPrijs = totaalPrijs.add(artikel.getPrijs());
        }
        return totaalPrijs;
    }

}

