public class Kantine {

    private Kassa kassa;
    private KassaRij kassarij;
    private KantineAanbod kantineAanbod;

    /**
     * Constructor
     */
    public Kantine() {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
    }

    /**
     * In deze methode wordt een Persoon en Dienblad gemaakt en aan elkaar gekoppeld. Maak twee
     * Artikelen aan en plaats deze op het dienblad. Tenslotte sluit de Persoon zich aan bij de rij
     * voor de kassa.
     */
    public void loopPakSluitAan(Persoon persoon, String[] artikelnamen) {

        for(int i=0; i < artikelnamen.length; i++){
            persoon.getDienblad().voegToe(aanbod.getArtikel(artikelnamen[i]));
        }
    }
    public void loopPakSluitAan() {

        Persoon persoon1 = new Persoon(1234,"Arjen","Dijk",14,9,2000,'m');
        Dienblad dienblad1 = new Dienblad();
        Artikel artikel1 = new Artikel("Patat",2.00);
        Artikel artikel2 = new Artikel("Tosti",1.50);

        persoon1.pakDienblad(dienblad1);
        persoon1.getDienblad().voegToe(artikel1);
        persoon1.getDienblad().voegToe(artikel2);

        kassarij.sluitAchteraan(persoon1);

    }
    /**
     * in deze methode wordt een dienblad met artikelen
     * in de kassarij geplaatst
     * @param dienblad
     *
     */
    public void loopPakSluitAan(Dienblad dienblad, String[] artikelnamen) {
        for(String naam : artikelnamen){
            dienblad.voegToe(kantineaanbod.getArtikel(naam));
        }
        kassarij.sluitAchteraan(dienblad);
    }

    /**
     * in deze methode wordt een dienblad met artikelen
     * in de kassarij geplaatst
     * @param dienblad
     *
     */
    public void loopPakSluitAan(Dienblad dienblad, String[] artikelnamen) {
        for(String naam : artikelnamen){
            dienblad.voegToe(kantineaanbod.getArtikel(naam));
        }
        kassarij.sluitAchteraan(dienblad);
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



    /**
     * Deze methode telt het geld uit de kassa
     *
     * @return hoeveelheid geld in kassa
     */
    public double hoeveelheidGeldInKassa() {
        // method body omitted
    }

    /**
     * Deze methode geeft het aantal gepasseerde artikelen.
     *
     * @return het aantal gepasseerde artikelen
     */
    public int aantalArtikelen() {
        // method body omitted
    }


    /**
     * Deze methode reset de bijgehouden telling van het aantal artikelen en "leegt" de inhoud van
     * de kassa.
     */
    public void resetKassa() {
        // method body omitted
    }
    public Kassa getKassa(){
        return kassa;
    }
}