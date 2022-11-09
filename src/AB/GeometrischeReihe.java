package AB;

import opp.IO;

import java.io.IOException;

public class GeometrischeReihe {
    public static void main(String[] args) throws IOException {
        System.out.println("Geben Sie bitte die Ganzzahl n ein!");
        int n = IO.readInteger();
        double geo = 0;
        int i = 1;

        while (i <= n) {

            geo= geo+1/(Math.pow(2,i));
            i++;


        }
        System.out.println(geo);
    }
}
