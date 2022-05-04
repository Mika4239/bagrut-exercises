package Matcunet.Chapter1.Ex3;

public class Symptom {

  private String name;
  private int time;

  public Symptom(String name) {
    this.name = name;
    this.time = 0;
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
}
