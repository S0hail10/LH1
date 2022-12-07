package AB;

import opp.IO;

import java.io.IOException;

public class Summen {
    public static void main(String[] args) throws IOException {
        System.out.println("wie viel Zahlen?");
        int anzahl = IO.readInteger();
        int zahl[]=new int[anzahl];
        for (int i=0;i<zahl.length;i++){
            System.out.println("zahl "+(i+1)+":");
            zahl[i]=IO.readInteger();
        }


    }
}
