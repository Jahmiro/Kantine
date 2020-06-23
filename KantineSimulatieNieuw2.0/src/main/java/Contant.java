/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordy Olijve
 * @version 1.0
 */

public class Contant extends Betaalwijze {
    /**
     * Methode om te betalen
     * @throws TeWeinigGeldException Als er te weinig geld is om te betalen.
     */
    public void betaal(double tebetalen) throws TeWeinigGeldException {
        if(saldo >= tebetalen) {
            saldo -= tebetalen;
            return;
        }
        throw new TeWeinigGeldException("heeft niet genoeg geld om te betalen.");
    }
}