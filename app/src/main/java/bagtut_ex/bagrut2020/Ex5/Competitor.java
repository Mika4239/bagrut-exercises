package bagtut_ex.bagrut2020.Ex5;

public class Competitor {

  private int minutes;
  private int seconds;
  private String name;

  public Competitor(String name, int minutes, int seconds) {
    this.name = name;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setMinutes(int minutes) {
    this.minutes = minutes;
  }

  public int getMinutes() {
    return this.minutes;
  }

  public void setSeconds(int seconds) {
    this.seconds = seconds;
  }

  public int getSeconds() {
    return this.seconds;
  }

  public int getTime() {
    return this.minutes * 60 + this.seconds;
  }
}
