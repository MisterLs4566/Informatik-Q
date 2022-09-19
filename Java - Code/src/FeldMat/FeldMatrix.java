package FeldMat;

public class FeldMatrix {

    public static int summe(int[][] m, int zeile) {
        int s = 0;
        for (int i = 0; i < m[zeile].length; i++) {
            s = s + m[zeile][i];
        }
        return s;
    }

    public static void ausgeben(int[][] m) {
        for (int y = 0; y < m.length; y++) {
            for (int x = 0; x < m[y].length; x++) {
                System.out.printf("%5d",m[y][x]);
            }
            System.out.println();
        }
    }

    public static void spaltensumme(int[][] matrix) {
        //Zeilen
        for (int i=0; i<matrix.length; i++) {
            int res = 0;
            //Spalten
            for (int j=0; j<matrix[i].length; j++) {
                res += matrix[i][j];
            }
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 4,10, 3,20 },
                {12, 1,18, 3 },
                { 3,13, 9,10 },
                {25, 9,12, 6 } };
        ausgeben(matrix);
        System.out.println();
        for (int i = 1; i <= matrix.length; i++) {
            System.out.println("Summe Zeile " + i + ": " + summe(matrix,i-1));
        }

        spaltensumme(matrix);
    }
}
