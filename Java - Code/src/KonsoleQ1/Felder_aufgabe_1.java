package KonsoleQ1;

public class Felder_aufgabe_1
{
    public static int[] loescheZahl(int[] w, int z) {
        boolean allesGeloescht = false;
        int[] wNeu = new int[10];

        while(allesGeloescht == false) {
            allesGeloescht = true;
            for(int i=0; i<w.length; i++) {
                if(w[i] == z){
                    allesGeloescht = false;
                    for(int j=i; j<w.length-1; j++) {
                        w[j] = w[j+1];
                    }

                    for(int k=0; k<w.length-1; k++) {
                        wNeu[k] = w[k];
                    }
                }
            }
        }


        return wNeu;
    }
    public static boolean welcheZahl(int[] w, int z) {
        for(int i=0; i<w.length; i++) {
            if(w[i] == z) {
                return true;
            }
        }

        return false;
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
            w[i] = (int) (Math.random() * 10) + 1;
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
        if(welcheZahl(werte, 1)) {
            System.out.println("Die Zahl: " + 1 + " existiert im Array");
        }
        else {
            System.out.println("Die Zahl: " + 1 + " existiert nicht im Array");
        }

        werte = loescheZahl(werte,1);
        gibWerteAus(werte);
    }
}
