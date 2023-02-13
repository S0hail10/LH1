public class Trainer {
    private String Name;
    private int Alter;
    private int Erfahrung;

    public Trainer(String name, int Alter, int Erfahrung) {
    }

    public Trainer() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAlter() {
        return Alter;
    }

    public void setAlter(int alter) {
        this.Alter = alter;
    }

    public int getErfahrung() {
        return Erfahrung;
    }

    public void setErfahrung(int erfahrung) {
        this.Erfahrung = erfahrung;
    }

    @Override
    public String toString() {
        String text = "Name:" + Name;
        text = text + "\n" + "Alter:" + Alter;
        text = text + "\n" + "Erfahrung:" + Erfahrung;
        return text;
    }
}

