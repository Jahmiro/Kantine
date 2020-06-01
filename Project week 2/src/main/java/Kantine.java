/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordi Olijve
 * @version 1.0
 */

public class Kantine {

    private Kassa kassa;
    private KassaRij kassarij;
  private Persoon persoon;
  private Persoon persoon1;
      
  private Artikel artikel1;
  private Artikel artikel2;

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
  
    public void loopPakSluitAan() {

        Persoon persoon = new Persoon(1234,"Arjen","Dijk",14,9,2000,'m');
         Dienblad dienblad1 = new Dienblad();
        Artikel artikel1 = new Artikel("Patat",2.00);
        Artikel artikel2 = new Artikel("Tosti",1.50);

        persoon.pakDienblad(dienblad1);
        artikel1 = new Artikel("Bier", 5);
        artikel2 = new Artikel("Pizza", 10);
        
        persoon.pakArtikel(artikel1);
        persoon.pakArtikel(artikel2);
                
        kassarij.sluitAchteraan(persoon);
    
    } 
    

  
    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRij(){
        while(kassarij.isErEenRij()){
            persoon1 = kassarij.eerstePersoonInRij();
            kassa.rekenAf(persoon1);
            kassarij.verwijderPersoonUitRij();
        }
    }


    /**
     * Deze methode reset de bijgehouden telling van het aantal artikelen en "leegt" de inhoud van
     * de kassa.
     */
    public void resetKassa() {
        aantalArtikelen = 0;
        hoeveelheidGeld = 0;
    }
    public Kassa getKassa(){
        return kassa;
    }

    public void setKantineAanbod(KantineAanbod kantineaanbod) {
    }
}