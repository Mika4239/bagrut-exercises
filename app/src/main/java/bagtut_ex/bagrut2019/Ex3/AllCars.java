package bagtut_ex.bagrut2019.Ex3;

public class AllCars {

  private Car[] cars;
  private int num;

  public AllCars(int max) {
    this.cars = new Car[max];
    this.num = 0;
  }

  public boolean addCar(Car car) {
    if (this.num >= this.cars.length) {
      return false;
    }

    this.cars[this.num] =
      new Car(car.getLicenseNum(), car.getHadAccident(), car.getPrice());
    this.num++;

    return true;
  }

  public void print(int min, int max) {
    for (int i = 0; i < this.num; i++) {
      if (!this.cars[i].getHadAccident() && this.cars[i].range(min, max)) {
        System.err.println("license number: " + this.cars[i].getLicenseNum());
      }
    }
  }

  public void setCars(Car[] cars) {
    this.cars = new Car[cars.length];
    for (int i = 0; i < cars.length; i++) {
      this.cars[i] =
        new Car(
          cars[i].getLicenseNum(),
          cars[i].getHadAccident(),
          cars[i].getPrice()
        );
    }
    this.num = this.cars.length;
  }

  public Car[] getCars() {
    return this.cars;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public int getNum() {
    return this.num;
  }
}
