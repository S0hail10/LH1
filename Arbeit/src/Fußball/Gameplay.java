package Fuﬂball;

import java.util.Random;

public class Gameplay {
	
	private static final int SPIELZEIT = 90;
	private static final int MAX_NACHSPIELZEIT = 5;
	private static final int MAX_DAUER_BIS_AKTION = 10;
	
	/**
	 * Simuliert ein Fuﬂball.Spiel.
	 * @param spiel Das zu spielende Fuﬂball.Spiel.
	 */
	public static void spielen(Spiel spiel) {
		Random random = new Random();
		Mannschaft offensiv;
		Mannschaft defensiv;
		// Zuf‰llige Spieldauer festlegen
		int spielDauer = SPIELZEIT + random.nextInt(MAX_NACHSPIELZEIT + 1);
		// Zuf‰llige Spielminute f¸r erste Aktion festlegen
		int spielMinute = 1 + random.nextInt(MAX_DAUER_BIS_AKTION + 1);
		do {
			// Ermittlung der offensiven bzw. defensiven Fuﬂball.Mannschaft
			int heimWert = ermittelMannschaftsWert(spiel.getGastMannschaft());
			int gastWert = ermittelMannschaftsWert(spiel.getGastMannschaft());
			int summe = heimWert + gastWert;
			int zufall = random.nextInt(summe + 1);
			if (zufall <= heimWert) {
				offensiv = spiel.getHeimMannschaft();
				defensiv = spiel.getGastMannschaft();
			}
			else {
				offensiv = spiel.getGastMannschaft();
				defensiv = spiel.getHeimMannschaft();
			}
			// Sch¸tze bestimmen
			int schuetzeNr = random.nextInt(offensiv.getSpielerListe().size());
			Spieler schuetze = offensiv.getSpielerListe().get(schuetzeNr);
			// Ermitteln ob Torschuss erfolgreich oder nicht
			boolean getroffen = erzieltTor(schuetze, defensiv.getTorwart());
			if (getroffen) {
				schuetze.addTor();
				if (offensiv == spiel.getHeimMannschaft()) {
					spiel.getErgebnis().addToreHeim();
				}
				else {
					spiel.getErgebnis().addToreGast();
				}
				spiel.getSpielbericht().append(spielMinute + ": Tor von " + schuetze.getName() + "!\n");
			}
			else {
				spiel.getSpielbericht().append(spielMinute + ": Schuss von " + schuetze.getName() + " gehalten.\n");				
			}
			// Zuf‰llige Spielminute f¸r n‰chste Aktion festlegen
			spielMinute = spielMinute + random.nextInt(MAX_DAUER_BIS_AKTION + 1);
		} while(spielMinute <= spielDauer);
		spiel.getSpielbericht().append(spiel.getErgebnis());
	}

	public static void brecheSpielAb(int spielminute) throws SpielAbbruchException {

		Random random = new Random();

		int zufallszahl = random.nextInt(999);

		if (zufallszahl == 0) {

			throw new SpielAbbruchException(spielminute);

		}

	}
	
	/**
	 * Errechnet den aktuellen St‰rkewert eine Fuﬂball.Mannschaft.
	 * Errechnet sich aus der Spielst‰rke und Motivation der Fuﬂball.Mannschaft und der Erfahrung des Trainers.
	 * @return Der St‰rkewert.
	 */
	private static int ermittelMannschaftsWert(Mannschaft mannschaft) {
		int wert = mannschaft.getstaerke() * mannschaft.getmotivition() * mannschaft.getTrainer().getErfahrung();
		wert = Math.max(1, wert);
		return wert;
	}
	
	/**
	 * Ermittelt, ob ein Torschuss erfolgreich ist oder nicht.
	 * @param schuetze Der Torsch¸tze.
	 * @param torwart Der Fuﬂball.Torwart.
	 * @return Ja, wenn der Torschuss erfolgreich ist. Sonst nein.
	 */
	private static boolean erzieltTor(Spieler schuetze, Torwart torwart) {
		boolean getroffen;
		Random random = new Random();
		// St‰rke des Schusses ermitteln
		int schuss = schuetze.getTorschuss() + random.nextInt(5) - 2;
		schuss = Math.max(1, schuss);
		// St‰rke der Abwehr ermitteln
		int abwehr = torwart.getReaktion() + random.nextInt(5) - 2;
		abwehr = Math.max(1, abwehr);  
		// Ermitteln, ob Sch¸tze trifft
		if (schuss > abwehr) {
			getroffen = true;
		}
		else {
			getroffen = false;
		}
		return getroffen;
	}

}
