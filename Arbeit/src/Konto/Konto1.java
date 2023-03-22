package Konto;

public abstract class Konto1 {
    private Kunde inhaber;
    private double kontoStand;
    private double kreditLimit;
    private double zinsGuthaben;

    public Konto1(Kunde inhaber, double kreditLimit, double kontoStand, double zinsGuthaben) {
        this.inhaber = inhaber;
        this.kreditLimit = kreditLimit;
        this.zinsGuthaben = zinsGuthaben;
        this.kontoStand = kontoStand;
    }

    public Kunde getInhaber() {
        return inhaber;
    }


    public double getKontoStand() {
        return kontoStand;
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
        kontoStand += betrag;
    }
    public boolean auszahlen(double betrag){

        if ( kontoStand - betrag >-kreditLimit){
            kontoStand-=betrag;
            return true;
        }else
        return false;
    }

    @Override
    public String toString() {
        return "Konto "              +                       "\n\t" +
                "inhaber "           + inhaber         +     "\n\t" +
                "kontoStand "        + kontoStand      +     "\n\t" +
                "kreditLimit "       + kreditLimit     +     "\n\t" +
                "zinsGuthaben "      + zinsGuthaben                 ;
    }
}

