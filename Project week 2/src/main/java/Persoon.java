
public class Persoon{
    private int bsn;
    private String voornaam;
    private String achternaam;
    private String geboortedatum;
    private String geslacht;

    /**
     * Lege constructor
     */
    public Persoon() {
    }

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
     */
    public int getBsn() {
        return bsn;
    }

    /**
     *
     * @return Geeft de voornaam van een persoon terug
     */
    public String getVoornaam() {
        return voornaam;
    }

    /**
     *
     * @return geeft de Achternaam van een persoon terug
     */
    public String getAchternaam() {
        return achternaam;
    }

    /**
     *
     * @return geeft de geboortedatum van een persoon terug
     */
    public String getGeboortedatum() {
        return geboortedatum;
    }

    /**
     *
     * @return geeft het geslacht van een persoon terug
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

    public void setBsn(int bsn) {
        this.bsn = bsn;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public void setGeboortedatum(String geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public void pakDienblad(Dienblad dienbladKlant) {
    }

    @Override
    public String toString() {
        return  "Naam: "+ getVoornaam() + " " + getAchternaam() + "\nBSN: "+ getBsn()+ "\nGeboortedatum: "+ getGeboortedatum()+"\nGeslacht: "+ getGeslacht();
    }

    }


