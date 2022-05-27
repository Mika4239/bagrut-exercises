package bagtut_ex.bagrut2021.Ex1;

import bagtut_ex.Functions;
import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    int[] arr = Functions.createArray();
    System.out.println("Enter the number: ");
    int[] newArr = filter(arr, reader.nextInt());
    System.out.println();
    Functions.printArray(newArr);
  }

  public static int[] filter(int[] arr, int num) {
    int count = 0, place = 0;
    int[] newArr;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != num) {
        count++;
      }
    }

    newArr = new int[count];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != num) {
        newArr[place] = arr[i];
        place++;
      }
    }

    return newArr;
  }
}
