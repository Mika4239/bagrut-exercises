package bagtut_ex.bagrut2019.Ex6;

import bagtut_ex.BinNode;
import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    BinNode<Range> t = createTree();
    System.out.println("\nThe tree is in order: " + order(t));
  }

  public static boolean order(BinNode<Range> t) {
    if (t == null) {
      return true;
    }
    if (t.hasLeft() && t.hasRight()) {
      if (t.getLeft().getValue().getHigh() > t.getRight().getValue().getLow()) {
        return false;
      }
    }
    if (t.hasLeft()) {
      if (
        t.getValue().getLow() != t.getLeft().getValue().getLow() ||
        t.getValue().getHigh() < t.getLeft().getValue().getHigh()
      ) {
        return false;
      }
    }

    if (t.hasRight()) {
      if (
        t.getValue().getLow() > t.getRight().getValue().getLow() &&
        t.getValue().getHigh() != t.getRight().getValue().getHigh()
      ) {
        return false;
      }
    }

    return order(t.getLeft()) && order(t.getRight());
  }

  public static BinNode<Range> createNode() {
    System.out.println("enter value (-1) to end: ");
    return createTree();
  }

  public static BinNode<Range> createTree() {
    Range value;
    value = new Range(reader.nextInt(), reader.nextInt());
    if (value.getLow() == -1) {
      return null;
    }
    System.out.println(
      "enter left of (" +
      value.getLow() +
      ", " +
      value.getHigh() +
      ") (-1 to end)"
    );
    BinNode<Range> left = createNode();
    System.out.println(
      "enter right of (" +
      value.getLow() +
      ", " +
      value.getHigh() +
      ") (-1 to end)"
    );
    BinNode<Range> right = createNode();
    return new BinNode<Range>(value, left, right);
  }
}
