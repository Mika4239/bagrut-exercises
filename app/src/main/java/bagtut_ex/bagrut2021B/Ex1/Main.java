package bagtut_ex.bagrut2021B.Ex1;

import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    String str = reader.next();
    System.out.println("\ndouble string: " + isDouble(str));
  }

  public static boolean isDouble(String str) {
    String str1 = str.substring(0, str.length() / 2);
    String str2 = str.substring(str.length() / 2);
    return str1.equals(str2);
  }
}
