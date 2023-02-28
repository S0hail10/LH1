package RollenSpiel;

public class Zauberer extends SpielFigur {

    private int zauberpunkte;



    public Zauberer(String name, int staerkePunkte, int zauberpunkte) {



        super(name, staerkePunkte);



        this.zauberpunkte=zauberpunkte;



    }







    public int getZauberpunkte() {



        return zauberpunkte;



    }



    public void trinkenZaubertrank(){



        zauberpunkte += 3;



    }



    public void zaubern() throws KeineKraftException {



        if(getStaerkePunkte()<1){



            throw new KeineKraftException("Zaubern",getName()) ;



        }else



            zauberpunkte --;







    }







    @Override



    public String toString() {



        return "Zauberer: " +"\n\t "+



                super.toString()+



                "Zauberpunkte= " + zauberpunkte+"\n\t";



    }



}