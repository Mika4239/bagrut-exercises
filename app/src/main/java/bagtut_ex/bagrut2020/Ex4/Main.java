package bagtut_ex.bagrut2020.Ex4;

import bagtut_ex.Functions;
import bagtut_ex.Stack;
import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    Stack<Integer> s = Functions.createStack();
    System.out.println("\nall exist: " + allExist(s));
  }

  public static boolean allExist(Stack<Integer> s) {
    Stack<Integer> tmp = new Stack<>();
    Stack<Integer> sCopy = clone(s);
    boolean allExist = true;

    while (!s.isEmpty()) {
      int num = s.top() / (int) Math.pow(10, Math.floor(Math.log10(s.top())));

      if (!isExist(sCopy, num)) {
        allExist = false;
      }
      tmp.push(s.pop());
    }

    while (!tmp.isEmpty()) {
      s.push(tmp.pop());
    }

    return allExist;
  }

  public static boolean isExist(Stack<Integer> s, int num) {
    boolean exist = false;
    Stack<Integer> tmp = new Stack<>();

    while (!s.isEmpty()) {
      if (s.top() % 10 == num) {
        exist = true;
      }
      tmp.push(s.pop());
    }

    while (!tmp.isEmpty()) {
      s.push(tmp.pop());
    }

    return exist;
  }

  public static Stack<Integer> clone(Stack<Integer> s) {
    Stack<Integer> tmp = new Stack<>();
    Stack<Integer> cStack = new Stack<>();

    while (!s.isEmpty()) {
      cStack.push(s.top());
      tmp.push(s.pop());
    }

    while (!tmp.isEmpty()) {
      s.push(tmp.pop());
    }

    return cStack;
  }
}
