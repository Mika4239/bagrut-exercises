package bagtut_ex.bagrut2019.Ex3;

public class Car {

  private String licenseNum;
  private boolean hadAccident;
  private int price;

  public Car(String licenseNum, boolean hadAccident, int price) {
    this.licenseNum = licenseNum;
    this.hadAccident = hadAccident;
    this.price = price;
  }

  public void setLicenseNum(String licenseNum) {
    this.licenseNum = licenseNum;
  }

  public String getLicenseNum() {
    return this.licenseNum;
  }

  public void setHadAccident(boolean hadAccident) {
    this.hadAccident = hadAccident;
  }

  public boolean getHadAccident() {
    return this.hadAccident;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return this.price;
  }

  public boolean range(int min, int max) {
    if (this.price >= min && this.price <= max) {
      return true;
    }

    return false;
  }
}
