package Matcunet.Chapter3.Ex1;

public class TvProgram {

  protected String programName;
  protected double rating;

  public TvProgram(String programName, double rating) {
    this.programName = programName;
    this.rating = rating;
  }

  public void setProgramName(String programName) {
    this.programName = programName;
  }

  public String getProgramName() {
    return this.programName;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public double getRating() {
    return this.rating;
  }

  public double calcBudget() {
    return 0.0;
  }
}
