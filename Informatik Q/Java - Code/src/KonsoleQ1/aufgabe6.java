package KonsoleQ1;

import java.util.Scanner;

public class aufgabe6 {
    public static void main(String[] args) {
        System.out.println("Wie viele Zahlen sollen generiert werden?");
        Scanner anzahlEingabe = new Scanner(System.in);
        int anzahl, zufallszahl;
        double summe = 0;
        double mittelwert = 0;
        int kleinsteZahl = 10000;
        int groeßteZahl = 0;

        anzahl = anzahlEingabe.nextInt();
        for(var i=1; i<=anzahl; i++) {
            zufallszahl = (int) Math.round(Math.random() * (9000) + 1000);
            System.out.println(zufallszahl);
            summe+=zufallszahl;
            mittelwert = summe/i;
            if(zufallszahl < kleinsteZahl) {
                kleinsteZahl = zufallszahl;
            }

            if(zufallszahl > groeßteZahl) {
                groeßteZahl = zufallszahl;
            }
        }
        System.out.println("Mittelwert: " + mittelwert);
        System.out.println("Minimum: " + kleinsteZahl);
        System.out.println("Maximum: " + groeßteZahl);
    }
}
