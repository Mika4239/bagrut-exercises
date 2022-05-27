package Matcunet.Chapter3.Ex2;

public class Media implements IPlay {

  private String cassette;
  private String mediaType;
  protected int len;

  public Media(String cassette, String mediaType, int len) {
    this.cassette = cassette;
    this.mediaType = mediaType;
    this.len = len;
  }

  public void setCassette(String cassette) {
    this.cassette = cassette;
  }

  public String getCassette() {
    return this.cassette;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public String getMediaType() {
    return this.mediaType;
  }

  public void setLen(int len) {
    this.len = len;
  }

  public int getLen() {
    return this.len;
  }

  @Override
  public void Play() {
    // TODO Auto-generated method stub

  }

  @Override
  public void goForward() {
    // TODO Auto-generated method stub

  }
}
