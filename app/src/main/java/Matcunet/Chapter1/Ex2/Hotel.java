package Matcunet.Chapter1.Ex2;

public class Hotel {

  private String name;
  private String city;
  private int rating;

  public Hotel(String name, String city, int rating) {
    this.name = name;
    this.city = city;
    this.rating = rating;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCity() {
    return this.city;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public int getRating() {
    return this.rating;
  }
}
