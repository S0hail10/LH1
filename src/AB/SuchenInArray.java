package AB;

import opp.IO;

import java.io.IOException;

public class SuchenInArray {
    public static void main(String[] args) throws IOException {
        System.out.println("Bitte geben Sie ein Array aus 5 Kommazahlen ein:");
        double komma [] = new double[5];

        for (int i=0;i< komma.length;i++){
            System.out.println("wert " + (i+1) + " eingeben:");
            komma [i] = IO.readDouble();
        }
        System.out.println("welcher Zalh wollen Sie suchen?");
        double suche = IO.readDouble();
        for (int i=0;i< komma.length;i++){
            if (suche==komma[i]){
                System.out.println("Treffer");
            }
            else System.out.println("Niete");
        }
    }
}