package Konto;

public class TestPro {
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter = new Mitarbeiter("Holger", "Geldfuchs");
        Kunde kunde = new Kunde("Klaus", "Sparbier", mitarbeiter.getAdresse(), mitarbeiter);
        kunde.setAdresse(new Adresse("Zuhause", "3", "12345", "Heimatstadt"));

        Girokonto girokonto1 = new Girokonto(kunde, 1.0, 0.0, 15.0, 0);
        Girokonto girokonto2 = new Girokonto(kunde, 1.0, -1000.0, 15.0,0 );
        Sparkonto sparkonto = new Sparkonto(kunde, 3.0, 1000, 0);

        System.out.println("Mitarbeiter" + mitarbeiter);
        System.out.println("Kunde" + kunde);
        System.out.println(girokonto1);
        System.out.println(girokonto2);
        System.out.println(sparkonto);
        System.out.println("--------------------");

        boolean auszahlenOK = sparkonto.auszahlen(200.0);
        System.out.println("Auszahlen: " + auszahlenOK);

        sparkonto.einzahlen(200);
        auszahlenOK = sparkonto.auszahlen(200.0);
        System.out.println("Auszahlen: " + auszahlenOK);
        System.out.println("--------------------");
        boolean ueberweisenOK = girokonto1.uberweisen(100.0, girokonto2);
        System.out.println("Überweisen: " + ueberweisenOK);
    }

}

