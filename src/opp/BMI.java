package opp;

import java.io.IOException;

public class BMI {
    public static void main(String[] args) throws IOException {
        System.out.println("Gewichts (in kg)?");
        double gewicht = IO.readDouble();

        System.out.println("der K�rpergr��e (in cm)");
        double k�rpergr��e = IO.readDouble();

        System.out.println("Geschlecht?");
        String geschlecht = IO.readString();

        double m�nnlichbmi = gewicht*10000/Math.pow(k�rpergr��e, 2);
        System.out.println(m�nnlichbmi);








    }
}
