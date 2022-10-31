package Suchen_Sortieren;
import java.util.Scanner;
import java.lang.Math;

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
                return i+1;
            }
        }
        return -1;
    }

    public static int sucheBinär(int[] feld, int wert, int min, int max) {
        int i = (max+min)/2;
        if(feld[i] == wert) {
            return i+1;
        } else {
            if(feld[i] > wert) {
                return sucheBinär(feld, wert, min, i);
            }
            else {
                return sucheBinär(feld, wert, i+1, max);
            }}
    }

    public static int[] bogoSort(int[] feld) {
        int[] feldCopy = new int[feld.length];
        System.arraycopy(feld, 0, feldCopy, 0, feld.length);

        for(int i=0; i<feldCopy.length; i++) {
            int random = Math.round((float) Math.random() * (feldCopy.length-1));
            int merken = feldCopy[i];
            feldCopy[i] = feldCopy[random];
            feldCopy[random] = merken;
        }
        for(int i=1; i<feldCopy.length; i++) {
            if(feldCopy[i] < feldCopy[i-1]) {
                return bogoSort(feld);
            }
        }

        return feldCopy;

    }

    public static void bubbleSort(int[] feld) {
        for(int i=0; i<feld.length; i++) {

        }
    }

    public static void selectionSort(int[] feld) {

    }

    public static void insertionSort(int[] feld) {

    }

    public static void mergeSort(int[] feld) {

    }

    public static void quickSort(int[] feld) {

    }

    public static void puzzle() {

    }

    public static void main(String[] args) {
        int laenge = 10;
        int wert;
        int[] feld;
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------sucheLinear----------------");
        // zufälliges Feld erzeugen
        feld = erzeugeFeldZufall(laenge);
        // Feld ausgeben
        feldausgeben(feld);
        // Wert suchen
        wert = sc.nextInt();
        System.out.println(wert + " steht an Stelle  " + sucheLinear(feld, wert));

        System.out.println("----------------sucheBinär----------------");
        // sortiertes Feld erzeugen
        feld = erzeugeFeldSortiert(laenge);
        // Feld ausgeben
        feldausgeben(feld);
        // Wert suchen
        wert = sc.nextInt();
        System.out.println(wert + " steht an Stelle  " + sucheBinär(feld, wert, 0, laenge));
        System.out.println("----------------BOGOSORT----------------");
        int[] bogoFeld = {1, 0, 5, 3};
        int[] bogoFeldSorted = new int[bogoFeld.length];
        bogoFeldSorted = bogoSort(bogoFeld);
        feldausgeben(bogoFeldSorted);
        System.out.println("----------------BUBBLESORT----------------");
        int[] bubbleFeld = {12, 76, 30, 42, 10, 60, 34, 90, 35};
        int[] bubbleFeldSorted = new int[bubbleFeld.length];
        bubbleFeldSorted = bubbleSort(bubbleFeld);
        feldausgeben(bubbleFeldSorted);
    }
}