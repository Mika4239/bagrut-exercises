package bagtut_ex.bagrut2020.Ex3;

public class Room {

  private int roomNum;
  private int roomType;
  private int nightsReserved;

  public Room(int roomNum, int roomType, int nightsReserved) {
    this.roomNum = roomNum;
    this.roomType = roomType;
    this.nightsReserved = nightsReserved;
  }

  public void setRoomNum(int roomNum) {
    this.roomNum = roomNum;
  }

  public int getRoomNum() {
    return this.roomNum;
  }

  public void setRoomType(int roomType) {
    this.roomType = roomType;
  }

  public int getRoomType() {
    return this.roomType;
  }

  public void setNightsReserved(int nightsReserved) {
    this.nightsReserved = nightsReserved;
  }

  public int getNightsReserved() {
    return this.nightsReserved;
  }

  public int income() {
    return this.nightsReserved * this.roomType * 50;
  }
}
