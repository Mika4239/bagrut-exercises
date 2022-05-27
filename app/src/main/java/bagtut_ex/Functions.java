package bagtut_ex;

import java.util.Scanner;

public class Functions {

  public static Scanner reader = new Scanner(System.in);

  // tree functions
  private static BinNode<Integer> createNode() {
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

  private static BinNode<String> createStringNode() {
    System.out.println("enter value (-1) to end: ");
    return createStringTree();
  }

  public static BinNode<String> createStringTree() {
    String value;
    value = reader.next();
    if (value.equals("-1")) {
      return null;
    }
    System.out.println("enter left of " + value + " (-1 to end)");
    BinNode<String> left = createStringNode();
    System.out.println("enter right of " + value + " (-1 to end)");
    BinNode<String> right = createStringNode();
    return new BinNode<String>(value, left, right);
  }

  // linked list functions
  public static Node<Integer> createList() {
    int num;
    Node<Integer> last;
    System.out.println("Enter a number (-999 to end): ");
    num = reader.nextInt();
    Node<Integer> list = new Node<Integer>(num);
    last = list;
    System.out.println("Enter a number (-999 to end): ");
    num = reader.nextInt();
    while (num != -999) {
      last.setNext(new Node<Integer>(num));
      last = last.getNext();
      System.out.println("Enter a number (-999 to end): ");
      num = reader.nextInt();
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

  public static Node<Character> createCharList() {
    char chr;
    System.out.println("Enter a character (- to end): ");
    chr = reader.next().charAt(0);
    Node<Character> list = new Node<Character>(chr);
    while (chr != '-') {
      System.out.println("Enter a character (- to end): ");
      chr = reader.next().charAt(0);
      addCharToEnd(list, chr);
    }

    return list;
  }

  public static void addCharToEnd(Node<Character> head, char chr) {
    Node<Character> tmp = head;
    while (tmp.hasNext()) {
      tmp = tmp.getNext();
    }
    tmp.setValue(chr);
    tmp.setNext(head);
  }

  public static void printList(Node<Integer> list) {
    Node<Integer> tmp = list;
    while (tmp != null) {
      System.out.println(tmp.getValue());
      tmp = tmp.getNext();
    }
  }

  public static Node<Integer> delete(Node<Integer> list, int num) {
    if (list == null) {
      return null;
    }
    if (list.getValue() == num) {
      return list.getNext();
    }
    Node<Integer> prev = list;
    Node<Integer> pos = list.getNext();
    while (pos != null) {
      if (pos.getValue() == num) {
        prev.setNext(pos.getNext());
        return list;
      } else {
        prev = pos;
        pos = pos.getNext();
      }
    }
    return list;
  }

  // stack functions
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

  public static Stack<Integer> reverse(Stack<Integer> s) {
    Stack<Integer> tmp = new Stack<>();
    Stack<Integer> reverseS = new Stack<>();
    while (!s.isEmpty()) {
      reverseS.push(s.top());
      tmp.push(s.pop());
    }
    while (!tmp.isEmpty()) {
      s.push(tmp.pop());
    }

    return reverseS;
  }

  public static void printStack(Stack<Integer> s) {
    Stack<Integer> tmp = new Stack<>();
    while (!s.isEmpty()) {
      System.out.println(s.top());
      tmp.push(s.pop());
    }
    while (!tmp.isEmpty()) {
      s.push(tmp.pop());
    }
  }

  // array functions
  public static int[] createArray() {
    System.out.println("Enter the array length: ");
    int[] arr = new int[reader.nextInt()];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter a value for place " + i + ": ");
      arr[i] = reader.nextInt();
    }
    return arr;
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
