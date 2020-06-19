/**
 * Met deze klasse kunnen artikelen worden aangemaakt.
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordy Olijve
 * @version 1.0
 */

public class Artikel {
    /**
     *  Initialiseer Velden voor artikelen
     */
    private String naam;
    private double prijs;
    private double korting;

    /**
     * constructor met parameters
     * @param naam De naam van het artikel
     * @param prijs De prijs voor het artikel
     */
    public Artikel(String naam, double prijs)
    {
        setNaam(naam);
        setPrijs(prijs);
        korting = 0;
    }

    /**
     * constructor
     * @param naam
     * @param prijs
     * @param korting
     */
    public Artikel(String naam, double prijs, double korting) {
        this.naam = naam;
        this.prijs = prijs;
        this.korting = korting;
    }

    /**
     * contructor zonder parameters
     *
     */
    public Artikel()
    {
        setNaam("Onbekend");
        setPrijs(0.00);
    }

    /**
     *
     * @return geeft de naam terug van het artikel
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Initialiseer de velden voor een artikelnaam
     * @param nieuweNaam
     */
    public void setNaam(String nieuweNaam) {
        this.naam = nieuweNaam;
    }

    /**
     *
     * @return geeft de prijs terug van het artikel
     */
    public double getPrijs() {
        return prijs;
    }

    /**
     * Initialiseer velden voor een artikelprijs
     * @param nieuwePrijs
     */
    public void setPrijs(double nieuwePrijs) {
        this.prijs = nieuwePrijs;
    }

    public double getKorting() {
        return korting;
    }

    public void setKorting(double korting) {
        this.korting = korting;
    }

    /**
     *
     * @return de gegevens van de artikel in een string
     *
     */
    @Override
    public String toString() {
        return  "Artikelnaam: " + getNaam() + "\nArtikelprijs " + getPrijs();
    }
}
