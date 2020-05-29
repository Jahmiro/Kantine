public class Docent extends Persoon
{
    private String afkorting;
    private String afdeling;

    /**
     * Constructor
     * velden voor het definieren van een Docent
     * @params bsn, voornaam, achternaam, geboortedatum, geslacht, afkorting, afdeling
     */
    public Docent(int bsn, String voornaam, String achternaam, String geboortedatum, String geslacht
            ,String afkorting, String afdeling)
    {
        super(bsn,  voornaam,  achternaam,  geboortedatum, geslacht);
        setAfkorting(afkorting);
        setAfdeling(afdeling);
    }

    /**
     *
     *velden voor het definieren van een afkorting
     * @param afkorting
     *
     */
    public void setAfkorting(String afkorting){
        if (afkorting.length() > 4) {
            this.afkorting = afkorting.substring(0,4).toUpperCase();
        } else {
            this.afkorting = afkorting.toUpperCase();
        }
    }

    /**
     *
     * velden voor het definieren van een afdeling
     * @param afdeling
     *
     */
    public void setAfdeling(String afdeling){
        this.afdeling = afdeling;
    }

    /**
     *
     * @return Geeft de afkorting terug van de docent
     *
     */
    public String getAfkorting(){
        return afkorting;
    }

    /**
     *
     * @return Geeft de afdeling terug van de docent
     *
     */
    public String getAfdeling(){
        return afdeling;
    }

    /**
     *
     * @return de gegevens van de docent in een string
     *
     */
    public String toString()
    {
        return  "Afkorting: " + getAfkorting() + "\nAfdeling: " + getAfdeling();
    }
}
