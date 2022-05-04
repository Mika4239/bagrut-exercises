package bagtut_ex.bagrut2018.Ex6;

import bagtut_ex.BinNode;
import bagtut_ex.Functions;
import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter tree 1: ");
    BinNode<Integer> t1 = Functions.createTree();
    System.out.println("Enter tree 2: ");
    BinNode<Integer> t2 = Functions.createTree();
    System.out.println(
      "\ntree 1 is less than tree 2: " + treeLessThanTree(t1, t2)
    );
  }

  // TODO: gimel in notebook
  public static boolean treeLessThanTree(
    BinNode<Integer> t1,
    BinNode<Integer> t2
  ) {
    if (t1 == null) {
      return true;
    }
    if (!lessThanTree(t2, t1.getValue())) {
      return false;
    }
    return (
      treeLessThanTree(t1.getLeft(), t2) && treeLessThanTree(t1.getRight(), t2)
    );
  }

  public static boolean lessThanTree(BinNode<Integer> t, int x) {
    if (t == null) {
      return true;
    }
    if (t.getValue() < x) {
      return false;
    }
    return lessThanTree(t.getLeft(), x) && lessThanTree(t.getRight(), x);
  }
}
