import java.util.*;
/**
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordy Olijve
 * @version 1.0
 */

public class KantineSimulatie {

    // kantine
    private static Kantine kantine = new Kantine();;
    private static Persoon persoon1;
    private static Dienblad dienblad1;
    // kantineaanbod
    private static KantineAanbod kantineaanbod;
    // random generator
    private static Random random = new Random();;
    // aantal artikelen
    private static final int AANTAL_ARTIKELEN = 4;
    // artikelen
    private static final String[] artikelnamen =
            new String[] {"Koffie", "Broodje pindakaas", "Broodje kaas", "Appelsap"};
    // prijzen
    private static double[] artikelprijzen = new double[] {1.50, 2.10, 1.65, 1.65};
    // minimum en maximum aantal artikelen per soort
    private static final int MIN_ARTIKELEN_PER_SOORT = 10;
    private static final int MAX_ARTIKELEN_PER_SOORT = 20;
    // minimum en maximum aantal personen per dag
    private static final int MIN_PERSONEN_PER_DAG = 50;
    private static final int MAX_PERSONEN_PER_DAG = 100;

    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON = 1;
    private static final int MAX_ARTIKELEN_PER_PERSOON = 4;

    /**
     * Constructor
     */
    public KantineSimulatie() {

        int[] hoeveelheden=getRandomArray(AANTAL_ARTIKELEN,MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);
        kantineaanbod = new KantineAanbod(artikelnamen, artikelprijzen, hoeveelheden);
        kantine.setKantineAanbod(kantineaanbod);

    }

    /**
     * Deze methode simuleert een aantal dagen in het
     * verloop van de kantine
     * @param dagen (aantal dagen om te simuleren)
     */
    public static void simuleer(int dagen) {
        ArrayList<Double> dagomzet = new ArrayList<>();
        ArrayList<Integer> artikelenVerkocht = new ArrayList<>();

        // for lus voor dagen
        for(int i=0;i<dagen;i++) {
            // bedenk hoeveel personen vandaag binnen lopen
            int aantalpersonen = getRandomValue(MIN_PERSONEN_PER_DAG, MAX_PERSONEN_PER_DAG);
            // laat de personen maar komen...
            for(int j=0;j<aantalpersonen;j++) {
                int randomKlant = getRandomValue(0, 100);

                if (randomKlant < 90) {
                    persoon1 = new Student(4532,"Lam","Geertema","08-06-1997","m",4321,"ICT");
                    persoon1.setBetaalwijze(new Pinpas());
                    dienblad1 = new Dienblad();
                    persoon1.pakDienblad(dienblad1);
                } else if ( randomKlant >= 90 && randomKlant < 100){
                    persoon1 = new Docent(1234,"Bert","Houten","4-03-1974","m","BEH","ICT");
                    persoon1.setBetaalwijze(new Pinpas());
                    dienblad1 = new Dienblad();
                    persoon1.pakDienblad(dienblad1);
                } else {
                    persoon1 = new KantineMedewerker(5235,"Dave","Schoffel","28-02-1984","m",9876,false);
                    persoon1.setBetaalwijze(new Pinpas());
                    dienblad1 = new Dienblad();
                    persoon1.pakDienblad(dienblad1);
                }
/*
                int betaalwijze1 = getRandomValue(0, 1);
                Betaalwijze betaalwijze;
                if (betaalwijze1 == 0){
                    betaalwijze = new Contant();
                    betaalwijze.setSaldo(100);
                } else{
                    betaalwijze = new Pinpas();
                    betaalwijze.setSaldo(100);
                }

 */

                // bedenk hoeveel artikelen worden gepakt
                int aantalartikelen = getRandomValue(MIN_ARTIKELEN_PER_PERSOON, MAX_ARTIKELEN_PER_PERSOON);

                // genereer de artikelnummers, dit zijn indexen
                // van de artikelnamen array
                int[] tepakken = getRandomArray(aantalartikelen, 0, AANTAL_ARTIKELEN-1);

                // vind de artikelnamen op basis van
                // de indexen hierboven
                String[] artikelen = geefArtikelNamen(tepakken);

                //artikelHoeveelheidAftrekken(artikelen, aantalartikelen);

                // loop de kantine binnen, pak de gewenste
                // artikelen, sluit aan
                kantine.loopPakSluitAan(persoon1, artikelen);
            }
            // verwerk rij voor de kassa
            try {
                kantine.verwerkRijVoorKassa();
            }
            catch(Exception e) {
            }
            //


            // toon dagtotalen (artikelen en geld in kassa)
            System.out.println("Aantal artikelen verkocht: " + kantine.getKassa().aantalArtikelen());

            double geld = Math.round((kantine.getKassa().hoeveelheidGeldInKassa() * 100.0)/100.0);
            dagomzet.add(geld);
            artikelenVerkocht.add(kantine.getKassa().aantalArtikelen());

            System.out.println("Geld in kassa: " +  geld);
            System.out.println();
            // reset de kassa voor de volgende dag
            kantine.getKassa().resetKassa();

        }

        //Administratie
        //Alle dag omzetten
        double[] geldList = new double[dagomzet.size()];
        for (int i = 0; i < dagomzet.size(); i++){
            geldList[i] = dagomzet.get(i).doubleValue();
        }

        //Alle arikelen verkocht per dag
        int[] artikelList = new int[artikelenVerkocht.size()];
        for (int i = 0; i < artikelenVerkocht.size(); i++){
            artikelList[i] = artikelenVerkocht.get(i).intValue();
        }

        double[] dagomzetList = Administratie.berekenDagOmzet(geldList);
        System.out.println();
        System.out.println("Maandag: " + dagomzetList[0]);
        System.out.println("Dinsdag: " + dagomzetList[1]);
        System.out.println("Woensdag: " + dagomzetList[2]);
        System.out.println("Donderdag: " + dagomzetList[3]);
        System.out.println("Vrijdag: " + dagomzetList[4]);
        System.out.println("Zaterdag: " + dagomzetList[5]);
        System.out.println("Zondag: " + dagomzetList[6]);
        System.out.println("Gemiddelde omzet deze week: " + Administratie.berekenGemiddeldeOmzet(geldList));



    }

    /**
     * Methode om een array van random getallen liggend tussen min en
     max
     * van de gegeven lengte te genereren
     * @param lengte
     * @param min
     * @param max
     * @return De array met random getallen
     */
    private static int[] getRandomArray(int lengte, int min, int max) {
        int[] temp=new int[lengte];
        for(int i=0;i<lengte;i++) {
            temp[i]=getRandomValue(min, max);
        }
        return temp;
    }

    /**
     * Methode om een random getal tussen min(incl) en
     * max(incl) te genereren.
     * @param min
     * @param max
     * @return Een random getal
     */
    private static int getRandomValue(int min, int max) {
        return random.nextInt(max-min+1)+min;
    }

    /**
     * Methode om op basis van een array van indexen voor de array
     * artikelnamen de bijhorende array van artikelnamen te maken
     * @param indexen
     * @return De array met artikelnamen
     */
    private static String[] geefArtikelNamen(int[] indexen) {
        String[] artikelen=new String[indexen.length];
        for(int i=0;i<indexen.length;i++) {
            artikelen[i]=artikelnamen[indexen[i]];
        }
        return artikelen;
    }



    public static void main(String[] args){
        KantineSimulatie kantineSimulatie = new KantineSimulatie();
        kantineSimulatie.simuleer(6);
    }
}

