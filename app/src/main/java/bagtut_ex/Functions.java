package bagtut_ex;

import java.util.Scanner;

public class Functions {

  public static Scanner reader = new Scanner(System.in);

  public static BinNode<Integer> createNode() {
    System.out.println("enter value (-1) to end: ");
    return createTree();
  }

  public static BinNode<Integer> createTree() {
    int value;
    value = reader.nextInt();
    if (value == -1) {
      return null;
    }
    System.out.println("enter left of " + value + " (-1 to end)");
    BinNode<Integer> left = createNode();
    System.out.println("enter right of " + value + " (-1 to end)");
    BinNode<Integer> right = createNode();
    return new BinNode<Integer>(value, left, right);
  }

  public static Node<Integer> createList() {
    int num;
    System.out.println("Enter a number (-999 to end): ");
    num = reader.nextInt();
    Node<Integer> list = new Node<Integer>(num);
    while (num != -999) {
      System.out.println("Enter a number (-999 to end): ");
      num = reader.nextInt();
      addToEnd(list, num);
    }

    return list;
  }

  public static void addToEnd(Node<Integer> head, int num) {
    Node<Integer> tmp = head;
    while (tmp.hasNext()) {
      tmp = tmp.getNext();
    }
    tmp.setValue(num);
    tmp.setNext(head);
  }

  public static Stack<Integer> createStack() {
    Stack<Integer> s = new Stack<>();
    System.out.println("Enter a number (-999 to end): ");
    int num;
    num = reader.nextInt();
    while (num != -999) {
      s.push(num);
      System.out.println("Enter a number (-999 to end): ");
      num = reader.nextInt();
    }

    return s;
  }

  public static int[] createArray() {
    System.out.println("Enter the array length: ");
    int[] arr = new int[reader.nextInt()];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter a value for place " + i + ": ");
      arr[i] = reader.nextInt();
    }
    return arr;
  }

  public static void printList(Node<Integer> list) {
    Node<Integer> tmp = list;
    while (tmp != null) {
      System.out.println(tmp.getValue());
      tmp = tmp.getNext();
    }
  }
}
