package Konto;

public class Girokonto extends Konto1 {

    private double zinsKredit;

    public Girokonto(Kunde inhaber, double kreditLimit, double kontoStand, double zinsGuthaben, double zinsKredit) {
        super(inhaber, kreditLimit, kontoStand, zinsGuthaben);
        this.zinsKredit = zinsKredit;
    }


    public double getZinsKredit() {
        return zinsKredit;
    }

    public void setZinsKredit(double zinsKredit) {
        this.zinsKredit = zinsKredit;
    }

    public boolean uberweisen  (double betrag, Girokonto girokarte) {
        if (betrag - getKontoStand() < -getKreditLimit()) {
            return false;
        } else
            auszahlen(betrag);
        return true;
    }

    @Override
    public String toString() {
        return  "Girokonto "          +
                "zinsKredit "         +      zinsKredit ;
    }
}

