package KonsoleQ1;

import java.util.Scanner;

public class Parkscheinautomat
{
    public static void main(String[] args)
    {
        System.out.println("Geben Sie die Stunden ein");
        Scanner eingabeStunden = new Scanner(System.in);
        System.out.println("geben Sie den Geldbetrag ein");
        Scanner eingabeGeldbetrag = new Scanner(System.in);
        double stunden = eingabeStunden.nextDouble();
        double geldbetrag = eingabeGeldbetrag.nextDouble();
        double zahlbetrag, wechselgeld, parkgebuehr;
        parkgebuehr = stunden * 0.6;
        if (parkgebuehr > 5) {
            zahlbetrag = parkgebuehr - geldbetrag;
            System.out.println(zahlbetrag);
        } else {
            if (geldbetrag > parkgebuehr) {
                wechselgeld = geldbetrag - parkgebuehr;
                System.out.println(wechselgeld);
                System.out.println("Parkgebühr bezahlt");
            }
        }
    }
}
