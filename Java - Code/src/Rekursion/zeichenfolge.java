package Rekursion;
import java.util.Scanner;

public class zeichenfolge
{
    public static Scanner inp = new Scanner(System.in);

    public static void rekInput(){
        System.out.print("test");
        String c = inp.next();
        if (c.charAt(0) != '!') {
            rekInput();
            System.out.print(c);
        }
    }

    public static void main(String[] args) {

        rekInput();
    }
}
