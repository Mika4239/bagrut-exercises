package bagtut_ex.bagrut2021.Ex15;

public class B extends A {

  public B() {
    System.out.println("ctor B");
  }

  public void foo(int x) {
    System.out.println("B foo int " + x);
  }

  public void bar() {
    System.out.println("B bar");
    foo(2);
  }

  public void another(int x) {
    System.out.println("B another " + x);
    super.foo(x);
    foo(2.0 * x);
  }
}
