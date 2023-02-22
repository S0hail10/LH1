
    public class Spiel {

        private StringBuilder spielbericht;

        private Mannschaft heimMannschaft;

        private Mannschaft gastMannschaft;

        private Ergebnis ergebnis;

        public Spiel(Mannschaft heimMannschaft, Mannschaft gastMannschaft){

            this.heimMannschaft = heimMannschaft;

            this.gastMannschaft = gastMannschaft;

            this.spielbericht = new StringBuilder();

            this.ergebnis = new Ergebnis();

        }

        public StringBuilder getSpielbericht() {

            return spielbericht;
        }

        public void setSpielbericht(StringBuilder spielbericht) {

            this.spielbericht = spielbericht;
        }

        public Mannschaft getHeimMannschaft() {

            return heimMannschaft;

        }

        public void setHeimMannschaft(Mannschaft heimMannschaft) {

            this.heimMannschaft = heimMannschaft;

        }

        public Mannschaft getGastMannschaft() {

            return gastMannschaft;

        }

        public void setGastMannschaft(Mannschaft gastMannschaft) {

            this.gastMannschaft = gastMannschaft;
        }

        public Ergebnis getErgebnis() {

            return ergebnis;
        }

        public void setErgebnis(Ergebnis ergebnis) {

            this.ergebnis = ergebnis;

        }



        @Override

        public String toString() {

            return "\n\t" + "Spiel " +

                    "Heimmannschaft = " + heimMannschaft.getName() +

                    "Gastmannschaft = " + gastMannschaft.getName() +

                    "ergebnis = " + ergebnis;

        }

    }


