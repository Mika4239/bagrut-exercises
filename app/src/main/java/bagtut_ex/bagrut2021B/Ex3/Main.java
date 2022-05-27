package bagtut_ex.bagrut2021B.Ex3;

import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {}

  public static boolean isCorner(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      if (matrix.length != matrix[i].length) {
        return false;
      }
      for (int j = 0; j < matrix[i].length; j++) {
        if (j >= i) {
          if (matrix[i][j] != i + 1) {
            return false;
          }
        }
      }
    }
    return true;
  }
}
