public class Ergebnis {

        private int toreGast;

        private int toreHeim;

        public Ergebnis(int ToreGast, int toreHeim){

            this.toreGast = toreGast;

            this.toreHeim = toreHeim;

        }

    public Ergebnis() {

    }


    public int gettoreGast() {

            return toreGast;

        }



        public void addToreGast() {

            this.toreGast ++;

        }



        public int gettoreHeim() {

            return toreHeim;

        }



        public void addToreHeim() {

            this.toreHeim ++;

        }



        @Override

        public String toString() {

            return "Ergebnis " +"\n\t"+

                    "Heimmannschaft= " + toreGast +"\n\t"+

                    "Gastmmannschaft= " + toreHeim+"\n\t";

        }

    }

