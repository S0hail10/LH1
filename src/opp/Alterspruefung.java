package opp;

import java.io.IOException;

public class Alterspruefung {
    public static void main(String[] args) throws IOException {
        System.out.println("Alter?");
        int alter = IO.readInteger();
        System.out.println(alter);

        if (alter < 18) {
            System.out.println("Du bist noch minderjaehrig");
        }
        else
        {
            System.out.println("Du bist schon volljaehrig");
        }
    }
}
