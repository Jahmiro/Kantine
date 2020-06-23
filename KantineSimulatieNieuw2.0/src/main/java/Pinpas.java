/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordy Olijve
 * @version 1.0
 */

public class Pinpas extends Betaalwijze {
    private double kredietlimiet;

    /**
     * Methode om een kredietlimiet te zetten
     * @param kredietlimiet
     */
    public void setKredietLimiet(double kredietlimiet)
    {
        this.kredietlimiet = kredietlimiet;
    }

    /**
     * Methode om te betalen
     * @throws TeWeinigGeldException Als er te weinig saldo is om te betalen.
     */
    public void betaal(double tebetalen) throws TeWeinigGeldException
    {
        if(kredietlimiet <= saldo - tebetalen) {
            saldo -= tebetalen;
            return;
        }
        throw new TeWeinigGeldException("heeft niet genoeg saldo.");
    }
}