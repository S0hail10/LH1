public class testProgramm {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.setName("David");
        trainer.setAlter(18);
        trainer.setErfahrung(0);
        System.out.println(trainer);
        System.out.println();

        Spieler spieler = new Spieler();
        spieler.setName("Amjad");
        spieler.setAlter(5);
        spieler.setStaerke(-1);
        spieler.setMotivation(0);
        spieler.setTore(-5);
        spieler.setTorschuss(-10);
        System.out.println("Name: " + spieler.getName());
        System.out.println("Alter:"+ spieler.getAlter());
        System.out.println("Stärke:"+ spieler.getStaerke());
        System.out.println("Motivation:"+ spieler.getMotivation());
        System.out.println("Tore: "+ spieler.getTore()+  " (Eigentor)");
        System.out.println("Torschuss:"+ spieler.getTorschuss());


    }
}
