package bagtut_ex.bagrut2016.Ex6;

import bagtut_ex.BinNode;
import bagtut_ex.Functions;

public class Main {

  public static void main(String[] args) {
    BinNode<Integer> tree;
    tree = Functions.createTree();
    System.out.println(upPath(tree));
  }

  public static boolean upPath(BinNode<Integer> tr) {
    boolean b1 = false, b2 = false;
    if (tr == null || !tr.hasLeft() && !tr.hasRight()) {
      return true;
    }
    if (tr.hasLeft() && tr.getValue() < tr.getLeft().getValue()) {
      b1 = upPath(tr.getLeft());
    }
    if (tr.hasRight() && tr.getValue() < tr.getRight().getValue()) {
      b2 = upPath(tr.getRight());
    }

    return b1 || b2;
  }
}
