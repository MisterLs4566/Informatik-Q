package Suchen_Sortieren;
import java.util.Scanner;

public class Suchen {

    public static void feldausgeben(int[] feld) {
        for(int i : feld) {
            System.out.println(i);
        }
    }

    public static int[] erzeugeFeldZufall(int laenge) {
        int[] feld = new int[laenge];
        for(int i=0; i<=feld.length-1; i++) {
            feld[i] = (int)(Math.random() * 10);
        }
        return feld;
    }

    public static int[] erzeugeFeldSortiert(int laenge) {
        int[] feld = new int[laenge];
        int zahl = 0;
        for(int i=0; i<=feld.length-1; i++)  {
            feld[i] = zahl+=Math.random() * 10;
        }
        return feld;
    }

    public static int sucheLinear(int[] feld, int wert) {
        for(int i=0; i<=feld.length; i++) {
            if(feld[i] == wert) {
                return i;
            }
        }
        return -1;
    }

    public static int sucheBinär(int[] feld, int wert, int min, int max) {
        int i = (max-min)/2;
        if(feld[i] == wert) {
            return i;
        } else if(feld[i] > wert) {
            return sucheBinär(feld, wert, min, i);
        } else {
            return sucheBinär(feld, wert, i, max);
        }
    }

    public static void sortiereBubble(int[] feld) {

    }

    public static void selectionSort(int[] feld) {

    }

    public static void insertionSort(int[] feld) {

    }

    public static void mergeSort(int[] feld) {

    }

    public static void quickSort(int[] feld) {

    }

    public static boolean check_sorted(int[] feld) {

    }

    public static boolean sortRandom(int[] num_used){

    }

    public static void puzzle() {

    }

    public static int[] bogosort(int[] feld) {
        int[] num_used = new int[feld.length-1];
        sortRandom(num_used);
        puzzle();
        if(check_sorted(feld)){
            return feld;
        }
        else {
            return bogosort(feld);
        }
    }

    public static void main(String[] args) {
        int laenge = 100;
        int wert;
        int[] feld;
        Scanner sc = new Scanner(System.in);

        // zufälliges Feld erzeugen
        feld = erzeugeFeldZufall(laenge);
        // Feld ausgeben
        feldausgeben(feld);
        // Wert suchen
        wert = sc.nextInt();
        System.out.println(wert + " steht an Stelle  " + sucheLinear(feld, wert));

        // sortiertes Feld erzeugen
        feld = erzeugeFeldSortiert(laenge);
        // Feld ausgeben
        feldausgeben(feld);
        // Wert suchen
        wert = sc.nextInt();
        System.out.println(wert + " steht an Stelle  " + sucheBinär(feld, wert, 0, laenge));
    }
}
