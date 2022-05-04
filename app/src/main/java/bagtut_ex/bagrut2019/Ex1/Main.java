package bagtut_ex.bagrut2019.Ex1;

import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    String[] arr;
    int num;

    System.out.println("Enter the length of the array: ");
    arr = new String[reader.nextInt()];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter the value of place " + i + ": ");
      arr[i] = reader.next();
    }

    System.out.println("\nEnter the number for the length of the strings: ");
    num = reader.nextInt();

    System.out.println(
      "The number of strings in this length are: " + exact(arr, num)
    );
  }

  public static int exact(String[] arr, int num) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].length() == num) {
        count++;
      }
    }
    return count;
  }
}
