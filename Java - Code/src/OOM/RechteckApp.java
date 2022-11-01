package OOM;

public class RechteckApp {
    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck(0, 20, 10, 100);
        System.out.println(rechteck.toString());
        System.out.println("Fläche: " + rechteck.flaeche());
    }
}
