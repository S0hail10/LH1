import java.util.ArrayList;

public class Mannschaft {


        private String name;

        private Trainer trainer;

        private Torwart torwart;

        private ArrayList<Spieler> spielerListe;



        public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList spielerListe) {

            this.name = name;

            this.trainer = trainer;

            this.torwart = torwart;

            this.spielerListe = spielerListe;

        }


        public String getName() {

            return name;

        }


        public void setName(String name) {

            this.name = name;

        }


        public Trainer getTrainer() {

            return trainer;

        }


        public void setTrainer(String name) {

            this.trainer = trainer;

        }


        public Torwart getTorwart() {

            return torwart;

        }


    public ArrayList<Spieler> getSpielerListe() {
        return spielerListe;
    }

    public void setSpielerListe(ArrayList<Spieler> spielerListe) {
        this.spielerListe = spielerListe;
    }

    public void setTorwart(String name) {

            this.torwart = torwart;

        }


        public int getmotivition() {

            int motivition = torwart.getMotivation();

            for (Spieler spieler : spielerListe) {

                motivition += spieler.getMotivation();

            }

            return motivition / (spielerListe.size()+1);

        }

        public int getstaerke() {

            int staerke = torwart.getStaerke();

            for (Spieler spieler : spielerListe) {

                staerke += spieler.getStaerke();

            }

            return staerke / (spielerListe.size() + 1);

        }

        @Override

        public String toString() {

            return "\n\t" + "Mannschaft " +"\n\t"+

                    "name = " + name +"\n\t"+

                    "trainer = " + trainer +"\n\t"+

                    "torwart = " + torwart +"\n\t"+

                    "spielerListe = " + spielerListe+"\n\t";
        }
    }
