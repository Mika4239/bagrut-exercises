package bagtut_ex.bagrut2021.Ex2;

public class Subject {

  private String subName;
  private int grade;

  public Subject(String subName, int grade) {
    this.subName = subName;
    this.grade = grade;
  }

  public void setSubName(String subName) {
    this.subName = subName;
  }

  public String getSubName() {
    return this.subName;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public int getGrade() {
    return this.grade;
  }
}
