package bagtut_ex.bagrut2018.Ex3;

public class Time {
    
    private int hour;
    private int minute;

    public Time(int hour, int minute){

        if(hour < 0 || hour > 23){
            this.hour = 0;
        }
        else{
            this.hour = hour;
        }

        if(minute < 0 || minute > 59){
            this.minute = 0;
        }
        else{
            this.minute = minute;
        }
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getHour(){
        return this.hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public int getMinute(){
        return this.minute;
    }
}
