package bagtut_ex.bagrut2018.Ex3;

import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    Airport airport;
    Flight[] flights;

    System.out.println("Enter the number of flights: ");
    flights = new Flight[reader.nextInt()];
    for (int i = 0; i < flights.length; i++) {
      System.out.println("Enter the name of the flight: ");
      String name = reader.next();
      System.out.println("Enter the destination of the flight: ");
      String destination = reader.next();
      System.out.println("Enter the code of the flight: ");
      String flightCode = reader.next();
      System.out.println("Enter the hour and minute of the flight: ");
      Time flightTime = new Time(reader.nextInt(), reader.nextInt());
      flights[i] = new Flight(name, destination, flightCode, flightTime);
    }

    airport = new Airport(flights);

    System.out.println(
      "\nThere is a flight of sky company in this airport: " + airport.isFly()
    );
  }
}
