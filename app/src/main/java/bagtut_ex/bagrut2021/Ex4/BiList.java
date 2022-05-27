package bagtut_ex.bagrut2021.Ex4;

import bagtut_ex.Functions;
import bagtut_ex.Node;

public class BiList {

  private Node<Integer> lst1;
  private Node<Integer> lst2;

  public BiList() {
    lst1 = null;
    lst1 = null;
  }

  public void addNum(int num, int codeList) {
    if (codeList == 1) {
      Functions.addToEnd(lst1, num);
    }
    if (codeList == 2) {
      Functions.addToEnd(lst2, num);
    }
  }

  public void printBiList() {
    Functions.printList(this.lst1);
    System.out.println();
    Functions.printList(this.lst2);
  }
}
