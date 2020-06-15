/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordi Olijve
 * @version 1.0
 */

public class Contant extends Betaalwijze {
    /**
     * Methode om betaling af te handelen.
     */
    public void betaal(double tebetalen) throws TeWeinigGeldException {
        if(saldo >= tebetalen) {
            saldo = saldo-tebetalen;
        } else {
            throw new TeWeinigGeldException("Geen geld");
        }
    }
}