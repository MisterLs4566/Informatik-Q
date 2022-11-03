package OOM;

public class KreisApp {
    public static void main(String[] args) {
        Kreis kreis = new Kreis(0, 100, 10);
        System.out.println(kreis.toString());
        System.out.println(kreis.flaeche());
        System.out.println(kreis.radius());
        System.out.println(kreis.mittelpunkt());

        Kreis kreis2 = new Kreis(150, 200, 500);
        System.out.println(kreis.schneidet(kreis2));
    }
}
