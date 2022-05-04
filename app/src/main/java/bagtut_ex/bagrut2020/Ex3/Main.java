package bagtut_ex.bagrut2020.Ex3;

import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    Hostel hostel = new Hostel();

    System.out.println("Enter the number of rooms in the hostel: ");
    Room[] rooms = new Room[reader.nextInt()];
    for (int i = 0; i < rooms.length; i++) {
      System.out.println(
        "Enter the room's number, room's type and the number of nights reserved: "
      );
      rooms[i] = new Room(reader.nextInt(), reader.nextInt(), reader.nextInt());
    }

    hostel.setAllRooms(rooms);

    System.out.println(
      "Enter the room's type and the number of nights to reserve: "
    );
    int roomNum = hostel.orderRoom(reader.nextInt(), reader.nextInt());
    System.out.println("The room reserved is: " + roomNum);

    int[] income = hostel.floorIncome();
    for (int i = 0; i < income.length; i++) {
      System.out.println(
        "The income for floor " + (i + 1) + " is: " + income[i]
      );
    }
  }
}
