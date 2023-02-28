package Fuﬂball;

public class Torwart extends Spieler{
    private int reaktion;

    public Torwart(String name, int alter, int stearke, int motivation, int reaktion) {

        super(name, alter, stearke, 0, motivation, 0);

        this.reaktion = reaktion;

    }



    public int getReaktion() {

        return reaktion;

    }

    public void setReaktion(int reaktion) {

        this.reaktion = reaktion;

    }



    @Override

    public String toString() {

        String text = "Name: " + getName()+"\n\t";

        text += "Alter " + getAlter()+"\n\t";

        text +=  "St‰rke " + getStaerke()+"\n\t";

        text +=  "Motavation " + getMotivation()+"\n\t";

        text +=  "Reaktion " + reaktion+"\n\t";

        return text;

    }

}