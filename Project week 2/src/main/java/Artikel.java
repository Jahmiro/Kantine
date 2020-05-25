/**
 * Met deze klasse kunnen artikelen worden aangemaakt.
 *
 * @author Jahmiro Kooijstra, Arjen en Djordi
 * @version 1.0
 */

public class Artikel {
    /**
     * Velden voor het defineren van een artikel
     */
    private String naam;
    private double prijs;

    /**
     * constructor met parameters
     * @param naam De naam van het artikel
     * @param prijs De prijs voor het artikel
     */
    public Artikel(String naam, double prijs)
    {
        setNaam(naam);
        setPrijs(prijs);
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
     *
     * @param nieuweNaam zorgt ervoor dat je een naam aan een artikel kan geven
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
     *
     * @param nieuwePrijs zorgt ervoor dat er een prijs een artikel gegeven kan worden
     */
    public void setPrijs(double nieuwePrijs) {
        this.prijs = nieuwePrijs;
    }

    @Override
    public String toString() {
        return "{" +

                "}";
    }
}
