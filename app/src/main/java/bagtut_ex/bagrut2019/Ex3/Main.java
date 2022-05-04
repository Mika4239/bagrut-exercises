package bagtut_ex.bagrut2019.Ex3;

import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter the maximum number for cars: ");
    AllCars allCars = new AllCars(reader.nextInt());
    System.err.println("Enter the number of cars to add: ");
    int len = reader.nextInt();
    for (int i = 0; i < len; i++) {
      System.out.println("Enter a license number: ");
      String licenseNum = reader.next();
      System.out.println("Enter if the car had accident: ");
      boolean hadAccident = reader.nextBoolean();
      System.out.println("Enter the price of the car: ");
      int price = reader.nextInt();
      Car car = new Car(licenseNum, hadAccident, price);
      allCars.addCar(car);
    }

    System.out.println("Enter minumum and maixmum price: ");
    allCars.print(reader.nextInt(), reader.nextInt());
  }
}
