package Matcunet.Chapter3.Ex1;

public class News extends TvProgram implements ILive {

  private String name;
  private int time;

  public News(String programName, double rating, String name, int time) {
    super(programName, rating);
    this.name = name;
    this.time = time;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setTime(int time) {
    this.time = time;
  }

  public int getTime() {
    return this.time;
  }

  public double calcBudjet() {
    return 0.0;
  }

  @Override
  public void goLive() {
    // TODO Auto-generated method stub

  }
}
