package Konto;

public abstract class Konto1 {
    private Kunde inhaber;
    private double kotoStand;
    private double kreditLimit;
    private double zinsGuthaben;

    public Konto1(Kunde inhaber, double kreditLimit, double zinsGuthaben) {
        this.inhaber = inhaber;
        this.kotoStand = kotoStand;
        this.kreditLimit = kreditLimit;
        this.zinsGuthaben = zinsGuthaben;
    }

    public Kunde getInhaber() {
        return inhaber;
    }


    public double getKotoStand() {
        return kotoStand;
    }


    public double getKreditLimit() {
        return kreditLimit;
    }

    public void setKreditLimit(double kreditLimit) {
        this.kreditLimit = kreditLimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }

    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }
    public void einzahlen(double betrag) {
    }
    public boolean auszahlen(double betrag){
        return false;
    }

    @Override
    public String toString() {
        return "Konto1" + "\n\t " +
                "inhaber=" + inhaber +
                ", kotoStand=" + kotoStand +
                ", kreditLimit=" + kreditLimit +
                ", zinsGuthaben=" + zinsGuthaben +
                '}';
    }
}

