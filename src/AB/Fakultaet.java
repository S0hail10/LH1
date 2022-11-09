package AB;

import opp.IO;

import java.io.IOException;

public class Fakultaet {
    public static void main(String[] args) throws IOException {
        System.out.println("geben Sie bitte n ein!");
        int n = IO.readInteger();
        int f = 1;

        int i=1;
        while (i<=n){
          f = i * f;

          i++;
        }
        System.out.println(f);
    }
}
