package bagtut_ex.bagrut2021.Ex5;

import bagtut_ex.Functions;
import bagtut_ex.Node;

public class Main {

  public static void main(String[] args) {
    Node<Integer> lst = Functions.createList();
    lst = move(lst, 2);
    Functions.printList(lst);
  }

  // O(n * m) - m is the size of the list
  public static Node<Integer> move(Node<Integer> lst, int n) {
    Node<Integer> tmp1, tmp2;
    for (int i = 0; i < n; i++) {
      tmp1 = null;
      tmp2 = lst;
      while (tmp2.hasNext()) {
        tmp1 = tmp2;
        tmp2 = tmp2.getNext();
      }
      lst = new Node<Integer>(tmp2.getValue(), lst);
      tmp1.setNext(null);
    }
    return lst;
  }
}
