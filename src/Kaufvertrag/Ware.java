package Kaufvertrag;

import java.util.ArrayList;

public class Ware {
    private String bezeichnung;
    private String beschreibung;
    private double preis;
    private ArrayList<String> besonderheiten =new ArrayList<String>();
    private ArrayList<String> maengeel = new ArrayList<String>();

    public Ware(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;

    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public ArrayList<String> getBesonderheiten() {
        return besonderheiten;
    }

    public ArrayList<String> getMaengeel() {
        return maengeel;
    }

    @Override
    public String toString() {
        return " Ware" +
                " bezeichnung:" + bezeichnung +"\n\t"    +
                "beschreibung: " + beschreibung +"\n\t"    +
                " preis: " + preis +"\n\t"    +
                " besonderheiten:" + besonderheiten +"\n\t"    +
                " maengeel: " + maengeel+"\n\t";
    }
}
