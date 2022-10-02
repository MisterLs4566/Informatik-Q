package Rekursion;
import java.lang.Math;

public class pascalschesDreieck {

    public static int fac(int n) {
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }

        return sum;
    }

    public static int bRek(int n, int k) {
        if(k == 0 || k == n) {
            return 1;
        }
        else {
            return bRek(n-1, k-1) + bRek(n-1, k);
        }
    }

    public static int bIter(int n, int k) {
        return fac(n)/(fac(k) * fac(n-k));
    }

    public static void main(String[] args) {
        int erg1 = bRek(7, 4);
        int erg2 = bIter(7, 4);
        System.out.println(erg1);
        System.out.println(erg2);
    }

}
