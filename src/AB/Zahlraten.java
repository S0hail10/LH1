package AB;

import opp.IO;

import java.io.IOException;

public class Zahlraten {
    public static void main(String[] args) throws IOException {
        int x = 1-100;
        System.out.println("suchen Sie sich eine Zahl zwischen 1-100 aus!");
        System.out.println("ist ihre Zahal kleiner oder als 50?");
        String antwort = IO.readString();
        if (antwort.equalsIgnoreCase("ja")){
            System.out.println("ist ihre Zahl ");
            System.out.println(antwort);
            if (antwort.equalsIgnoreCase("ja")){

            }

        }

    }
}
