package Fußball;

import java.util.Random;

public class GameplayAlt {
    private static final int SPIELZEIT = 90;
    private static final int MAX_NACHSPIELZEIT = 5;
    private static final int MAX_DAUER_BIS_AKTION = 10;


    private static int ermittelMannschaftsWert(Mannschaft mannschaft) {

        int mannschaftsWert = mannschaft.getstaerke() * mannschaft.getmotivition() * mannschaft.getTrainer().getErfahrung();

        mannschaftsWert = Math.max(1, mannschaftsWert);

        return mannschaftsWert;
    }

    private static boolean erzielTor(Spieler schuetze, Torwart torwart) {

        boolean getroffen;

        Random random = new Random();

        int schuss =schuetze.getTorschuss() + random.nextInt(5)-2;

        schuss = Math.max(1,schuss);

        int abwehr = torwart.getReaktion() * random.nextInt(5)-2;

        abwehr = Math.max(1,abwehr);

        if( schuss > abwehr) {

            getroffen = true;

        }else {

            getroffen = false;

        }
        return getroffen;

    }

    public static void spielen(Spiel spiel) {
        Random random = new Random();
        Mannschaft offensiv;
        Mannschaft defensiv;
        int spielDauer = SPIELZEIT + random.nextInt(MAX_NACHSPIELZEIT + 1);
        int spielMinute = 1 + random.nextInt(MAX_DAUER_BIS_AKTION + 1);

        do {

            int heimwert = ermittelMannschaftsWert(spiel.getHeimMannschaft());

            int gastwert = ermittelMannschaftsWert(spiel.getGastMannschaft());

            int summe = heimwert + gastwert;

            int zufall = random.nextInt(summe + 1);

            if (heimwert <= gastwert) {

                offensiv = spiel.getGastMannschaft();

                defensiv = spiel.getHeimMannschaft();

            } else {

                offensiv = spiel.getHeimMannschaft();

                defensiv = spiel.getGastMannschaft();
            }
            int schuetzeNr = random.nextInt(offensiv.getSpielerListe().size());
            Spieler schuetze = offensiv.getSpielerListe().get(schuetzeNr);

            boolean getroffen = erzielTor(schuetze, defensiv.getTorwart());
            if (getroffen) {
                offensiv.getSpielerListe().get(schuetzeNr).addTor();
                if (offensiv == spiel.getHeimMannschaft()) {
                    spiel.getErgebnis().addToreHeim();
                } else {
                    spiel.getErgebnis().addToreGast();
                }
                spiel.getSpielbericht().append(spielMinute + ": Tor von" + offensiv.getSpielerListe().get(schuetzeNr).getMotivation());
                spiel.getSpielbericht().append(spielMinute).append(": Schuss von ").append(offensiv.getSpielerListe().get(schuetzeNr).getMotivation());

            }

            spielMinute = spielMinute  + random.nextInt(MAX_DAUER_BIS_AKTION + 1);

        } while (spielMinute <= spielDauer);
    }
}












