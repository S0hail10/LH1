import opp.IO;

import java.io.IOException;
import java.text.DecimalFormat;

public class Sparvertrag {
    public static void main(String[] args) throws IOException {
        DecimalFormat df = new DecimalFormat("#,##0.00 €");
        do
        {
            System.out.println("Bitte Kapital eingeben:");
        double kapital= IO.readDouble();
        System.out.println("Bitte den Zinssatz eingeben:");
        double zinssatz = IO.readDouble();
        System.out.println("Bitte die Laufzeit in Jahren eingeben:");
        double laufzeit=IO.readDouble();
            System.out.println("\nJhar\tAnfangskapital\tZinsbetrag\tJahresbetrag");

        for (int i=1;i<=laufzeit;i++){
            double zinsbetrag = kapital*zinssatz/100;
            double jahresendbetrag = kapital + zinsbetrag;
            System.out.println(i + " \t\t " + df.format(kapital) + "\t\t\t" +df.format(zinsbetrag) + "\t\t\t\t" +df.format(jahresendbetrag));
            kapital=jahresendbetrag;
        }
            System.out.println("nochmal?");
        } while (IO.readBoolean());
    }
}
