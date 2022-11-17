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

    public static int[] bubbleSort(int[] feld) {
        /*boolean tauschen = true;
        int merken;
        while(tauschen) {
            tauschen = false;
            for(int i=0; i<feld.length-1; i++) {
                if(feld[i+1] < feld[i]) {
                    merken = feld[i+1];
                    feld[i+1] = feld[i];
                    feld[i] = merken;
                    tauschen = true;
                }
            }
        }
        */

        int n = feld.length;
        // geht das Feld bis zum Ende durch
        for (int i=0; i<n-1; i++) {
            //geht das Feld bis zu ende - i durch
            for(int j=0; j<n-i-1; j++) {
                if(feld[j] > feld[j+1]) {
                    int temp = feld[j+1];
                    feld[j+1] = feld[j];
                    feld[j] = temp;
                }
            }
        }

        return feld;
    }

    public static int[] selectionSort(int[] feld) {
        /*int min = 0;
        int merken;
        for(int i=0; i<feld.length-1; i++) {
            for(int j=i; j<feld.length-1; j++) {
                if(feld[j] < feld[j+1]) {
                    min = j;
                }
            }
            merken = feld[i];
            feld[i] = feld[min];
            feld[min] = merken;
        }
        */

        int n = feld.length;
        for(int i=0; i < n-1; i++) {
            int minID = i;
            for(int j=i+1; j<n; j++) {
                if(feld[j] < feld[minID]) {
                    minID = j;
                }
            }
            int temp = feld[minID];
            feld[minID] = feld[i];
            feld[i] = temp;

        }

        return feld;
    }

    public static int[] insertionSort(int[] feld) {
        int n = feld.length;
        for(int i=1; i<n; i++) {
            int key = feld[i];
            int j = i - 1;
            while (j >= 0 && feld[j] > key) {
                feld[j+1] = feld[j];
                j--;
            }

            feld[j+1] = key;
        }
        return feld;
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
        System.out.println("----------------SELECTIONSORT----------------");
        int[] selectionField = {12, 76, 30, 42, 10, 60, 34, 90, 35};
        int[] selectionFieldSorted = new int[selectionField.length];
        selectionFieldSorted = selectionSort(selectionField);
        feldausgeben(selectionFieldSorted);
        System.out.println("----------------INSERTIONSORT----------------");
        int[] insertionField = {12, 76, 30, 42, 10, 60, 34, 90, 35};
        int[] insertionFieldSorted = new int[insertionField.length];
        insertionFieldSorted = insertionSort(insertionField);
        feldausgeben(insertionFieldSorted);
    }
}