package Kaufvertrag;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        Adresse adresse1 = new Adresse("Hohentorsheerstr","3","28119","Bremen");
        Adresse adresse2 = new Adresse("Hohentorsheerstr","4","28119","Bremen");

        Ware ware = new Ware("Handy", 200);
        Vertragspartner verkeaufer= new Vertragspartner("Mika","könig");
        Vertragspartner keaufer= new Vertragspartner("Amjad","Alarab");
        Kaufvertrag kaufvertrag = new Kaufvertrag(verkeaufer,keaufer,ware);
        verkeaufer.setAdresse(adresse1);
        verkeaufer.setAusweisNr("22201");

        keaufer.setAdresse(adresse2);
        keaufer.setAusweisNr("224346");
        ware.setBeschreibung("schön");
        ware.getBesonderheiten().add("ist wie neue");
        ware.getMaengeel().add("keien Ladekabel");
        kaufvertrag.setZahlungsModaliaeten("BAr/Karte");


        System.out.println(kaufvertrag);
        String datei = "H:\\sohey\\datei.txt";
        PrintWriter writer = new PrintWriter (datei);
        writer.println(kaufvertrag);
        writer.close();

    }

}