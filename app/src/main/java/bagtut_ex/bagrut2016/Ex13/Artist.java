package bagtut_ex.bagrut2016.Ex13;

public class Artist {

    protected static int num;
    protected double sal;
    protected String name;

    public Artist(double sal, String name){
        this.sal = sal;
        this.name = name;
    }

    public Artist(double sal, String firstName, String lastName){
        this.sal = sal;
        this.name = firstName + " " + lastName;
    }

    public double calc(double d){
        return d * this.sal;
    }

    public void print(){
        System.out.println("Artist");
    }

    public double price(){
        return this.sal;
    }

    public int train(){
        return 0;
    }
}
