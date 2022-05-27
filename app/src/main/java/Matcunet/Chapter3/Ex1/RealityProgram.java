package Matcunet.Chapter3.Ex1;

public class RealityProgram extends ShowProgram {

  private String type;

  public RealityProgram(
    String programName,
    double rating,
    int numBroadcasts,
    int minAge,
    String type
  ) {
    super(programName, rating, numBroadcasts, minAge);
    this.type = type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }

  public double calcBudget() {
    return 0.0;
  }
}
