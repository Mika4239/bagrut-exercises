package Matcunet.Chapter3.Ex1;

public class ShowProgram extends TvProgram {

  protected int numBroadcasts;
  protected int minAge;

  public ShowProgram(
    String programName,
    double rating,
    int numBroadcasts,
    int minAge
  ) {
    super(programName, rating);
    this.numBroadcasts = numBroadcasts;
    this.minAge = minAge;
  }

  public void setNumBroadcasts(int numBroadcasts) {
    this.numBroadcasts = numBroadcasts;
  }

  public int getNumBroadcasts() {
    return this.numBroadcasts;
  }

  public void setMinAge(int minAge) {
    this.minAge = minAge;
  }

  public int getMinAge() {
    return this.minAge;
  }

  public double calcBudget() {
    return 0.0;
  }
}
