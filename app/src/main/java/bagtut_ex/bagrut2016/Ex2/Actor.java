package bagtut_ex.bagrut2016.Ex2;

public class Actor {
    private String id;
    private String gender;
    private int numFilms;

    public Actor(String id, String gender, int numFilms){
        this.id = id;
        this.gender = gender;
        this.numFilms = numFilms;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setNumFilms(int numFilms){
        this.numFilms = numFilms;
    }

    public String getId(){
        return this.id;
    }

    public String getGender(){
        return this.gender;
    }

    public int getNumFilms(){
        return this.numFilms;
    }

    public void addFilms(){
        this.numFilms++;
    }

    public int compare(Actor other){
        if(this.numFilms > other.numFilms){
            return 1;
        }
        else if(this.numFilms < other.numFilms){
            return 2;
        }
        else{
            return 3;
        }
    }
}
