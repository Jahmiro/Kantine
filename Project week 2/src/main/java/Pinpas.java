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
        //omitted
    }

    /**
     * Methode om betaling af te handelen
     * @return true of false
     */
    public boolean betaal(double tebetalen) {
        if (saldo+kredietlimiet >= tebetalen)
        {
            saldo -= tebetalen;
            return true;
        }
        return false;
    }
}
