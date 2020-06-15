/**
 * Met deze klasse wordt er een persoon aangemaakt
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordi Olijve
 * @version 1.0
 */

public class Persoon{
    private int bsn;
    private String voornaam;
    private String achternaam;
    private String geboortedatum;
    private String geslacht;
    private Betaalwijze betaalwijze; 
    private Dienblad dienblad;       

    /**
     * Constructor met parameter
     */
    public Persoon(int bsn, String voornaam, String achternaam, String geboortedatum, String geslacht) {
        this.bsn = bsn;                         //Bsn van een persoon
        this.voornaam = voornaam;               //Voornaam van een persoon
        this.achternaam = achternaam;           // Achternaam van een persoon
        this.geboortedatum = geboortedatum;     //Geboortedatum van een persoon
        this.geslacht = geslacht;               //Geslacht van een persoon
    
    }


    /**
     *
     * @return Geeft de Bsn van een persoon terug
     *
     */
    public int getBsn() {
        return bsn;
    }
 /**
    * Methode om dienblad te koppelen aan een persoon
    * Als het persoon geen dienblad heeft maakt dan een nieuwe aan.
    * @param dienblad
    */
   
    /**
     *
     * @return Geeft de voornaam van een persoon terug
     *
     */
    public String getVoornaam() {
        return voornaam;
    }

    /**
     *
     * @return geeft de Achternaam van een persoon terug
     *
     */
    public String getAchternaam() {
        return achternaam;
    }

    /**
     *
     * @return geeft de geboortedatum van een persoon terug
     *
     */
    public String getGeboortedatum() {
        return geboortedatum;
    }

    /**
     *
     * @return geeft het geslacht van een persoon terug
     *
     */
    public String getGeslacht() {
        {//voert een controle uit op de invoer van geslacht
            if(geslacht.equals("v") || geslacht.equals("V") || geslacht.equals("vrouw") || geslacht.equals("Vrouw") || geslacht.equals("VROUW")){
                return "Vrouw";
            } else if(geslacht.equals("m") || geslacht.equals("M") || geslacht.equals("man") || geslacht.equals("Man") || geslacht.equals("MAN")){
                return "Man";
            } else{
                return "Onbekende invoer";
            }}
    }
 /**
     * Methode:
     * Return de betaalwijze van een persoon
     * @return Betaalwijze betaalwijze;
     */
    public Betaalwijze getBetaalwijze() {
        return betaalwijze;
    }
         /**
     * Methode:
     * set de betaalwijze van een persoon
     * @param betaalwijze
     */
    public void setBetaalwijze(Betaalwijze betaalwijze){
        this.betaalwijze = betaalwijze;
    }    
    /**
     *
     * Initialiseer velden voor een bsn
     * @param bsn
     *
     */
    public void setBsn(int bsn) {
        this.bsn = bsn;
    }

    /**
     *
     * Initialiseer velden voor een voornaam
     * @param voornaam
     *
     */
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    /**
     *
     * Initialiseer velden voor een achternaam
     * @param achternaam
     *
     */
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    /**
     *
     * Initialiseer velden voor een geboortedatum
     * @param geboortedatum
     *
     */
    public void setGeboortedatum(String geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    /**
     *
     * Initialiseer velden voor een geslacht
     * @param geslacht
     *
     */
    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public void pakDienblad(Dienblad dienblad)
    {
        this.dienblad = dienblad;
    }
    

    public Dienblad getDienblad(){
        return dienblad;
    }
    /**
     *
     * @return de gegevens van de persoon in een string
     *
     */
    @Override
    public String toString() {
        return  "Naam: "+ getVoornaam() + " " + getAchternaam() + "\nBSN: "+ getBsn()+ "\nGeboortedatum: "+ getGeboortedatum()+"\nGeslacht: "+ getGeslacht();
    }

    }


