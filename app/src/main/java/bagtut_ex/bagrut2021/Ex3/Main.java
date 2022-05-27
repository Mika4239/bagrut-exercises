package bagtut_ex.bagrut2021.Ex3;

import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    MyString ms = new MyString(), special;
    int len;
    System.out.println("Enter the length of the string: ");
    len = reader.nextInt();
    for (int i = 0; i < len; i++) {
      System.out.println("Enter the char at index " + i + ": ");
      ms.appendChar(reader.next().charAt(0));
    }

    special = special(ms);
    System.out.print("\nThe special string is: ");
    special.printStr();
  }

  public static MyString special(MyString ms) {
    String str = "";
    char chr;
    while (!ms.isEmpty()) {
      chr = ms.firstChar();
      for (int i = 0; i < ms.countChar(chr); i++) {
        str += chr;
      }
      ms.removeChar(chr);
    }
    for (int i = 0; i < str.length(); i++) {
      ms.appendChar(str.charAt(i));
    }
    return ms;
  }
}
