package AB;

import opp.IO;

import java.io.IOException;

public class Wurzel {
    public static void main(String[] args) throws IOException {
        System.out.println("ab welche Zahl?");
        int a = IO.readInteger();
        System.out.println("bis welche Zahl?");
        int b = IO.readInteger();
        for (int i=a; i<=b;i++)
        {
            System.out.println("Der Wurtel von "+i+ " ist "+ Math.sqrt(i));
        }
    }
}


