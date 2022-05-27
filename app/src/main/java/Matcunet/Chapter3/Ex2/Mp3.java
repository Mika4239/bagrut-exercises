package Matcunet.Chapter3.Ex2;

public class Mp3 extends Song {

  public Mp3(String cassette, String mediaType, int len, String artist) {
    super(cassette, mediaType, len, artist);
  }

  public void shrink() {
    this.len--;
  }
}
