public class KantineMedewerker extends Persoon
{
    // instance variables - replace the example below with your own
    private int medewerkersNummer;
    private boolean magAchterKassa;

    /**
     * Constructor:
     * Initialiseer de velden voor een persoon
     * @params bsn, voornaam, achternaam, geboorteDag, geboorteMaand, geboorteJaar, geslacht, medewerkersNummer, magAchterKassa
     */
    public KantineMedewerker(int bsn, String voornaam, String achternaam, String geboortedatum,  String geslacht
            ,int medewerkersNummer, boolean magAchterKassa)
    {
        super(bsn,  voornaam,  achternaam, geboortedatum, geslacht);
        setMedewerkersNummer(medewerkersNummer);
        setMagAchterKassa(magAchterKassa);
    }

    /**
     * Methode - Geeft het medewerkersNummer terug
     *
     * @return medewerkersNummer        Het nummer van een KantineMedewerker
     */
    public int getMedewerkersNummer()
    {

        return medewerkersNummer;
    }

    /**
     * Methode - Geeft true/false terug van magAchterKassa
     *
     * @return magAchterKassa        De waarde van een magAchterKassa
     */
    public boolean getMagAchterKassa()
    {

        return magAchterKassa;
    }

    /**
     * Methode - Zet het medewerkersNummer
     *
     * @param medewerkersNummer
     */
    public void setMedewerkersNummer(int medewerkersNummer)
    {

        this.medewerkersNummer = medewerkersNummer;
    }

    /**
     * Methode - Zet de waarde voor magAchterKassa
     *
     * @param magAchterKassa
     */
    public void setMagAchterKassa(boolean magAchterKassa)
    {

        this.magAchterKassa = magAchterKassa;
    }

    /**
     * Overschrijven van toString methode
     * @return de gegevens van de student in een string
     */
    public String toString()
    {
        return  "MedewerkersNR: " + getMedewerkersNummer() + "\nMag achter de kassa: " + getMagAchterKassa();
    }
}
