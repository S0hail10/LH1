package Taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerFinaleMA22 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String antwort;
        do {
            // Menü.
            System.out.println("Folgende Rechenoperationen stehen zur Auswahl:");
            System.out.println("[+] für Addition");
            System.out.println("[-] für Subtraktion");
            System.out.println("[*] für Multiplikation");
            System.out.println("[/] für Division");
            System.out.println("[p] für Potenzieren");
            System.out.println("[w] für Wurzelziehen");
            System.out.print("Deine Auswahl: ");
            String operation = br.readLine();
            // Rechnen.
            switch (operation.toLowerCase()) {
                case "+", "plus", "addieren":
                    System.out.print("Geben Sie die erste Zahl ein: ");
                    String eingabe = br.readLine();
                    double x = Double.parseDouble(eingabe.replace(",", "."));
                    System.out.print("Geben Sie die zweite Zahl ein: ");
                    double y = Double.parseDouble(br.readLine().replace(",", ".")); // ohne zusätzliche Variable eingabe2
                    double summe = x + y;
                    System.out.println("Die Summe ist " + summe);
                    break;
                case "-":
                    System.out.print("Geben Sie die erste Zahl ein: ");
                    eingabe = br.readLine();
                    x = Double.parseDouble(eingabe.replace(",", "."));
                    System.out.print("Geben Sie die zweite Zahl ein: ");
                    y = Double.parseDouble(br.readLine().replace(",", ".")); // ohne zusätzliche Variable eingabe2
                    double ergebnis = x - y;
                    System.out.println("Die antwort ist " + ergebnis);
                    break;
                case "*":
                    System.out.print("Geben Sie die erste Zahl ein: ");
                    eingabe = br.readLine();
                    x = Double.parseDouble(eingabe.replace(",", "."));
                    System.out.print("Geben Sie die zweite Zahl ein: ");
                    y = Double.parseDouble(br.readLine().replace(",", ".")); // ohne zusätzliche Variable eingabe2
                    ergebnis = x * y;
                    System.out.println("Die antwort ist " + ergebnis);
                    break;
                case "/":
                    System.out.print("Geben Sie die erste Zahl ein: ");
                    eingabe = br.readLine();
                    x = Double.parseDouble(eingabe.replace(",", "."));
                    System.out.print("Geben Sie die zweite Zahl ein: ");
                    y = Double.parseDouble(br.readLine().replace(",", ".")); // ohne zusätzliche Variable eingabe2
                    ergebnis = x / y;
                    System.out.println("Die antwort ist " + ergebnis);
                    break;
                case "p":
                    System.out.print("Geben Sie die Basis ein: ");
                    eingabe = br.readLine();
                    x = Double.parseDouble(eingabe.replace(",", "."));
                    System.out.print("Geben Sie den Exponenten ein: ");
                    y = Double.parseDouble(br.readLine().replace(",", ".")); // ohne zusätzliche Variable eingabe2
                    ergebnis = Math.pow(x, y);
                    System.out.println("Die antwort ist " + ergebnis);
                    break;
                case "w":
                    System.out.print("Geben Sie die Zahl ein: ");
                    eingabe = br.readLine();
                    x = Double.parseDouble(eingabe.replace(",", "."));
                    ergebnis = Math.sqrt(x);
                    System.out.println("Die antwort ist " + ergebnis);
                    break;
                default:
                    System.out.println("Die Operation kenne ich nicht.");
            }
            System.out.print("Möchten Sie eine weitere Rechnung durchführen? ");
            antwort = br.readLine();
        } while(antwort.equalsIgnoreCase("ja"));
    }
}
