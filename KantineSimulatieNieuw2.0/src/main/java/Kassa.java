import java.util.*;
/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordy Olijve
 * @version 1.0
 */

public class Kassa {

    private Dienblad dienblad1;
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
    public void rekenAf( Persoon klant )
    {
        Dienblad dienblad = klant.getDienblad();
        Iterator<Artikel> artikelen = dienblad.getArtikelIterator();
        double totaal = 0;
        boolean hasKorting = false;

        while(artikelen.hasNext())
        {
            // zorgt ervoor dat de korting wordt toegepast op de verkochte artikelen
            verkochteArtikelen++;
            Artikel artikel = artikelen.next();
            if(artikel.getKorting() != 0){
                totaal += artikel.getPrijs() * 0.8;
                hasKorting = true;
            }
            else {
                totaal += artikel.getPrijs();
            }
        }
        //conrtoleert als er korting gegeven moet worden
        if(!hasKorting) {
            if (klant instanceof KortingskaartHouder) {
                double korting = totaal * (((KortingskaartHouder) klant).geefKortingsPercentage());
                if (((KortingskaartHouder) klant).heeftMaximum()) {
                    if (korting > ((KortingskaartHouder) klant).geefMaximum()) {
                        korting = ((KortingskaartHouder) klant).geefMaximum();
                    }
                }
            }
        }

        try{
            klant.getBetaalwijze().betaal(totaal);
            inKassa += totaal;
        }
        catch(TeWeinigGeldException e){
            System.out.println(klant.getVoornaam()+ " " + klant.getAchternaam()+" kan niet betalen");
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

