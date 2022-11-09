package AB;

import opp.IO;

import java.io.IOException;

public class Quadratsummen {
    public static void main(String[] args)throws IOException {
        System.out.println("Geben Sie bitte die Ganzzahl n ein!");
        int n= IO.readInteger();
        int qs = 0;
        int i=1;

         while (i<=n){
             qs=qs+i*i;
             System.out.println("Zahl: " +i+ "   Quadrat: " +qs);
             i++;
         }

    }
}
