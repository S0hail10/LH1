package opp;

import java.io.IOException;

public class BMI {
    public static void main(String[] args) throws IOException {
        System.out.println("Gewichts (in kg)?");
        double gewicht = IO.readDouble();

        System.out.println("der Körpergröße (in cm)");
        double koerpergroesse = IO.readDouble();

        System.out.println("Geschlecht? (m / w)");
        String geschlecht = IO.readString();


        double maennlichbmi = gewicht*10000/Math.pow(koerpergroesse, 2);

        if (geschlecht.equalsIgnoreCase("m") ) {
            if (maennlichbmi<20)
            {
                System.out.println("Sie sind untergewicht!");
            }
            else if (maennlichbmi<25)
            {
                System.out.println("Sie sind Normalgewicht!");
            }
            else if (maennlichbmi<30)
            {
                System.out.println("Sie sind Übergewicht!");
            }
            else if (maennlichbmi<40)
            {
                System.out.println("Sie sind Adipositas!");
            }
            else
            {
                System.out.println("Sie sind Starke Adipositas!");
            }
        } else {


            double weiblichbmi = gewicht*10000/Math.pow(koerpergroesse, 2);

            if (weiblichbmi<19) {
                System.out.println("Sie sind untergewicht!");
            } else if (weiblichbmi<24) {
                System.out.println("Sie sind Normalgewicht!");
            } else if (weiblichbmi<30) {
                System.out.println("Sie sind Übergewicht!");
            } else if (weiblichbmi<40) {
                System.out.println("Sie sind Adipositas!");
            } else {
                System.out.println("Sie sind Starke Adipositas!");
            }

        }

    }
}
