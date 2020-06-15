/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordi Olijve
 * @version 1.0
 */

public class Pinpas extends Betaalwijze {
    private double kredietlimiet;

    /**
     * Methode om kredietlimiet te zetten
     * @param kredietlimiet
     */
    public void setKredietLimiet(double kredietlimiet) {
        this.kredietlimiet = kredietlimiet;
    }

    /**
     * Methode om betaling af te handelen.
     * @return
     */
    public boolean betaal(double tebetalen) throws TeWeinigGeldException {
        if(kredietlimiet >= tebetalen) {
            if(saldo >= tebetalen) {
                saldo = saldo-tebetalen;
            } else {
                throw new TeWeinigGeldException("Saldo te laag");
            }
        } else {
            throw new TeWeinigGeldException("Kredietlimiet overschreden");
        }
        return false;
    }
}