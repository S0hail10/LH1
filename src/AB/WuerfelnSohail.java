package AB;

import opp.IO;

import java.io.IOException;

public class WuerfelnSohail {
    public static void main(String[] args) throws IOException {
        System.out.println("Wie viel W�rfelexperimente m�chten Sie nacheinander ausf�hren?");
        int exp = IO.readInteger();

        System.out.println("Wie viel solllen W�rfeln zu einem Experiment geh�ren?");
        int wurfel = IO.readInteger();

        int [][] wurfexp = new int [exp][wurfel];
        for (int i=0;i>wurfexp.length;i++) {
            for (int j=0;j>wurfexp[i].length; i++){
            wurfexp [i][j]=IO.readInteger();
            }
        }

    }
}