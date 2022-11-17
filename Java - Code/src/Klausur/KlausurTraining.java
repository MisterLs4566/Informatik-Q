package Klausur;

public class KlausurTraining {
    public static void main(String[] args) {
        System.out.println(fib(3));
        //int[][] feldMehr = new int[4][3];
        System.out.println(fac(4));
    }

    public static int fib(int n) {
        if(n==0) {
            return 0;
        }
        else if(n==1 || n==2) {
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static int fac(int n) {
        if(n==1) {
            return 1;
        }
        else return(n * fac(n-1));
    }
}
