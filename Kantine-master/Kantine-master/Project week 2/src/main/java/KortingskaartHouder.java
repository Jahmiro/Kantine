/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordy Olijve
 * @version 1.0
 */

public interface KortingskaartHouder {

    /**
     * Methode om kortingspercentage op te vragen
     */
    public double geefKortingsPercentage();

    /**
     * Methode om op te vragen of er maximum per keer aan de korting zit
     */
    public boolean heeftMaximum();

    /**
     * Methode om het maximum kortingsbedrag op te vragen
     */
    public double geefMaximum();
}
