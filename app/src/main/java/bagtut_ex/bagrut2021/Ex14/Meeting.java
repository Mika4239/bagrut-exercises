package bagtut_ex.bagrut2021.Ex14;

public class Meeting extends Event {

  private String[] arrNames;
  private int duration;
  private String location;

  public Meeting(
    Date date,
    int hour,
    String[] arrNames,
    int duration,
    String location
  ) {
    super(date, hour);
    this.arrNames = new String[arrNames.length];
    for (int i = 0; i < this.arrNames.length; i++) {
      this.arrNames[i] = arrNames[i];
    }
    this.duration = duration;
    this.location = location;
  }

  public void setArrNames(String[] arrNames) {
    this.arrNames = new String[arrNames.length];
    for (int i = 0; i < this.arrNames.length; i++) {
      this.arrNames[i] = arrNames[i];
    }
  }

  public String[] getArrNames() {
    return this.arrNames;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public int getDuration() {
    return this.duration;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getLocation() {
    return this.location;
  }

  public boolean match(String name) {
    for (int i = 0; i < this.arrNames.length; i++) {
      if (this.arrNames[i].equals(name)) {
        return true;
      }
    }
    return false;
  }
}
