package GUI;

import java.io.*;

public class Input {

  private static BufferedReader Eingabe;

  static {
    try {
      Eingabe = new BufferedReader(new InputStreamReader(System.in));
    }
    catch (Exception e) {
      System.out.println("Konsoleneingabe nicht m�glich.");
    }
  }

  public static long readLong () {
    return Long.parseLong(readln());
  }

  public static double readDouble() {
    return Double.parseDouble(readln());
  }

  public static float readFloat() {
    return Float.parseFloat(readln());
  }

  public static int readInt() {
    return Integer.parseInt(readln());
  }

  public static char readChar() {
    return readln().charAt(0);
  }

  public static boolean readBoolean() {
    final String[] trueValues =
          { "1", "y", "t", "j", "w", "yes", "true", "ja", "wahr", "ok" };
    String input = readln().toLowerCase();
    for (int i = 0; i < trueValues.length; ++i)
      if (trueValues[i].equals(input))
        return true;
    return false;
  }

  public static String readString() {
    return readln();
  }

  private static String readln () {
    try {
      return Eingabe.readLine();
    } catch(Exception e) {
      return "";
    }
  }
}
