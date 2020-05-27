
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

    public void getPersoon(int bsn, String voornaam, String achternaam, String geboortedatum, String geslacht){
        this.bsn = bsn;//zorgt ervoor dat je een BSN kan invullen
        this.voornaam = voornaam;//zorgt ervoor dat je een voornaam kan invullen
        this.achternaam = achternaam;//zorgt ervoor dat je een achternaam kan invullen
        this.geboortedatum = geboortedatum;//zorgt ervoor dat je een geboortedatum kan invullen
        this.geslacht = geslacht;//zorgt ervoor dat je een geslacht kan invullen
    }

    public void pakDienblad(Dienblad dienbladKlant) {
    }

    public class Datum{
        public void getDatumAsString() {
        }

    }

    @Override
    public String toString() {
        return  "Naam: "+ getVoornaam() + " " + getAchternaam() + "\nBSN: "+ getBsn()+ "\nGeboortedatum: "+ getGeboortedatum()+"\nGeslacht: "+ getGeslacht();
    }

    }


