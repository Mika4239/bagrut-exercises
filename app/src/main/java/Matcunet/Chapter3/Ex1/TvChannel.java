package Matcunet.Chapter3.Ex1;

public class TvChannel {

  private TvProgram[] programs;
  private int programNum;

  public TvChannel() {
    this.programs = new TvProgram[100];
    this.programNum = 0;
  }

  public void setPrograms(TvProgram[] programs) {
    this.programs = new TvProgram[programs.length];
    for (int i = 0; i < this.programs.length; i++) {
      this.programs[i] =
        new TvProgram(programs[i].getProgramName(), programs[i].getRating());
    }
    this.programNum = this.programs.length;
  }

  public TvProgram[] getPrograms() {
    return this.programs;
  }

  public void addProgram(TvProgram program) {
    this.programs[this.programNum] =
      new TvProgram(program.getProgramName(), program.getRating());
    this.programNum++;
  }

  public int countMinAge() {
    int count = 0;
    for (int i = 0; i < this.programNum; i++) {
      if (this.programs[i] instanceof ShowProgram) {
        if (((ShowProgram) this.programs[i]).getMinAge() < 12) {
          count++;
        }
      }
    }
    return count;
  }

  public TvProgram maxRating() {
    double max = 0;
    int maxProgram = 0;
    for (int i = 0; i < this.programNum; i++) {
      if (this.programs[i].getRating() > max) {
        max = this.programs[i].getRating();
        maxProgram = i;
      }
    }
    return this.programs[maxProgram];
  }

  public double totalBudjet() {
    double sum = 0;
    for (int i = 0; i < this.programNum; i++) {
      sum += this.programs[i].calcBudget();
    }
    return sum;
  }
}
