package Rekursion;

public class potenz {
    public static void main(String[] args) {
        System.out.println(potenz(2, 3));
    }

    public static int potenz(int a, int n) {
        if(n == 0) {
            return 0;
        }
        if(n > 1) {
            return a * potenz(a, n - 1);
        } else {
            return a;
        }
    }
}
