package Fuﬂball;

import java.util.ArrayList;

class ProgrammSuS {
    public static void main(String[] args) {
        System.out.println("Schritt 4:");

        // Fuﬂball.Mannschaft 1
        Trainer trainer1 = new Trainer("Kohfeld", 38, 8);
        Torwart torwart1 = new Torwart("Pavlenka", 28, 9, 10, 9);
        ArrayList<Spieler> spielerListe1 = new ArrayList<Spieler>();
        Spieler spieler1 = new Spieler("Klaaﬂen", 27, 7, 7, 10, 10);
        spielerListe1.add(spieler1);
        spieler1 = new Spieler("Rashica", 24, 9, 9, 6, 50);
        spielerListe1.add(spieler1);
        Mannschaft team1 = new Mannschaft("Werder All Stars", trainer1, torwart1, spielerListe1);
        System.out.println(team1);

        // Fuﬂball.Mannschaft 2
        Trainer trainer2 = new Trainer("Weiﬂnix", 50, 8);
        Torwart torwart2 = new Torwart("H‰ltnix", 33, 9, 10, 9);
        ArrayList<Spieler> spielerListe2 = new ArrayList<Spieler>();
        Spieler spieler2 = new Spieler("Siehtnix", 25, 3, 7, 10, 3);
        spielerListe2.add(spieler2);
        spieler2 = new Spieler("Trifftnix", 27, 2, 9, 6, 5);
        spielerListe2.add(spieler2);
        Mannschaft team2 = new Mannschaft("Luschen HSV", trainer2, torwart2, spielerListe2);
        System.out.println(team2);

        // Fuﬂball.Spiel
        Spiel spiel = new Spiel(team1, team2);
        System.out.println(spiel);

        // Fuﬂball.Fuﬂball.Ergebnis
        Ergebnis ergebnis = new Ergebnis();
        ergebnis.gettoreGast();
        ergebnis.gettoreGast();
        ergebnis.gettoreHeim();
        System.out.println(spiel);
        System.out.println(ergebnis);
    }
}