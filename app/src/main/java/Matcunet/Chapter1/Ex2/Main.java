package Matcunet.Chapter1.Ex2;

import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    Hotel[] hotels;
    String name, city;
    int rating;
    System.out.println("Enter the number of hotels: ");
    hotels = new Hotel[reader.nextInt()];
    for (int i = 0; i < hotels.length; i++) {
      System.out.println("Enter the hotel in place " + i + ": ");
      System.out.println("Enter the hotel's name: ");
      name = reader.next();
      System.out.println("Enter the hotel's city: ");
      city = reader.next();
      System.out.println("Enter the hotel's rating: ");
      rating = reader.nextInt();
      hotels[i] = new Hotel(name, city, rating);
    }

    int max = printAndMaxRating(hotels);
    System.out.println("The maximum number of hotels is in rating " + max);

    System.out.println("Enter the name of the hotel to update: ");
    String hotelName = reader.next();
    System.out.println("Enter the new rating value: ");
    int newRating = reader.nextInt();
    System.out.println("before: ");
    printRating(hotels, hotelName);
    updateRating(hotels, hotelName, newRating);
    System.out.println("after: ");
    printRating(hotels, hotelName);
  }

  public static int printAndMaxRating(Hotel[] hotels) {
    int[] ratings = new int[6];
    for (int i = 0; i < hotels.length; i++) {
      ratings[hotels[i].getRating()] += 1;
    }

    int max = 0, maxRating = 2;
    for (int i = 2; i < ratings.length; i++) {
      System.out.println(
        "The number of hotels in rating " + i + " is: " + ratings[i]
      );

      if (ratings[i] > max) {
        max = ratings[i];
        maxRating = i;
      }
    }
    return maxRating;
  }

  public static void updateRating(Hotel[] hotels, String name, int rating) {
    for (int i = 0; i < hotels.length; i++) {
      if (hotels[i].getName().equals(name)) {
        hotels[i].setRating(rating);
      }
    }
  }

  public static void printRating(Hotel[] hotels, String name) {
    for (int i = 0; i < hotels.length; i++) {
      if (hotels[i].getName().equals(name)) {
        System.out.println(
          "The rating for hotel " + name + " is: " + hotels[i].getRating()
        );
      }
    }
  }
}
