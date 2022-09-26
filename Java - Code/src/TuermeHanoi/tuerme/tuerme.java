package TuermeHanoi.tuerme;
import java.util.Scanner;

public class tuerme {
    public static void lege(int n, char a, char b, char c) {
        if (n > 1) {
            lege(n-1, a, b, c);
            System.out.println(a + " => " + b);

            lege(n-1, c, b, a);
        } else {
            System.out.println(a + " => " + b);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib die Anzahl der Scheiben ein: ");

        n=sc.nextInt();

        System.out.println("Reihenfolge der Scheibenbewegungen:");

        lege(n, 'a', 'b', 'c');
    }
}
