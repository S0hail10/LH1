package RollenSpiel;

public class TestProgramm {
    public static void main(String[] args) {



        Elfe elfe= new Elfe("Marvin",10);

        Zauberer zauberer=new Zauberer("Bobo",10,10);

        System.out.println(elfe);

        System.out.println(zauberer);


        try {

            elfe.rennen();

            zauberer.laufen();

            elfe.kaempfen();

        }catch (KeineKraftException e){


            System.out.println(e.getMessage());



        }

        System.out.println(elfe);

        System.out.println(zauberer);



    }

}


