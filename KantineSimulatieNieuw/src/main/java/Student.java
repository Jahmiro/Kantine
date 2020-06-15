/**
 * Met deze klasse wordt er een student aangemaakt
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordy Olijve
 * @version 1.0
 */

public class Student extends Persoon
{
    private int studentNummer;
    private String studieRichting;

    /**
     *
     * Initialiseer velden voor een student
     * @params bsn, voornaam, achternaam, geboorteDag, geboorteMaand, geboorteJaar, geslacht, studentNummer, studieRichting
     *
     */
    public Student(int bsn, String voornaam, String achternaam, String geboortedatum, String geslacht
            ,int studentNummer, String studieRichting)
    {
        super(bsn,  voornaam,  achternaam, geboortedatum,  geslacht);
        setStudentNummer(studentNummer);
        setStudieRichting(studieRichting);
    }

    /**
     *
     * @return Geeft het studentnummer terug
     *
     */
    public int getStudentNummer()
    {
        return studentNummer;
    }

    /**
     *
     * @return Geeft een studierichting terug
     *
     */
    public String getStudieRichting()
    {
        return studieRichting;
    }

    /**
     *
     * Initialiseer velden voor een studentnummer
     * @param studentNummer
     *
     */
    public void setStudentNummer(int studentNummer)
    {
        this.studentNummer = studentNummer;
    }

    /**
     *
     * Initialiseer veld voor een studierichting
     * @param studieRichting
     *
     */
    public void setStudieRichting(String studieRichting)
    {
        this.studieRichting = studieRichting;
    }

    /**
     *
     * @return de gegevens van de student in een string
     *
     */
    public String toString()
    {
        return  "StudentNR: " + getStudentNummer() + "\nStudierichting: " + getStudieRichting();
    }

}
