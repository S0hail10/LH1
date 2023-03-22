package Konto;

public class Mitarbeiter extends Person {

    public Mitarbeiter(String vorname, String nachname) {

        super(vorname, nachname, null);
    }

    @Override
    public String toString() {
        return "Mitarbeiter "        + "\n\t " +
                super.toString()              ;
    }
}
