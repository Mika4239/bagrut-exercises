package bagtut_ex.bagrut2020.Ex2;

public class AllWeights {

  private Weight[] arr;

  public AllWeights(int max) {
    this.arr = new Weight[max];
  }

  public AllWeights(Weight[] weights) {
    this.arr = new Weight[weights.length];
    for (int i = 0; i < this.arr.length; i++) {
      this.arr[i] = new Weight(weights[i].getKilo(), weights[i].getGram());
    }
  }

  public void setArr(Weight[] weights) {
    this.arr = new Weight[weights.length];
    for (int i = 0; i < this.arr.length; i++) {
      this.arr[i] = new Weight(weights[i].getKilo(), weights[i].getGram());
    }
  }

  public Weight[] getArr() {
    return this.arr;
  }

  public Weight sum() {
    int sum = 0;
    for (int i = 0; i < this.arr.length; i++) {
      sum += this.arr[i].getKilo() * 1000 + this.arr[i].getGram();
    }
    return new Weight(sum / 1000, sum % 1000);
  }
}
