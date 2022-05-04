package bagtut_ex.bagrut2018.Ex4;

import bagtut_ex.Functions;
import bagtut_ex.Stack;
import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    Stack<Integer> s = Functions.createStack();
    printStack(stackTwoItems(s));
  }

  public static Stack<TwoItems> stackTwoItems(Stack<Integer> stk1) {
    Stack<TwoItems> s1 = new Stack<TwoItems>();
    TwoItems items;
    while (!stk1.isEmpty()) {
      items = new TwoItems(stk1.pop(), lastAndRemove(stk1));
      s1.push(items);
    }

    return s1;
  }

  public static int lastAndRemove(Stack<Integer> s) {
    int last;
    Stack<Integer> tmp = new Stack<Integer>();
    while (!s.isEmpty()) {
      tmp.push(s.pop());
    }
    last = tmp.pop();
    while (!tmp.isEmpty()) {
      s.push(tmp.pop());
    }

    return last;
  }

  public static void printStack(Stack<TwoItems> s) {
    Stack<TwoItems> tmp = new Stack<>();
    while (!s.isEmpty()) {
      System.out.println(
        "num1: " + s.top().getNum1() + ", num2: " + s.top().getNum2()
      );
      tmp.push(s.pop());
    }
    while (!tmp.isEmpty()) {
      s.push(tmp.pop());
    }
  }
}
