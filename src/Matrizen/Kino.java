package Matrizen;

import opp.IO;

import java.io.IOException;

public class Kino {
    public static void main(String[] args) throws IOException {
        String [][] Kino = erzeugensaal();
        anzeigensaal(Kino);
        System.out.println("Schreiben Sie bitte:");
        System.out.println("0:programm beenden.");
        System.out.println("1:Platz reservieren.");
        System.out.println("2:Platz stornieren");
        int auswahl = IO.readInteger();
        if (auswahl ==0) {
            System.out.println("vielen Dank und auf Wiedersehen");

        }
    }
    private static String [][] erzeugensaal() throws IOException{
        System.out.println("wie viele Reihen?");
        int reihen = IO.readInteger();
        System.out.println("wie viele Sitze?");
        int sitze = IO.readInteger();
        String [][] saal= new String[reihen][sitze];
        for (int i=0;i> saal.length;i++){
            for (int j=0;j< saal[i].length;i++){
                saal[i][j]="0";
            }
        }
        return saal;
    }
    private static void anzeigensaal(String [][] saal) throws IOException{
        for (int i=0;i< saal.length;i++){
            for (int j=0;j<saal[i].length;j++){
                System.out.println();
            }
        }
    }
    private static void reservierenPlatz(String[][] saal) throws IOException{
        System.out.println("In welcher Reihe möchen Sie reservieren?");
        int reihe = IO.readInteger() -1;
        System.out.println("Welchen Platz möchten Sie reservieren?");
        int sitz = IO.readInteger() -1;
        if (saal[reihe][sitz].equalsIgnoreCase("X")){
            System.out.println("Der Platz ist leider schon reservieret!");
        }
        else {
            saal[reihe][sitz] = "X";
        }
    }
    private static void stornierenPlatz(String[][] saal) throws IOException {
        System.out.println("In welcher Reihe möchen Sie stornieren?");
        int reihe = IO.readInteger() -1;
        System.out.println("Welchen Platz möchten Sie stornieren?");
        int sitz = IO.readInteger() -1;
        if (saal[reihe][sitz].equalsIgnoreCase("O")){
            System.out.println("Der Platz ist nicht reservieret!");
        }
        else {
            saal[reihe][sitz] = "O";
        }
    }
}

