package Tresor;



public class Aktie extends Gegenstand{





    private String unternehmen;

    private double nennwert;





    public Aktie(int id, double wert, String unternehmen, double nennwert) {

        super(id, wert);

        this.nennwert =nennwert;

        this.unternehmen = unternehmen;

    }



    public String getUnternehmen() {

        return unternehmen;

    }



    public void setUnternehmen(String unternehmen) {

        this.unternehmen = unternehmen;

    }



    public double getNennwert() {

        return nennwert;

    }



    public void setNennwert(double nennwert) {

        this.nennwert = nennwert;

    }



    @Override

    public String toString() {

        return  "Aktie"         +                       "\n\t"      +

                "Unternehmen"   + unternehmen       +   "\n\t"      +

                "Nennwert"      + nennwert          +   "\n\t"      ;

    }

}
