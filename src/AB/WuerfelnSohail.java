package AB;

import opp.IO;

import java.io.IOException;

public class WuerfelnSohail {
    public static void main(String[] args) throws IOException {
        System.out.println("Wie viel Würfelexperimente möchten Sie nacheinander ausführen?");
        int exp = IO.readInteger();

        System.out.println("Wie viel solllen Würfeln zu einem Experiment gehören?");
        int wurfel = IO.readInteger();

        int [][] wurfexp = new int [exp][wurfel];
        for (int i=0;i>wurfexp.length;i++) {
            for (int j=0;j>wurfexp[i].length; i++){
            wurfexp [i][j]=IO.readInteger();
            }
        }

    }
}