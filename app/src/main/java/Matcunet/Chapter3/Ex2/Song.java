package Matcunet.Chapter3.Ex2;

public class Song extends Media {

  private String artist;

  public Song(String cassette, String mediaType, int len, String artist) {
    super(cassette, mediaType, len);
    this.artist = artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getArtist() {
    return this.artist;
  }
}
