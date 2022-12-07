package AB;

import opp.IO;

import java.io.IOException;

public class TemperaturForSchleife {
    public static void main(String[] args) throws IOException {
        System.out.println("wie viel tagen?");
        int anzahl= IO.readInteger();
        double [] tag = new double[anzahl];
        double summe= 0;
        double max = -300;
        double min = 100;
        double mittelwert=0;

        for (int i = 0;i< tag.length;i++){
            System.out.println("Temperatur am Tag" +(i+1)+".");
            tag[i] = IO.readDouble();

            summe += tag[i];
            mittelwert= summe/anzahl;
        }
        System.out.println(mittelwert);
    }
}
