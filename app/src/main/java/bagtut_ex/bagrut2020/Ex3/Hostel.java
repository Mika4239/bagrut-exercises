package bagtut_ex.bagrut2020.Ex3;

public class Hostel {

  private Room[] allRooms;

  public Hostel() {
    this.allRooms = new Room[200];
  }

  public Hostel(Room[] rooms) {
    this.allRooms = new Room[rooms.length];
    for (int i = 0; i < this.allRooms.length; i++) {
      this.allRooms[i] =
        new Room(
          rooms[i].getRoomNum(),
          rooms[i].getRoomType(),
          rooms[i].getNightsReserved()
        );
    }
  }

  public void setAllRooms(Room[] rooms) {
    this.allRooms = new Room[rooms.length];
    for (int i = 0; i < this.allRooms.length; i++) {
      this.allRooms[i] =
        new Room(
          rooms[i].getRoomNum(),
          rooms[i].getRoomType(),
          rooms[i].getNightsReserved()
        );
    }
  }

  public Room[] getAllRooms() {
    return this.allRooms;
  }

  public int orderRoom(int type, int nights) {
    for (int i = 0; i < this.allRooms.length; i++) {
      if (
        this.allRooms[i].getNightsReserved() == 0 &&
        this.allRooms[i].getRoomType() == type
      ) {
        this.allRooms[i].setNightsReserved(nights);
        return this.allRooms[i].getRoomNum();
      }
    }

    return -1;
  }

  public int[] floorIncome() {
    int[] floors = new int[3];
    for (int i = 0; i < this.allRooms.length; i++) {
      floors[this.allRooms[i].getRoomNum() / 100 - 1] +=
        this.allRooms[i].income();
    }
    return floors;
  }
}
