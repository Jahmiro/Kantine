/**
 * Met deze klasse wordt er een docent aangemaakt
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordi Olijve
 * @version 1.0
 */

public class Docent extends Persoon implements KortingskaartHouder
{
    private String afkorting;
    private String afdeling;

    /**
     * Constructor
     * Initialiseer de velden voor docent
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
     * Initialiseer velden voor de afkorting van een docent
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
     * Initialiseer velden voor de afdeling van een docent
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

    public double geefKortingsPercentage()
    {
        return 0.25;
    }

    public boolean heeftMaximum()
    {
        return true;
    }

    public double geefMaximum()
    {
        return 1.0;
    }
}
