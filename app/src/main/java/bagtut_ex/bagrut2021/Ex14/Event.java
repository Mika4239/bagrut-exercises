package bagtut_ex.bagrut2021.Ex14;

public class Event {

  private Date date;
  private int hour;

  public Event(Date date, int hour) {
    this.date = new Date(date.getDay(), date.getMonth(), date.getYear());
    this.hour = hour;
  }

  public void setDate(Date date) {
    this.date = new Date(date.getDay(), date.getMonth(), date.getYear());
  }

  public Date getDate() {
    return this.date;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public int getHour() {
    return this.hour;
  }

  public boolean match(String name) {
    return false;
  }
}
