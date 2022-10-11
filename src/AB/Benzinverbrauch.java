package AB;

import opp.IO;

import java.io.IOException;

public class Benzinverbrauch {
    public static void main(String[] args) throws IOException {
        do {

            System.out.println("Geben Sie bitte die Menge des verbrauchten Kraftstoffes ein. (in Liter)");
            double liter = IO.readDouble();

            System.out.println("Geben Sie bitte die Eingabe der gefahrenen Kilometer ein.");
            double km = IO.readDouble();

            double durchschnittsverbrauch = 100 * liter / km;
            System.out.println("Der Durchschnittsverbrauch ist:" + durchschnittsverbrauch + "l/km");
            if (durchschnittsverbrauch == 0) {
                System.out.println("keine Brechnung möglich!");
            } else if (durchschnittsverbrauch < 0) {
                System.out.println("Falsche eingabe!");
            }
            System.out.println("Möchten Sie eine weitere Rechnung durchführen?");
        } while (IO.readBoolean());
        System.out.println("Bye Bye!");
    }
}
