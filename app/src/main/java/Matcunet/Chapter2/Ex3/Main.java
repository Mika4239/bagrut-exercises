package Matcunet.Chapter2.Ex3;

import bagtut_ex.Functions;
import bagtut_ex.Stack;
import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    Stack<Integer> s = Functions.createStack();
    Functions.printStack(s);
    sod(s);
    Functions.printStack(s);
  }

  public static void what(Stack<Integer> s, int n) {
    if (s.isEmpty() || n > s.top()) {
      s.push(n);
    } else {
      int temp = s.top();
      what(s, n);
      s.push(temp);
    }
  }

  public static void sod(Stack<Integer> s) {
    if (!s.isEmpty()) {
      int x = s.pop();
      sod(s);
      what(s, x);
    }
  }
}
