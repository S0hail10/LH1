package Fu�ball;

public class Trainer extends Person {
    private int erfahrung;

    public Trainer(String name, int alter, int erfahrung) {
        super(name,alter);

        this.erfahrung = erfahrung;
    }


    public int getErfahrung() {
        return erfahrung;
    }

    public void setErfahrung(int erfahrung) {
        this.erfahrung = erfahrung;
    }

    @Override
    public String toString() {
        String text = "Name:" + getName();
        text = text + "\n" + "Alter:" + getAlter();
        text = text + "\n" + "Erfahrung:" + erfahrung;
        return text;
    }
}

