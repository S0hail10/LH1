package AB;

import opp.IO;

import java.io.IOException;

public class Schaltjahre {
    public static void main(String[] args) throws IOException {
        do {
        System.out.println("Bei welchem Jahr soll Ihre Brechnung starten?");
        int s= IO.readInteger();
        System.out.println("bis zu welchem Jahr soll ihre Brechnung gehen?");
        int e= IO.readInteger();

        for (int i=s;i<=e;i++) {

            if (i % 4==0){
                if (i % 100!=0){
                    System.out.println(i);
                }
                else if (i % 400==0){
                    System.out.println(i);
                }
            }
        }
        System.out.println("wieder?");
    } while (IO.readBoolean());
    }
}








