public class Student extends Persoon
{
    private int studentNummer;
    private String studieRichting;

    /**
     *
     * velden voor het definieren van een student
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
     *veld voor het definneren van studentnummer
     * @param studentNummer
     *
     */
    public void setStudentNummer(int studentNummer)
    {
        this.studentNummer = studentNummer;
    }

    /**
     *
     * veld voor het definieren van studierichting
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
