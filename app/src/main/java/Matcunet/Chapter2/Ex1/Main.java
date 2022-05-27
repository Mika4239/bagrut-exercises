package Matcunet.Chapter2.Ex1;

import bagtut_ex.Functions;
import bagtut_ex.Node;
import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    Node<Character> list = Functions.createCharList();
    System.out.println(isPalindrom(list));
  }

  public static Node<Character> reverse(Node<Character> list) {
    Node<Character> pos = list;
    Node<Character> reverseList = null;
    while (pos != null) {
      reverseList = new Node<Character>(pos.getValue(), reverseList);
      pos = pos.getNext();
    }
    return reverseList;
  }

  public static boolean isPalindrom(Node<Character> list) {
    Node<Character> pos = list;
    Node<Character> reverseList = reverse(pos);
    while (pos != null) {
      System.out.println(
        pos.getNext().getValue() + ", " + reverseList.getNext().getValue()
      );
      if (pos.getNext().getValue() != reverseList.getNext().getValue()) {
        return false;
      }
    }
    return true;
  }
}
