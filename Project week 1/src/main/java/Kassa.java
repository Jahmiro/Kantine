import java.util.*;


public class Kassa {

    private KassaRij kassarij;
    private double inKassa;
    private int verkochteArtikelen;

    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
        this.inKassa = 00.00;
        this.kassarij = kassarij;
        this.verkochteArtikelen = 0;
    }


    /**
     * Vraag het aantal artikelen en de totaalprijs op. Tel deze gegevens op bij de controletotalen
     * die voor de kassa worden bijgehouden. De implementatie wordt later vervangen door een echte
     * betaling door de persoon.
     *
     * @param klant die moet afrekenen
     */
    public void rekenAf(Dienblad klant) {
        inKassa = hoeveelheidGeldInKassa() + klant.getTotaalPrijs();
        verkochteArtikelen = verkochteArtikelen + klant.getAantalArtikelen();
    }

    /**
     * Geeft het aantal artikelen dat de kassa heeft gepasseerd, vanaf het moment dat de methode
     * resetWaarden is aangeroepen.
     *
     * @return aantal artikelen
     */
    public int aantalArtikelen() {
        return verkochteArtikelen;
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die de kass zijn gepasseerd, vanaf het moment dat
     * de methode resetKassa is aangeroepen.
     *
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        return inKassa;
    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en de totale hoeveelheid geld in de
     * kassa.
     */
    public void resetKassa() {
        verkochteArtikelen = 0;
        inKassa = 0;
    }
}
