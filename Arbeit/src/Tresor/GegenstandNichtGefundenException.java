package Tresor;

public class GegenstandNichtGefundenException(int id) {

    this

}



    public int getId() {

        return id;

    }



    public String getMessage(){

        return "Gegenstand wurde nicht gefunden" +

                super.getMessage();

    }
}
