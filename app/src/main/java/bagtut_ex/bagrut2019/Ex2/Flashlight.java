package bagtut_ex.bagrut2019.Ex2;

public class Flashlight {

  private String model;
  private double price;

  public Flashlight(String model, double price) {
    this.model = model;
    this.price = price;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getModel() {
    return this.model;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }
}
