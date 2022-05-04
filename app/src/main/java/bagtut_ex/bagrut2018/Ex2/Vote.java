package bagtut_ex.bagrut2018.Ex2;

public class Vote {
    
    private int first;
    private int second;
    private int third;

    public Vote(int first, int second, int third){
        this.first= first;
        this.second = second;
        this.third = third;
    }

    public void setFirst(int first){
        this.first = first;
    }

    public int getFirst(){
        return this.first;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public int getSecond(){
        return this.second;
    }

    public void setThird(int third){
        this.third = third;
    }

    public int getThird(){
        return this.third;
    }
}
