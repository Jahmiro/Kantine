/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordy Olijve
 * @version 1.0
 */

public class Pinpas extends Betaalwijze {
    private double kredietlimiet;

    /**
     * Methode om kredietlimiet te zetten
     * @param kredietlimiet
     */
    public void setKredietLimiet(double kredietlimiet) {
        //omitted
    }

    /**
     * Methode om betaling af te handelen.
     * @return
     */
    public void betaal(double tebetalen) throws TeWeinigGeldException {
        if (kredietlimiet >= tebetalen) {
            if (saldo >= tebetalen) {
                saldo = saldo - tebetalen;
            } else {
                throw new TeWeinigGeldException("Saldo te laag");
            }
        } else {
            throw new TeWeinigGeldException("Kredietlimiet overschreden");
        }
    }
}