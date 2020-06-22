/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordy Olijve
 * @version 1.0
 */

public class Kantine {

    private Kassa kassa;
    private KassaRij kassarij;
    private KantineAanbod kantineAanbod;

    public static double omzetGeld =0;
    public static int omzetArtikelen = 0;

    /**
     * Constructor
     */
    public Kantine() {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
        kantineAanbod = kantineAanbod;

    }


    /**
     * In deze methode wordt een Persoon en Dienblad gemaakt en aan elkaar gekoppeld. Maak twee
     * Artikelen aan en plaats deze op het dienblad. Tenslotte sluit de Persoon zich aan bij de rij
     * voor de kassa.
     */
    public void loopPakSluitAan(Persoon persoon, String[] artikelnamen) {
        //for-loop om door alle artikelnamen te gaan
        for(int i = 0; i < artikelnamen.length; i++){
            //artikel object die bij de artikel string hoort ophalen
            Artikel artikel = kantineAanbod.getArtikel(artikelnamen[i]);
            //artikel toevoegen aan het dienblad
            persoon.getDienblad().voegToe(artikel);
            //dienblad achteraan aansluiten
            kassarij.sluitAchteraan(persoon);
        }
    }



    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() {
        while (kassarij.erIsEenRij()) {
            kassa.rekenAf(kassarij.eerstePersoonInRij());
        }
    }



    public Kassa getKassa(){
        return kassa;
    }

    public KantineAanbod getKantineAanbod() {
        return kantineAanbod;
    }

    public void setKantineAanbod(KantineAanbod nieuwAanbod) {
        kantineAanbod = nieuwAanbod;
    }

    public void resetKassa() {
        omzetArtikelen = 0;
        omzetGeld = 0;
    }
}