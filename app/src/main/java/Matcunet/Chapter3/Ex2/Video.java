package Matcunet.Chapter3.Ex2;

public class Video extends Media {

  private int position;

  public Video(String cassette, String mediaType, int len, int position) {
    super(cassette, mediaType, len);
    this.position = position;
  }

  public void goForward() {
    this.position++;
  }

  public boolean finished() {
    if (this.position > this.len) {
      return true;
    }
    return false;
  }

  public String toString() {
    return "video" + super.toString();
  }
}
