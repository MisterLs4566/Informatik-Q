package KonsoleQ1;

public class Felder_aufgabe_1
{
    public static boolean welcheZahl()
    {

    }
    public static double mittelwert(int[] w) {
        int summe = 0;
        double durchschnitt = 0;

        for(int i=0; i<w.length; i++) {
            summe+=w[i];
            durchschnitt = summe/w.length;
        }

        return durchschnitt;
    }

    public static int[] datenEingeben(int[] w) {
        for(int i=0; i<w.length; i++) {
            w[i] = (int) (Math.random() * 9000) + 1000;
        }

        return w;
    }

    public static void gibWerteAus(int[] w) {
        for (int i=0; i<w.length; i++) {
            System.out.println("Wert: " + w[i]);
        }
    }

    public static void main(String[] args) {
        int[] werte = new int[10];
        double mittelwert;

        werte = datenEingeben(werte);
        gibWerteAus(werte);
        System.out.println("Durchschnitt: " + mittelwert(werte));
        welcheZahl();
    }
}
