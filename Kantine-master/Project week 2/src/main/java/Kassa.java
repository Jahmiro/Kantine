import java.util.*;
/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordi Olijve
 * @version 1.0
 */

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
     * @param persoon1 die moet afrekenen
     */
    public void rekenAf(Persoon persoon) {
        double betaling = getTotaalPrijs(persoon);
        double kortingsPercentage = 0.00;
        double kortingsBedrag = 0.00;
        boolean heeftMaximum = false;
        try {
            if (persoon instanceof KortingskaartHouder) {
                KortingskaartHouder kaartHouder = (KortingskaartHouder) persoon;
                kortingsPercentage = kaartHouder.geefKortingsPercentage();
                heeftMaximum = kaartHouder.heeftMaximum();
                if (kortingsPercentage > 0) {
                    kortingsBedrag = betaling * kortingsPercentage;
                }
                if (heeftMaximum) {
                    kortingsBedrag = Math.min(kortingsBedrag, kaartHouder.geefMaximum());
                }
            }
            if (persoon.getBetaalwijze().betaal(betaling - kortingsBedrag)) {
                verkochteArtikelen += getAantalArtikelen(persoon);
                inKassa += betaling;
            } else {
                System.out.println("Niet genoeg saldo!");
            }
        }  catch(TeWeinigGeldException e){
            System.out.println(persoon.getVoornaam() + " " + persoon.getAchternaam() + ".");
        }
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

    public int getAantalArtikelen(Persoon persoon){
        Iterator<Artikel> it = persoon.getDienblad().getArtikelIterator();
        int aantal = 0;
        while (it.hasNext()){
            it.next();
            aantal++;
        }
        return aantal;
    }

    public double getTotaalPrijs(Persoon persoon){
        double totaalPrijs = 0.00;
        Iterator<Artikel> it = persoon.getDienblad().getArtikelIterator();
        while (it.hasNext()){
            Artikel artikel = it.next();
            totaalPrijs += artikel.getPrijs();
        }

        return totaalPrijs;
    }
}
}
