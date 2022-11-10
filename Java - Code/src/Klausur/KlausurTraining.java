package Klausur;

public class KlausurTraining {
    public static void main(String[] args) {
        System.out.println(fib(500));
        //int[][] feldMehr = new int[4][3];
    }

    public static int fib(int n) {
        if(n==1 || n==2) {
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
}
