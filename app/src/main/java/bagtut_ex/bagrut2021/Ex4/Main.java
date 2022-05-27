package bagtut_ex.bagrut2021.Ex4;

import bagtut_ex.Functions;
import bagtut_ex.Node;
import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    Node<Integer> lst = Functions.createList();
    BiList biList = generateBiList(lst);
    biList.printBiList();
  }

  public static BiList generateBiList(Node<Integer> lst) {
    BiList biList = new BiList();
    int max;
    for (int i = 0; i < length(lst) / 2; i++) {
      max = max(lst);
      biList.addNum(max, 1);
      Functions.delete(lst, max);
    }
    for (int i = 0; i < length(lst) / 2; i++) {
      biList.addNum(lst.getValue(), 1);
      Functions.delete(lst, lst.getValue());
    }

    return biList;
  }

  public static int max(Node<Integer> lst) {
    Node<Integer> tmp = lst;
    int max = tmp.getValue();
    while (tmp != null) {
      if (tmp.getValue() > max) {
        max = tmp.getValue();
      }
      tmp = tmp.getNext();
    }
    return max;
  }

  public static int length(Node<Integer> lst) {
    Node<Integer> tmp = lst;
    int len = 0;
    while (tmp != null) {
      len++;
      tmp = tmp.getNext();
    }
    return len;
  }
}
