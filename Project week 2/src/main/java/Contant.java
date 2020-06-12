/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordi Olijve
 * @version 1.0
 */

public class Contant extends Betaalwijze {
    /**
     * Methode om betaling af te handelen
     */
    public boolean betaal(double tebetalen) {
        if (saldo >= tebetalen){
            saldo -= tebetalen;
            return true;
        }
        return false;
    }
}
