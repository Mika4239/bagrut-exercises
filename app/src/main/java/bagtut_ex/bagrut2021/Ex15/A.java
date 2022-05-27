package bagtut_ex.bagrut2021.Ex15;

public class A {

  public A() {
    System.out.println("ctor A");
  }

  public void foo(int x) {
    System.out.println("A foo int " + x);
  }

  public void foo(double y) {
    System.out.println("A foo double " + y);
  }

  public void bar(int x) {
    System.out.println("A bar " + x);
    foo(x);
  }
}
