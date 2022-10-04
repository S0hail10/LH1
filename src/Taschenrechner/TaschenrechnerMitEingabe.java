package Taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerMitEingabe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double zahlx;
        double zahly ;

        System.out.println("Folgenden Rechenoperationen stehen zur Auswahl:");
        System.out.println("(+) für Addition");
        System.out.println("(-) für Subtraktion");
        System.out.println("(*) für Multiplikation");
        System.out.println("(/) für Divition");
        System.out.println("(p) für Potenzieren");
        System.out.println("(w) für Wurtelziehen");
        System.out.println("Deine Auswahl:");
        String auswahl = br.readLine();

        if(auswahl.equalsIgnoreCase("w")) {
            System.out.println("Bitte die  Zahl!");
            String eingabe = br.readLine();
            zahlx = Double.parseDouble(eingabe.replace(",","."));
            String eingabe2 = br.readLine();
            zahly = Double.parseDouble(eingabe2.replace(",", "."));
        } else {
            System.out.println("Bitte die erste Zahl/Basis eingeben!");
            String eingabe = br.readLine();
            zahlx = Double.parseDouble(eingabe.replace(",", "."));
            System.out.println("Bitte die zweite Zahl/den Exponenten eingeben!");
            String eingabe2 = br.readLine();
            zahly = Double.parseDouble(eingabe2.replace(",", "."));
        }

        double ergebnis = 0;
        boolean rechenoperationok = true;
        switch (auswahl) {
            case "+":
                ergebnis = zahlx + zahly;
                break;
            case "-":
                ergebnis = zahlx - zahly;
                break;
            case "*":
                ergebnis = zahlx * zahly;
                break;
            case "/":
                ergebnis = zahlx / zahly;
                break;
            case "p":
                ergebnis = Math.pow(zahlx, zahly);
                break;
            case "w":
                ergebnis = Math.sqrt(zahlx);
                break;
            default:
            {
                rechenoperationok = false;
                System.out.println("kenn ich nicht!");
            }
        }
        if (rechenoperationok){
            System.out.println("das ergebnis lautet "  + ergebnis);
        }
        System.out.println("Möchten Sie eine weitere Rechnung durchführen?");
        String weiter = br.readLine();
        if(weiter.equalsIgnoreCase("ja")){
            main(args);
        }

    }
}
