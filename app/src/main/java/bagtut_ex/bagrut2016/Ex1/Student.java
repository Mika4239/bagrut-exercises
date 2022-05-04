package bagtut_ex.bagrut2016.Ex1;

public class Student {

    private String name;
    private int[] arrTest;

    public Student(String name) {
        this.name = name;
        this.arrTest = new int[3];
    }

    public Student(String name, int[] arrTest){
        this.name = name;
        this.arrTest = new int[arrTest.length];
        for(int i = 0; i < this.arrTest.length; i++){
            this.arrTest[i] = arrTest[i];
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public void setArrTest(int[] arrTest){
        this.arrTest = new int[arrTest.length];
        for(int i = 0; i < this.arrTest.length; i++){
            this.arrTest[i] = arrTest[i];
        }
    }

    public String getName(){
        return this.name;
    }

    public int[] getArrTest(){
        return this.arrTest;
    }

    public double avg(){
        return ((this.arrTest[0] + this.arrTest[1] + this.arrTest[2]) / 3.0);
    }
    
}
