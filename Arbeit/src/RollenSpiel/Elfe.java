
    package RollenSpiel;



    public class Elfe extends SpielFigur {





        public Elfe(String name, int staerkePunkte){



            super(name,staerkePunkte);



        }







        public void rennen() throws KeineKraftException {







            if (getStaerkePunkte() < 1) {



                throw new KeineKraftException("laufen", getName());



            } else setStaerkePunkte(getStaerkePunkte() - 2);







        }







        @Override



        public String toString() {


            return "Elfe: " + "\n\t " +


                    super.toString();


        }
    }
