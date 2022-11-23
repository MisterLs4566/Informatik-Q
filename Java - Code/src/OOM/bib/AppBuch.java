package OOM.bib;

public class AppBuch {
    public static void main(String[] args) {
        Buch buch = new Buch("3453209613", "Per Anhalter durch die Galaxis", "Douglas Adams");
        buch.setStandort("SY-12-34");
        System.out.println(buch.toString());
    }
}
