package AB;

import opp.IO;

import java.io.IOException;

public class Gesamtwiderstands {
    public static void main(String[] args) throws IOException {
        System.out.println("Wiederstand 1:");
        double wiederstand1 = IO.readDouble();
        System.out.println("Wiederstand 2:");
        double wiederstand2 = IO.readDouble();

        System.out.println(" Bitte (p) für Parallelschaltung oder (r) für Reihenschaltung eingeben!");
        String schaltungsart = IO.readString();

        if (schaltungsart.equalsIgnoreCase("p") || (schaltungsart.equalsIgnoreCase("P"))){
            double gesamtwiderstand = (wiederstand1*wiederstand2)/(wiederstand1+wiederstand2);
            System.out.println("Der Gesamtwiderstand ist:" + gesamtwiderstand);
        }else if (schaltungsart.equalsIgnoreCase("p") || (schaltungsart.equalsIgnoreCase("P"))){
            double gesamtwiderstand = wiederstand1+wiederstand2;
            System.out.println("Der Gesamtwiderstand ist:" + gesamtwiderstand);
        }else {

        }
    }
}
