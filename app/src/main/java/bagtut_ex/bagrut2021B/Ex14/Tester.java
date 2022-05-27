package bagtut_ex.bagrut2021B.Ex14;

public class Tester {

  public static void main(String[] args) {
    A y1 = new A();
    A y2 = new A();
    y1.foo(y1.getNum());
    System.out.println(y1.isEqual(y2));
    B y3 = new B();
    A y4 = new B();
    System.out.println(y3.isEqual(y4));
    System.out.println(y4.isEqual(y3));
    B y5 = y3;
    y5.setNum(0);
    System.out.println(y3.isEqual(y5));
    C y6 = new C();
    System.out.println(((B) y4).isEqual(y5));
    D d1 = new D(y4);
    D d2 = new D(y6);
    System.out.println(B.count);
    d1.func();
    d2.func();
    d1.isB();
    d2.isB();
  }
}
