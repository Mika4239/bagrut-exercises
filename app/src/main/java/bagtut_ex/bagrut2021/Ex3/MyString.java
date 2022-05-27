package bagtut_ex.bagrut2021.Ex3;

public class MyString {

  private String str;

  public MyString() {
    this.str = "";
  }

  public int countChar(char chr) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == chr) {
        count++;
      }
    }
    return count;
  }

  public void removeChar(char chr) {
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != chr) {
        newStr += str.charAt(i);
      }
    }
    this.str = newStr;
  }

  public void appendChar(char chr) {
    this.str += chr;
  }

  public char firstChar() {
    return this.str.charAt(0);
  }

  public boolean isEmpty() {
    return this.str.equals("");
  }

  // only for checking
  public void printStr() {
    System.out.println(this.str);
  }
}
