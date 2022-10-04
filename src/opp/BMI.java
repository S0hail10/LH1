package opp;

import java.io.IOException;

public class BMI {
    public static void main(String[] args) throws IOException {
        System.out.println("Gewichts (in kg)?");
        double gewicht = IO.readDouble();

        System.out.println("der Körpergröße (in cm)");
        double körpergröße = IO.readDouble();

        System.out.println("Geschlecht?");
        String geschlecht = IO.readString();

        double männlichbmi = gewicht*10000/Math.pow(körpergröße, 2);
        System.out.println(männlichbmi);








    }
}
