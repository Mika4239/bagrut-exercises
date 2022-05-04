package bagtut_ex.bagrut2019.Ex6;

public class Range {

  private int low;
  private int high;

  public Range(int low, int high) {
    this.low = low;
    this.high = high;
  }

  public void setLow(int low) {
    this.low = low;
  }

  public int getLow() {
    return this.low;
  }

  public void setHigh(int high) {
    this.high = high;
  }

  public int getHigh() {
    return this.high;
  }
}
