package bagtut_ex.bagrut2016.Ex4;

public class Ring {
   
    private String size;
    private int color;
    
    public Ring(){
        this.size = "L";
        this.color = 0;
    }

    public Ring(String str, int c){
        this.size = str;
        this.color = c;
    }

    public String getSize(){
        return this.size;
    }

    public int getColor(){
        return this.color;
    }
}
