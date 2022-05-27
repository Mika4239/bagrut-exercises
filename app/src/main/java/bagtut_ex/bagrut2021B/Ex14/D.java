package bagtut_ex.bagrut2021B.Ex14;

public class D {

  private A a;

  public D(A a) {
    this.a = a;
  }

  public void func() {
    (this.a).func();
  }

  public void isB() {
    System.out.println((this.a) instanceof B);
  }
}
