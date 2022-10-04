package opp;

import java.io.IOException;

public class TestIO {
    public static void main(String[] args) throws IOException {
        System.out.println("Name?");
        String Name = IO.readString();
        System.out.println("Answer :" + Name );

        System.out.println("Wie alt bist Du?");
        int alter = IO.readInteger();
        System.out.println("Du bist anscheinend " + alter + " Jahre alt");

        System.out.println("wie gross bist du?");
        double gross = IO.readDouble();
        System.out.println("du bist " + gross +"gross");
    }
}
