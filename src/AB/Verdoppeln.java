package AB;

import opp.IO;

import java.io.IOException;

public class Verdoppeln {
    public static void main(String[] args) throws IOException {
        System.out.println("Bitte geben Sie ein Wert aus Kommazahlen ein:");
        int wert= IO.readInteger();
        double komma[]=new double[wert];
        double zahl = 0;
        for (int i=0;i< komma.length;i++){
            System.out.println("wert "+(i+1)+":");
            komma [i]=IO.readDouble();
        }
        System.out.println("Ursprünglisches Array.");
        for (int i=0;i<komma.length;i++){
            System.out.println(komma[i]+"\t\t\t");
        }
        System.out.println("");
        System.out.println("verdoppeltle Arry");
        for (int i=0;i< komma.length;i++){
          zahl=2*komma[i];
            System.out.println(zahl+"\t\t\t");
        }
    }
}
