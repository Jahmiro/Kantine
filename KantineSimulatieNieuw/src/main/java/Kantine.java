/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordy Olijve
 * @version 1.0
 */

public class Kantine {

    private Kassa kassa;
    private KassaRij kassarij;
    private KantineAanbod KantineAanbod;



    /**
     * Constructor
     */
    public Kantine() {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
        KantineAanbod = KantineAanbod;

    }

    /**
     * In deze methode wordt een Persoon en Dienblad gemaakt en aan elkaar gekoppeld. Maak twee
     * Artikelen aan en plaats deze op het dienblad. Tenslotte sluit de Persoon zich aan bij de rij
     * voor de kassa.
     */

    public void loopPakSluitAan() {

        Persoon persoon1 = new Persoon(1234,"Geert","Lammerd","28-2-1984","m");
        persoon1.setBetaalwijze(new Pinpas());
        Dienblad dienblad1 = new Dienblad();
        Artikel artikel1 = new Artikel("Gehaktbal",2.95);
        Artikel artikel2 = new Artikel("Tosti",1.90);

        persoon1.pakDienblad(dienblad1);
        persoon1.getDienblad().voegToe(artikel1);
        persoon1.getDienblad().voegToe(artikel2);

        kassarij.sluitAchteraan(persoon1);
    }



    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() {
        while(kassarij.erIsEenRij()) {
            Persoon staatBijKassa = kassarij.eerstePersoonInRij();
            kassa.rekenAf(staatBijKassa);
        }
    }



    public Kassa getKassa(){
        return kassa;
    }

    public KantineAanbod getKantineAanbod() {
        return KantineAanbod;
    }

    public void setKantineAanbod(KantineAanbod kantineAanbod) {
        KantineAanbod = kantineAanbod;
    }
}