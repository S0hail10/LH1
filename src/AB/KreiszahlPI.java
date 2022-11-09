package AB;

import opp.IO;

import java.io.IOException;

public class KreiszahlPI {
    public static void main(String[] args) throws IOException {
        System.out.println("Giben Sie bitte eine Ganzezahl für den Algorithmus ein!");
        int n = IO.readInteger();
        double pi=0;
        for (int i=0;i<=n;i++){

        pi=pi + Math.pow(-1,i)/(2*i+1);}
        pi=pi*4;

        double AbweichungPI= Math.PI-pi;
        System.out.println("Nach "+ n+ " lautet pi: " + pi);
        System.out.println("Die Abweichnung lautet: " + AbweichungPI);
    }
}
