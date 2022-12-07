package AB;

import opp.IO;

import java.io.IOException;

public class Lagerbestand {
    public static void main(String[] args) throws IOException {
        int gesamtmenge=0;
        double gesamtwert=0;

        System.out.println("wie viel unterschiedliche Artikel haben Sie im Lager?");
        int anzahl =IO.readInteger();

        System.out.println("Erfassen Sie die einzelen Artikelbezeichnungen:");
        String[] artikel = new String[anzahl];
        for (int i=0;i< artikel.length;i++){
            System.out.println("Artikel"+(i+1)+":");
            artikel[i]=IO.readString();
        }
        System.out.println("Erfassen Sie jz den Einzelpreise jedes Artikel ");
        double [] preis= new double[anzahl];
        for (int i=0;i< preis.length;i++){
            System.out.println("Preis des Artikels `"+artikel[i]+"´ :");
            preis[i]=IO.readDouble();
        }
        System.out.println("Erfassen Sie jz die Anzahl die einzelen Artikel:");
        int [] menge= new int[anzahl];
        for (int i=0;i< menge.length;i++){
            System.out.println(artikel[i]+":");
            menge[i]=IO.readInteger();
        }
        for (int i=0;i>menge.length;i++){
        gesamtmenge = gesamtmenge+menge[i];
        gesamtwert = gesamtwert+menge[i]*preis[i];
        }
        System.out.println("Gesamtemenge:"+gesamtmenge);
        System.out.println("Gesamtewert:"+gesamtwert);
    }
}
