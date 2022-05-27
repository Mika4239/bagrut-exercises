package Matcunet.Chapter2.Ex2;

import bagtut_ex.Functions;
import bagtut_ex.Node;
import bagtut_ex.Stack;
import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter the array length");
    Stack<Integer>[] arr = new Stack[reader.nextInt()];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter the stack in place " + i + ": ");
      arr[i] = Functions.createStack();
    }
    Node<Integer>[] nodeArr = complete(arr);
    for (int i = 0; i < nodeArr.length; i++) {
      Functions.printList(nodeArr[i]);
      System.out.println();
    }
  }

  public static Node<Integer>[] complete(Stack<Integer>[] arr) {
    Node<Integer>[] newArr = new Node[arr.length];
    Node<Integer> lst;
    Stack<Integer> tmp = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      lst = new Node<Integer>(addDigits(arr[i].top()));
      tmp.push(arr[i].pop());
      while (!arr[i].isEmpty()) {
        Functions.addToEnd(lst, addDigits(arr[i].top()));
        tmp.push(arr[i].pop());
      }
      while (!tmp.isEmpty()) {
        arr[i].push(tmp.pop());
      }
      newArr[i] = lst;
    }
    return newArr;
  }

  public static int addDigits(int num) {
    int sum = 0, digit;
    while (num / 10 != 0) {
      digit = num % 10;
      sum += digit;
      num = num / 10;
    }
    sum += num;
    return sum;
  }
}
