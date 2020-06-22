/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordy Olijve
 * @version 1.0
 */

public abstract class Betaalwijze {

    protected double saldo;

    /**
     * Methode om krediet te initialiseren
     * @param saldo
     */
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    /**
     * Methode om betaling af te handelen
     * @param tebetalen
     * @return Boolean om te kijken of er voldoende saldo is
     */
    public abstract void betaal(double tebetalen) throws TeWeinigGeldException;
}