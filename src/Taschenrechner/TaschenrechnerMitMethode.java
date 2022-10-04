package Taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerMitMethode {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

private static void schreibemenue(){
    System.out.println("Folgende Rechenoperationen stehen zur Auswahl:");
    System.out.println("[+] für Addition");
    System.out.println("[-] für Subtraktion");
    System.out.println("[*] für Multiplikation");
    System.out.println("[/] für Division");
    System.out.println("[p] für Potenzieren");
    System.out.println("[w] für Wurzelziehen");
    System.out.print("Deine Auswahl: ");
}

private static void addieren() throws IOException{
    System.out.print("Geben Sie die erste Zahl ein: ");
    String eingabe = br.readLine();
    double x = Double.parseDouble(eingabe.replace(",", "."));
    System.out.print("Geben Sie die zweite Zahl ein: ");
    double y = Double.parseDouble(br.readLine().replace(",", ".")); // ohne zusätzliche Variable eingabe2
    double summe = x + y;
    System.out.println("Die Summe ist " + summe);


}
private static void subtrahieren() throws IOException{
    System.out.print("Geben Sie die erste Zahl ein: ");
    String eingabe = br.readLine();
    double x = Double.parseDouble(eingabe.replace(",", "."));
    System.out.print("Geben Sie die zweite Zahl ein: ");
    double y = Double.parseDouble(br.readLine().replace(",", ".")); // ohne zusätzliche Variable eingabe2
    double ergebnis = x - y;
    System.out.println("Die antwort ist " + ergebnis);


}
private static void multiplicieren() throws IOException{

    System.out.print("Geben Sie die erste Zahl ein: ");
    String eingabe = br.readLine();
    double x = Double.parseDouble(eingabe.replace(",", "."));
    System.out.print("Geben Sie die zweite Zahl ein: ");
    double y = Double.parseDouble(br.readLine().replace(",", ".")); // ohne zusätzliche Variable eingabe2
    double ergebnis = x * y;
    System.out.println("Die antwort ist " + ergebnis);


}
private static void dividieren() throws IOException{

    System.out.print("Geben Sie die erste Zahl ein: ");
    String eingabe = br.readLine();
    double x = Double.parseDouble(eingabe.replace(",", "."));
    System.out.print("Geben Sie die zweite Zahl ein: ");
    double y = Double.parseDouble(br.readLine().replace(",", ".")); // ohne zusätzliche Variable eingabe2
    double ergebnis = x / y;
    System.out.println("Die antwort ist " + ergebnis);

}

private static void potentieren () throws IOException{
    System.out.print("Geben Sie die erste Zahl ein: ");
    String eingabe = br.readLine();
    double x = Double.parseDouble(eingabe.replace(",", "."));
    System.out.print("Geben Sie die zweite Zahl ein: ");
    double y = Double.parseDouble(br.readLine().replace(",", ".")); // ohne zusätzliche Variable eingabe2
    double ergebnis = Math.pow(x,y);
    System.out.println("Die antwort ist " + ergebnis);


}
private static void wurtelziehen() throws IOException{
    System.out.print("Geben Sie die Zahl ein: ");
    String eingabe = br.readLine();
    double x = Double.parseDouble(eingabe.replace(",", "."));
    double ergebnis = Math.sqrt(x);
    System.out.println("Die antwort ist " + ergebnis);


}

    public static void main(String[] args) throws IOException {
       ;
        String antwort;
        do {
            // Menü.
            schreibemenue();
            String operation = br.readLine();
            // Rechnen.
            switch (operation.toLowerCase()) {
                case "+", "plus", "addieren":
                    addieren();
                    break;

                case "-":
                    subtrahieren();
                    break;

                case "*":
                    multiplicieren();
                    break;
                case "/":
                    dividieren();
                    break;

                case "p":
                    potentieren();
                    break;

                case "w":
                    wurtelziehen();
                    break;

                default:
                    System.out.println("Die Operation kenne ich nicht.");
            }
            System.out.print("Möchten Sie eine weitere Rechnung durchführen? ");
            antwort = br.readLine();
        } while (antwort.equalsIgnoreCase("ja"));
    }
}
