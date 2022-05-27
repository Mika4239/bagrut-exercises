package bagtut_ex.bagrut2021.Ex14;

public class PhoneCall extends Event {

  private String phoneNumber;
  private String name;

  public PhoneCall(Date date, int hour, String phoneNumber, String name) {
    super(date, hour);
    this.phoneNumber = phoneNumber;
    this.name = name;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean match(String name) {
    return this.name.equals(name);
  }
}
