package Matcunet.Chapter2.Ex4;

import bagtut_ex.BinNode;
import bagtut_ex.Functions;
import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    BinNode<String> tr = Functions.createStringTree();
    System.out.println("the tree is zig zag tree: " + isZigZag(tr));
  }

  public static boolean isZigZag(BinNode<String> t) {
    if (t == null) {
      return true;
    }
    if ((t.hasLeft() && !t.hasRight()) || (t.hasRight() && !t.hasLeft())) {
      return false;
    }
    if (!t.getValue().equals("zag") && !t.getValue().equals("zig")) {
      return false;
    }
    if (t.hasLeft() && t.hasRight()) {
      if (t.getValue().equals("zag")) {
        if (
          !t.getLeft().getValue().equals("zig") ||
          !t.getLeft().getValue().equals("zig")
        ) {
          return false;
        }
      } else if (t.getValue().equals("zig")) {
        if (
          !t.getLeft().getValue().equals("zag") ||
          !t.getLeft().getValue().equals("zag")
        ) {
          return false;
        }
      }
    }

    return isZigZag(t.getLeft()) && isZigZag(t.getRight());
  }
}
