package AB;

import opp.IO;

import java.io.IOException;

public class Temperaturmessung {
    public static void main(String[] args) throws IOException {
        System.out.println("Bitte Geben Sie die Tempreatur am Tag 1 ein!");
        double t1 = IO.readDouble();
        System.out.println("Bitte Geben Sie die Tempreatur am Tag 2 ein!");
        double t2 = IO.readDouble();
        System.out.println("Bitte Geben Sie die Tempreatur am Tag 3 ein!");
        double t3 = IO.readDouble();
        System.out.println("Bitte Geben Sie die Tempreatur am Tag 4 ein!");
        double t4 = IO.readDouble();
        System.out.println("Bitte Geben Sie die Tempreatur am Tag 5 ein!");
        double t5 = IO.readDouble();
        System.out.println("Bitte Geben Sie die Tempreatur am Tag 6 ein!");
        double t6 = IO.readDouble();
        System.out.println("Bitte Geben Sie die Tempreatur am Tag 7 ein!");
        double t7 = IO.readDouble();
        double ergebnis = (t1 + t2 + t3 + t4 + t5 + t6 + t7) / 7;
        double max = t1;
        if (max < t2) {
            max = t2;
        }
        if (max < t3) {
            max = t3;
        }
        if (max < t4) {
            max = t4;
        }
        if (max < t5) {
            max = t5;
        }
        if (max < t6) {
            max = t6;
        }
        if (max < t7) {
            max = t7;
        }
        double min = t1;
        if (min > t2) {
            min = t2;
        }
        if (min > t3) {
            min = t3;
        }
        if (min > t4) {
            min = t4;
        }
        if (min > t5) {
            min = t5;
        }
        if (min > t6) {
            min = t6;
        }
        if (min > t7) {
            min = t7;
        }
        double s = max-min;
        System.out.println("Der Mittelwert ist: " + ergebnis);
        System.out.println("Die maximale Temperatur lautet: " + max);
        System.out.println("Die minnimale Temperatur lautet" + min);
        System.out.println("Die Spannwete lautet" + s);
    }
}