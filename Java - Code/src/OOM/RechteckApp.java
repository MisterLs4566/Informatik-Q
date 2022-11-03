package OOM;

public class RechteckApp {
    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck(0, 20, 10, 100);
        System.out.println(rechteck.toString());
        System.out.println("Fläche: " + rechteck.flaeche());
        System.out.println("Umfang: " + rechteck.berechneUmfang());
        rechteck.verschiebe(10, 10);

        Rechteck rechteck2 = new Rechteck(21, 100, 10, 100);
        System.out.println("Schneidet sich? " + rechteck.schneidet(rechteck2));
    }
}
