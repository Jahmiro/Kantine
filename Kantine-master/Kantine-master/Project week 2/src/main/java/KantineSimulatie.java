import java.util.*;
/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordi Olijve
 * @version 1.0
 */

public class KantineSimulatie {

    // kantine
    private Kantine kantine;

    // kantineaanbod
    private KantineAanbod kantineaanbod;

    // random generator
    private Random random;

    // aantal artikelen
    private static final int AANTAL_ARTIKELEN = 4;


    // artikelen
    private static final String[] artikelnamen =
            new String[] {"Koffie", "Broodje pindakaas", "Broodje kaas", "Appelsap"};

    // prijzen
    private static double[] artikelprijzen = new double[] {1.50, 2.10, 1.65, 1.65};

    // minimum en maximum aantal artikelen per soort
    private static final int MIN_ARTIKELEN_PER_SOORT = 10000;
    private static final int MAX_ARTIKELEN_PER_SOORT = 20000;

    // minimum en maximum aantal personen per dag
    private static final int STUDENTEN_PER_DAG_KANS=89;
    private static final int DOCENTEN_PER_DAG_KANS=10;
    // private static final int KANTINEMEDEWERKERS_PER_DAG_KANS=1;
    // private static final int MIN_PERSONEN_PER_DAG = 50;
    // private static final int MAX_PERSONEN_PER_DAG = 100;

    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON = 1;
    private static final int MAX_ARTIKELEN_PER_PERSOON = 4;

    /**
     * Constructor
     *
     */
    public KantineSimulatie() {
        kantine = new Kantine();
        random = new Random();
        int[] hoeveelheden =
                getRandomArray(AANTAL_ARTIKELEN, MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);
        kantineaanbod = new KantineAanbod(artikelnamen, artikelprijzen, hoeveelheden);

        kantine.setKantineAanbod(kantineaanbod);
    }

        /**
     * Start een simulatie
     */
    public static void main(String[] args) {
        KantineSimulatie kantineSimulatie = new KantineSimulatie();
        kantineSimulatie.simuleer(7);
    }

    /**
     * Methode om een array van random getallen liggend tussen min en max van de gegeven lengte te
     * genereren
     *
     * @param lengte
     * @param min
     * @param max
     * @return De array met random getallen
     */
    private int[] getRandomArray(int lengte, int min, int max) {
        int[] temp = new int[lengte];
        for (int i = 0; i < lengte; i++) {
            temp[i] = getRandomValue(min, max);
        }

        return temp;
    }

    /**
     * Methode om een random getal tussen min(incl) en max(incl) te genereren.
     *
     * @param min
     * @param max
     * @return Een random getal
     */
    private int getRandomValue(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * Methode om op basis van een array van indexen voor de array artikelnamen de bijhorende array
     * van artikelnamen te maken
     *
     * @param indexen
     * @return De array met artikelnamen
     */
    private String[] geefArtikelNamen(int[] indexen) {
        String[] artikelen = new String[indexen.length];

        for (int i = 0; i < indexen.length; i++) {
            artikelen[i] = artikelnamen[indexen[i]];

        }

        return artikelen;
    }

    /**
     * Deze methode simuleert een aantal dagen
     * in het verloop van de kantine
     *
     * @param dagen
     */
    public void simuleer(int dagen) {
            // for lus voor dagen
            for(int i=0;i<dagen;i++) {
                // bedenk hoeveel personen vandaag binnen lopen
                int aantalpersonen = PERSONEN_PER_DAG;
            
                // laat de personen maar komen...
                for(int j=0;j<aantalpersonen;j++) {
                    int randomNum = random.nextInt(100);


                    // maak persoon en dienblad aan, koppel ze
                   // Persoon klantKantine = new Persoon();
                    // Dienblad dienbladKlant = new Dienblad();
                    // klantKantine.pakDienblad(dienbladKlant);


                    if (randomNum < STUDENTEN_PER_DAG_KANS) {
                        //Voeg studenten toe
                        persoon1 = new Student(1234,"Lammerd","Geertema",28,2,1984,'m',4321,"ICT");
                        dienblad1 = new Dienblad();
                        persoon1.pakDienblad(dienblad1);
                        System.out.println(persoon1.toString());
                    }
                    else if (randomNum >= STUDENTEN_PER_DAG_KANS && randomNum < STUDENTEN_PER_DAG_KANS+DOCENTEN_PER_DAG_KANS ) {
                        //Voeg docenten toe
                        persoon1 = new Docent(1234,"Geert","Lammerda",28,2,1984,'m',"GEER","Concierge");
                        dienblad1 = new Dienblad();
                        persoon1.pakDienblad(dienblad1);
                        System.out.println(persoon1.toString());
                    } else {
                        //Voeg kantinemedewerkers toe
                        persoon1 = new KantineMedewerker(1234,"Dave","Schoffel",28,2,1984,'m',9876,false);
                        dienblad1 = new Dienblad();
                        persoon1.pakDienblad(dienblad1);   
                        System.out.println(persoon1.toString());
                    }
                    // bedenk hoeveel artikelen worden gepakt
                    int aantalartikelen=getRandomValue(MIN_ARTIKELEN_PER_PERSOON, MAX_ARTIKELEN_PER_PERSOON);

                    // genereer de “artikelnummers”, dit zijn indexen
                    // van de artikelnamen array
                    int[] pakartikelen=getRandomArray(aantalartikelen, 0, AANTAL_ARTIKELEN-1);

                    // vind de artikelnamen op basis van
                    // de indexen hierboven
                    String[] artikelen=geefArtikelNamen(pakartikelen);

                    // loop de kantine binnen, pak de gewenste
                    // artikelen, sluit aan
                    kantine.loopPakSluitAan(klantKantine, artikelen);

                }

                //Administratie
        //Alle dag omzetten
        double[] geldList = new double[dagomzet.size()];

        for (i = 0; i < dagomzet.size(); i++){
            geldList[i] = dagomzet.get(i).doubleValue();
        }
        
        //Alle arikelen verkocht per dag
        int[] artikelList = new int[artikelenVerkocht.size()];
        for (int x = 0; x < artikelenVerkocht.size(); x++){
            artikelList[x] = artikelenVerkocht.get(x).intValue();
        }
        
        Administratie administratie = new Administratie();
        double[] dagomzetList = Administratie.berekenDagOmzet(geldList);
        double gemiddeldeOmzetList = administratie.berekenGemiddeldeOmzet(geldList);
        double gemiddeldAantalArtikelenVerkocht = administratie.berekenGemiddeldAantal(artikelList);
        
        System.out.println("Overzicht artikelen verkocht per dag: ");
        System.out.println(Arrays.toString(artikelList));
        System.out.println();
        System.out.println("Overzicht omzet per dag: ");
        System.out.println(Arrays.toString(dagomzetList));
        System.out.println();
        System.out.println("Overzicht omzet gemiddeld: ");
        System.out.println(gemiddeldeOmzetList);

    }
            // verwerk rij voor de kassa
            kantine.verwerkRijVoorKassa();

            // toon dagtotalen (artikelen en geld in kassa)
            System.out.println();
            System.out.println("Aantal artikelen die zijn verkocht: " + kantine.getKassa().aantalArtikelen());
            System.out.println("Totaal in de kassa: " + kantine.getKassa().hoeveelheidGeldInKassa());
            System.out.println();

            // reset de kassa voor de volgende dag
            kantine.getKassa().resetKassa();

        }
    }

