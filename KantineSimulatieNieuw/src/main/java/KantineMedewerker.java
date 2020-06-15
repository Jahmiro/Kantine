/**
 * Met deze klasse wordt er een medewerker aangemaakt
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordy Olijve
 * @version 1.0
 */

public class KantineMedewerker extends Persoon implements KortingskaartHouder
{
    // instance variables - replace the example below with your own
    private int medewerkersNummer;
    private boolean magAchterKassa;

    /**
     *
     * Initialiseer de velden voor een persoon
     * @params bsn, voornaam, achternaam, geboorteDag, geboorteMaand, geboorteJaar, geslacht, medewerkersNummer, magAchterKassa
     *
     */
    public KantineMedewerker(int bsn, String voornaam, String achternaam, String geboortedatum,  String geslacht
            ,int medewerkersNummer, boolean magAchterKassa)
    {
        super(bsn,  voornaam,  achternaam, geboortedatum, geslacht);
        setMedewerkersNummer(medewerkersNummer);
        setMagAchterKassa(magAchterKassa);
    }

    /**
     *
     * @return Geeft het nummer terug van de medewerker
     */
    public int getMedewerkersNummer()
    {

        return medewerkersNummer;
    }

    /**
     *
     * @return Geeft terug als een medewerker achter de kassa mag of niet
     *
     */
    public boolean getMagAchterKassa()
    {

        return magAchterKassa;
    }

    /**
     *
     * Initialiseer de velden voor een medewerkersnummer
     * @param medewerkersNummer
     *
     */
    public void setMedewerkersNummer(int medewerkersNummer)
    {

        this.medewerkersNummer = medewerkersNummer;
    }

    /**
     *
     * Initialiseer de velden voor als een medewerker achter de kassa mag of niet
     * @param magAchterKassa
     *
     */
    public void setMagAchterKassa(boolean magAchterKassa)
    {

        this.magAchterKassa = magAchterKassa;
    }

    /**
     *
     * Overschrijven van toString methode
     * @return de gegevens van de medewerker in een string
     *
     */
    public String toString()
    {
        return  "MedewerkersNR: " + getMedewerkersNummer() + "\nMag achter de kassa: " + getMagAchterKassa();
    }

    public double geefKortingsPercentage()
    {
        return 0.35;
    }

    public boolean heeftMaximum()
    {
        return false;
    }

    public double geefMaximum()
    {
        return 0.0;
    }
}
