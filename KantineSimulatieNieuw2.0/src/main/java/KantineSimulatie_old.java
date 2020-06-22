//public class KantineSimulatie_old {
//
//private static Kantine kantine;
//
//
//    /**
//     * Constructor
//     */
//    public KantineSimulatie_old() {
//        kantine = new Kantine();
//
//
//    /**
//     * Deze methode simuleert een aantal dagen in het
//     * verloop van de kantine
//     *
//     * @param dagen
//     */
//    public static void simuleer(int dagen) {
//
//        // herhaal voor elke dag
//        for (int i = 0; i < dagen ; i++) {
//
//
//            // per dag nu even vast 10 + i personen naar binnen
//
//            // laten gaan, wordt volgende week veranderd...
//
//            // for lus voor personen
//            for (int j = 0; j < 10 + i; j++) {
//                kantine.loopPakSluitAan();
//            }
//
//            // verwerk rij voor de kassa
//            kantine.verwerkRijVoorKassa();
//
//            // toon dagtotalen (artikelen en geld in kassa)
//            System.out.println();
//            System.out.println("Aantal artikelen die zijn verkocht: " + kantine.getKassa().aantalArtikelen());
//            System.out.println("Totaal in de kassa: " + kantine.getKassa().hoeveelheidGeldInKassa());
//            System.out.println();
//
//            // reset de kassa voor de volgende dag
//            kantine.getKassa().resetKassa();
//        }
//    }
//
//
//    public static void main(String[] args) {
//        int dagen;
//
//        if (args.length == 0) {
//            dagen = DAGEN;
//        } else {
//          dagen = Integer.parseInt(args[0]);
//        }
//
//        simuleer(dagen);
//    }
//}
