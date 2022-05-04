package Matcunet.Chapter1.Ex1;

import bagtut_ex.Functions;
import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    int[] arr = Functions.createArray();
    System.out.println("The array is a square array: " + isSquareArr(arr));
  }

  public static boolean isSquareArr(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      if (arr[i] * arr[i] != arr[i + arr.length / 2]) {
        return false;
      }
    }
    return true;
  }
}
