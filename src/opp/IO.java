package opp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        return text;
    }

    public static int readInteger() throws IOException {
        while (true) {
            try {
                String text = readString();
                int zahl = Integer.parseInt(text);
                return zahl;
            } catch (NumberFormatException e) {
                System.out.println("Falsche Einageb!! Bitte wiederholer");
            }

        }
    }

    public static double readDouble() throws IOException {
        while (true) {
            try {
                String text = readString();
                double zahl = Double.parseDouble(text);
                return zahl;

            } catch (NumberFormatException e) {
                System.out.println("Falsche Einageb!! Bitte wiederholer");
            }
        }
    }
    public static boolean readBoolean() throws IOException {
        while (true) {
        String eingabe = readString();
        if (eingabe != null) {
            if (eingabe.equalsIgnoreCase("ja") || (eingabe.equalsIgnoreCase("j") || (eingabe.equalsIgnoreCase("yes")))) {
                return true;
            }else {                if (eingabe.equalsIgnoreCase("Nein") || (eingabe.equalsIgnoreCase("n") || (eingabe.equalsIgnoreCase("No"))))                  return false;
                }
            System.out.println("EROR 404 not founded");
            }

        }
    }
}



