package bagtut_ex.bagrut2017.Ex6;

import bagtut_ex.BinNode;
import bagtut_ex.Functions;
import bagtut_ex.Node;
import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter a tree: ");
    BinNode<Integer> tr1 = Functions.createTree();
    System.out.println("\nEnter a tree: ");
    BinNode<Integer> tr2 = Functions.createTree();
    Functions.printList(check(tr1, tr2));
  }

  public static boolean exist(BinNode<Integer> tr, int x) {
    if (tr == null) {
      return false;
    }
    if (tr.getValue() == x) {
      return true;
    }
    return exist(tr.getLeft(), x) || exist(tr.getRight(), x);
  }

  public static Node<Integer> check(BinNode<Integer> t1, BinNode<Integer> t2) {
    Node<Integer> first = new Node<Integer>(-1);
    // first = check(t1, t2, first);
    return first.getNext();
  }
  // TODO: finish it
  //   private static Node<Integer> check(
  //     BinNode<Integer> t1,
  //     BinNode<Integer> t2,
  //     Node<Integer> list
  //   ) {}
}
