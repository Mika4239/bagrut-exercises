package bagtut_ex.bagrut2018.Ex3;

public class Flight {
    
    private String name;
    private String destination;
    private String flightCode;
    private Time flightTime;

    public Flight(String name, String destination, String flightCode, Time flightTime){
        this.name = name;
        this.destination = destination;
        this.flightCode = flightCode;
        this.flightTime = new Time(flightTime.getHour(), flightTime.getMinute());
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public String getDestination(){
        return this.destination;
    }

    public void setFlightCode(String flightCode){
        this.flightCode = flightCode;
    }

    public String getFlightCode(){
        return this.flightCode;
    }

    public void setFlightTime(Time flightTime){
        this.flightTime = new Time(flightTime.getHour(), flightTime.getMinute());
    }

    public Time getFlightTime(){
        return this.flightTime;
    }
}
