package Tresor;



import java.util.ArrayList;



public class Tresor {



    private ArrayList<Gegenstand> gegenstaende;


    public Tresor() {

    }



    public ArrayList<Gegenstand> getGegenstaende(int id) {

        return gegenstaende;

    }



    public void addGegenstand(Gegenstand gegenstand){

        gegenstaende.add(gegenstand);

    }



    public void remoreGegenstand(Gegenstand gegenstand){

        gegenstaende.remove(gegenstand);

    }



    public double berechneGesamtwert(){

        return berechneGesamtwert();

    }



    @Override

    public String toString() {

        return  "Tresor"        +                           "\n\t"      +

                "Gegenstaende"  + gegenstaende         +    "\n\t"      ;
    }







public class GegenstandNichtGefundenException extends Exception{





    private int id;



    public GegenstandNichtGefundenException(int id) {
