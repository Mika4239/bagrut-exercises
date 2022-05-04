package Matcunet.Chapter1.Ex3;

import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    CovidVariant variant = new CovidVariant("variant11", 2021);
    // symptom1 - name: cough, time: 30 days
    // symptom2 - name: fever, time: 5 days
    // symptom1 - name: tiredness, time: 21 days
    variant.inputSymptoms();
    printSymptoms(variant);
  }

  public static void printSymptoms(CovidVariant variant) {
    for (int i = 0; i < variant.getArrS().length; i++) {
      if (variant.getArrS()[i] != null) {
        System.out.println(
          "name: " +
          variant.getArrS()[i].getName() +
          " ,time: " +
          variant.getArrS()[i].getTime()
        );
      }
    }
  }
}
