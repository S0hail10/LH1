package AB;

import opp.IO;

import java.io.IOException;

public class Maexchen {
    public static void main(String[] args) throws IOException {
        System.out.println("Bitte die erste Augenzahl eingeben.");
        int ersteAZ = IO.readInteger();
        System.out.println("Bitte die zweite Augenzahl eingeben.");
        int zweiteAZ = IO.readInteger();

         if ((ersteAZ == 1) && (zweiteAZ == 2) || (ersteAZ == 2 && zweiteAZ == 1) ) {
             System.out.println("1000 Punkte");
         }

    }
}
