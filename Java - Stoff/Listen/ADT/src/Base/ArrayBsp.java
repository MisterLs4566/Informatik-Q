package Base;

class ArrayBsp {
    static int[] a;
    static int[] b;
    static int zahl = 15;

    static void feldAusgabe(int[] feld) {
        for (int i = 0; i < feld.length; i++)
            System.out.print(feld[i] + " ");

        System.out.println();
    }

    static void feldAenderung(int[] feld) {
        feld[2] = 21;
    }

    static void zahlAenderung(int wert) {
        wert = 21;
    }

    public static void main(String[] arg) {
        // Out.println ("b[0] = " + b[0]); --> NullPointerException
        a = new int[3]; // a[0] = 0; a[1] = 0; a[2] = 0; automatisch
        System.out.print("Feld a: ");
        feldAusgabe(a);
        b = a; // kein Fehler
        System.out.print("Feld b: ");
        feldAusgabe(b);
        a[0] = 17;
        System.out.print("Feld a: ");
        feldAusgabe(a);
        System.out.print("Feld b: ");
        feldAusgabe(b);
        System.out.println("Feldveraenderung in Methode");
        feldAenderung(a);
        System.out.print("Feld a: ");
        feldAusgabe(a);
        System.out.print("Feld b: ");
        feldAusgabe(b);
        b = null;
        // Out.println("b[0] = " + b[0]); --> NullPointerException
        System.out.println("Zahl = " + zahl);
        zahlAenderung(zahl);
        System.out.println("Zahlveraenderung in Methode");
        System.out.println("Zahl = " + zahl);
    }
}