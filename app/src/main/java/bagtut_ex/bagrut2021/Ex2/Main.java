package bagtut_ex.bagrut2021.Ex2;

import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    ReportCard[] reportCards;
    String name;
    Subject[] subArray;
    System.out.println("Enter the number of report cards: ");
    reportCards = new ReportCard[reader.nextInt()];
    for (int i = 0; i < reportCards.length; i++) {
      System.out.println("\nEnter the student's name for report " + i + ": ");
      name = reader.next();
      System.out.println(
        "\nEnter the number of subjects for report " + i + ": "
      );
      subArray = new Subject[reader.nextInt()];
      for (int j = 0; j < subArray.length; j++) {
        System.out.println(
          "\nEnter the subject name and grade for subject " + j + ": "
        );
        subArray[j] = new Subject(reader.next(), reader.nextInt());
      }
      reportCards[i] = new ReportCard(name, subArray.length);
      reportCards[i].setSubArray(subArray);
    }

    printExcellent(reportCards);
  }

  public static void printExcellent(ReportCard[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].isExcellent()) {
        System.out.println("\nStudent name: " + array[i].getStuName());
      }
    }
  }
}
