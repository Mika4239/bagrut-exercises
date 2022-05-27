package bagtut_ex.bagrut2021.Ex2;

public class ReportCard {

  private String stuName;
  private Subject[] subArray;

  public ReportCard(String name, int num) {
    this.stuName = name;
    this.subArray = new Subject[num];
  }

  public void setStuName(String name) {
    this.stuName = name;
  }

  public String getStuName() {
    return this.stuName;
  }

  public void setSubArray(Subject[] subArray) {
    this.subArray = new Subject[subArray.length];
    for (int i = 0; i < this.subArray.length; i++) {
      this.subArray[i] =
        new Subject(subArray[i].getSubName(), subArray[i].getGrade());
    }
  }

  public Subject[] getSubArray() {
    return this.subArray;
  }

  public double average() {
    double avg = 0;
    for (int i = 0; i < this.subArray.length; i++) {
      avg += this.subArray[i].getGrade();
    }

    avg /= this.subArray.length;
    return avg;
  }

  public boolean isExcellent() {
    boolean hundred = false, failed = false, avg;
    for (int i = 0; i < this.subArray.length; i++) {
      if (this.subArray[i].getGrade() < 55) {
        failed = true;
      }
      if (this.subArray[i].getGrade() == 100) {
        hundred = true;
      }
    }
    avg = average() >= 85;
    return avg && hundred && !failed;
  }
}
