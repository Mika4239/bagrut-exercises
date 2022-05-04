package bagtut_ex.bagrut2016.Ex3;

public class TvWeek {

    private TvProgram[] arrProg;
    private int current;

    public TvWeek(){
        this.arrProg = new TvProgram[100];
        this.current = -1;
    }

    public TvWeek(TvProgram[] arrProg){
        this.arrProg = new TvProgram[arrProg.length];
        for(int i = 0; i < this.arrProg.length; i++){
            this.arrProg[i] = new TvProgram(arrProg[i].getCode(), arrProg[i].getDay(), arrProg[i].getIsSport());
        }
        this.current = this.arrProg.length;
    }

    public void setArrProg(TvProgram[] arrProg){
        this.arrProg = new TvProgram[arrProg.length];
        for(int i = 0; i < this.arrProg.length; i++){
            this.arrProg[i] = new TvProgram(arrProg[i].getCode(), arrProg[i].getDay(), arrProg[i].getIsSport());
        }
    }

    public void setCurrent(int current){
        this.current = current;
    }

    public TvProgram[] getArrProg(){
        return this.arrProg;
    }

    public int getCurrent(){
        return this.current;
    }

    public void addTvProgram(TvProgram program){
        if(this.arrProg.length > this.current){
            this.arrProg[current + 1] = program;
            this.current++;
        }
        else{
            System.out.println("There isn't space for more programs in this week.");
        }
    }

    public int sportPrograms(){
        return sportPrograms(0);
    }

    public int sportPrograms(int i){
        if(i > this.current){
            return 0;
        }
        if(this.arrProg[i].getIsSport()) {
            i = i + 1;
            return 1 + sportPrograms(i);
        }
        i = i + 1;
        return sportPrograms(i);
    }
}
