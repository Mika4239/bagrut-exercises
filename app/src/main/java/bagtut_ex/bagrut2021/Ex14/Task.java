package bagtut_ex.bagrut2021.Ex14;

public class Task extends Event {

  private String title;

  public Task(Date date, int hour, String title) {
    super(date, hour);
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return this.title;
  }
}
