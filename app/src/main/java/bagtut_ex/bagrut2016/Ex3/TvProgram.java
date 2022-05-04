package bagtut_ex.bagrut2016.Ex3;

public class TvProgram {
    
    private int code;
    private int day;
    private boolean isSport;

    public TvProgram(int code, int day, boolean isSport){
        this.code = code;
        this.day = day;
        this.isSport = isSport;
    }

    public void setCode(int code){
        this.code = code;
    }

    public int getCode(){
        return this.code;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getDay(){
        return this.day;
    }

    public void setIsSport(boolean isSport){
        this.isSport = isSport;
    }

    public boolean getIsSport(){
        return this.isSport;
    }
}
