package bagtut_ex.bagrut2021B.Ex14;

public class A {

  public static int count = 0;
  protected int num;

  public A() {
    this.num = 3;
    count++;
  }

  public int getNum() {
    return this.num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public void foo(int num) {
    this.num = num;
    num++;
  }

  public boolean isEqual(A other) {
    return (this.num == other.num);
  }

  public void func() {
    System.out.println("I am A");
  }
}
