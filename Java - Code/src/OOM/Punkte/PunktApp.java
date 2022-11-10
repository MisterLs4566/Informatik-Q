package OOM.Punkte;

public class PunktApp {
    public static void main(String[] args) {
        Punkt p1 = new Punkt(10, 15);
        Punkt p2 = new Punkt(8, 15);

        System.out.println("Abstand der Punkte: " + p1.abstandPunkt(p2));

        Punkt p3 = p1.spiegelungUrsprung();
        System.out.println(p3.toString());
    }
}
