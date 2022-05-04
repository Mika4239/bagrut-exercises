package bagtut_ex.bagrut2020.Ex2;

public class Weight {

  private int kilo;
  private int gram;

  public Weight() {
    this.kilo = 0;
    this.gram = 0;
  }

  public Weight(int kilo, int gram) {
    this.kilo = kilo;
    this.gram = gram;
  }

  public Weight(int totalGram) {
    this.kilo = totalGram / 1000;
    this.gram = totalGram % 1000;
  }

  public void setKilo(int kilo) {
    this.kilo = kilo;
  }

  public void setGram(int gram) {
    this.gram = gram;
  }

  public int getKilo() {
    return this.kilo;
  }

  public int getGram() {
    return this.gram;
  }

  public void add(Weight other) {
    this.kilo += other.getKilo();
    this.gram += other.getGram();
  }

  public boolean less(Weight other) {
    int thisWeight = this.kilo * 1000 + this.gram;
    int otherWeight = other.getKilo() * 1000 + other.getGram();
    if (thisWeight < otherWeight) {
      return true;
    }
    return false;
  }
}
