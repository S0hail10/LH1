package opp;

import java.io.IOException;

public class Bestellung {
    public static void main(String[] args) throws IOException {
        System.out.println("schrauben?");
        double schrauben = IO.readDouble();
        double anzahls = 0.05 * schrauben;

        System.out.println("muttern?");
        double muttern = IO.readDouble();
        double anzahlm = 0.03 * muttern;

        System.out.println("unterlescheiben?");
        double unterlegscheiben = IO.readDouble();
        double anzahlu = 0.01 * unterlegscheiben;

        double insgesamt = anzahlm + anzahlu + anzahls;

        if (schrauben == muttern) {
            System.out.println("Bestellung OK");
            System.out.println("insgesamte Betrag: " +insgesamt + " Euro");
        }
        else
        {
            System.out.println("die Bestellung muss noch einmal uberprüft werden!");
        }


    }
}

