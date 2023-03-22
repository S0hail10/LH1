package Konto;

public class Sparkonto extends Konto1{


    public Sparkonto(Kunde inhaber, double kreditLimit, double kontoStand, double zinsGuthaben) {
        super(inhaber, 0, 0, zinsGuthaben);
    }

    @Override
    public String toString() {
        return "Sparkonto ";
    }
}
