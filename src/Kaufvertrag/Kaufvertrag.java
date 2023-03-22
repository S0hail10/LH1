package Kaufvertrag;

public class Kaufvertrag {
private Vertragspartner verkaeufer;
private Vertragspartner kaeufer;
private Ware ware;
private String zahlungsModaliaeten;

    public Kaufvertrag(Vertragspartner verkaeufer, Vertragspartner kaeufer, Ware ware) {
        this.verkaeufer = verkaeufer;
        this.kaeufer = kaeufer;
        this.ware = ware;
    }

    public Vertragspartner getVerkaeufer() {
        return verkaeufer;
    }


    public Vertragspartner getKaeufer() {
        return kaeufer;
    }

    public void setKaeufer(Vertragspartner kaeufer) {
        this.kaeufer = kaeufer;
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public String getZahlungsModaliaeten() {
        return zahlungsModaliaeten;
    }

    public void setZahlungsModaliaeten(String zahlungsModaliaeten) {
        this.zahlungsModaliaeten = zahlungsModaliaeten;
    }

    @Override
    public String toString() {
        return " Kufvertrag" +"\n\t"    +
                "======================================================="+"\n\t"    +
                "verkaeufer" + verkaeufer +"\n\t"    +
                "======================================================="+"\n\t"    +
                " kaeufer" + kaeufer +"\n\t"    +
                "======================================================="+"\n\t"    +
                " ware" + ware +"\n\t"    +
                "======================================================="+"\n\t"    +
                "zahlungsModaliaeten" + zahlungsModaliaeten+"\n\t";
    }
}
