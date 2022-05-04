package bagtut_ex.bagrut2020.Ex1;

import bagtut_ex.Functions;
import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    int[] arr = Functions.createArray();
    System.out.println("Enter a number to check: ");
    int num = reader.nextInt();
    System.out.println("\nThe index is: " + above(arr, num));
  }

  public static int above(int[] arr, int num) {
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum > num) {
        return i;
      }
    }

    return -1;
  }
}
