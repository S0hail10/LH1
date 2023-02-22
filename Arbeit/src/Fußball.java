import java.util.ArrayList;

public class Fuﬂball {


    public class Mannschaft {

        private String name;

        private Trainer trainer;

        private Torwart torwart;

        private ArrayList<Spieler> spielerListe;


        public Mannschaft(String name, Trainer trainer, Torwart torwart) {

            name = name;

            trainer = trainer;

            torwart = torwart;

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



        public void setTorwart(String name) {

            this.torwart = torwart;

        }



        public int getMittelwert() {

            int mittelwert = torwart.getMotivation();

            for (Spieler spieler : spielerListe) {

                mittelwert += spieler.getMotivation();

            }

            return mittelwert / (spielerListe.size()+1);

        }

        public int getstaerke() {

            int mittelwert = torwart.getStaerke();

            for (Spieler spieler : spielerListe) {

                mittelwert += spieler.getStaerke();

            }

            return mittelwert / (spielerListe.size() + 1);

        }

    }
}
