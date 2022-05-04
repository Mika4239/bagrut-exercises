package bagtut_ex.bagrut2019.Ex2;

import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    Flashlight[] flashlights;
    double total;

    System.out.println("Enter the length of the array: ");
    flashlights = new Flashlight[reader.nextInt()];
    for (int i = 0; i < flashlights.length; i++) {
      System.out.println(
        "Enter the model and the price of flashlight " + i + ": "
      );
      flashlights[i] = new Flashlight(reader.next(), reader.nextDouble());
    }

    System.out.println("Enter the total price: ");
    total = reader.nextDouble();

    threeFlashlights(flashlights, total);
  }

  // TODO: bet (2) in notebook
  public static void threeFlashlights(Flashlight[] flashlights, double total) {
    boolean found = false;
    for (int i = 0; i < flashlights.length; i++) {
      for (int j = 0; j < flashlights.length; j++) {
        for (int k = 0; k < flashlights.length; k++) {
          if (i != j && i != k && k != j) {
            if (
              !found &&
              flashlights[i].getPrice() +
              flashlights[k].getPrice() +
              flashlights[j].getPrice() ==
              total
            ) {
              System.out.println("model 1: " + flashlights[i].getModel());
              System.out.println("model 2: " + flashlights[j].getModel());
              System.out.println("model 3: " + flashlights[k].getModel());
              found = true;
            }
          }
        }
      }
    }
  }
}
