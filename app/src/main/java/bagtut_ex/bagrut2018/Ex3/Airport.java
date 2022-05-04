package bagtut_ex.bagrut2018.Ex3;

public class Airport {

  private Flight[] flights;

  public Airport(Flight[] flights) {
    this.flights = new Flight[flights.length];
    for (int i = 0; i < this.flights.length; i++) {
      this.flights[i] =
        new Flight(
          flights[i].getName(),
          flights[i].getDestination(),
          flights[i].getFlightCode(),
          new Time(
            flights[i].getFlightTime().getHour(),
            flights[i].getFlightTime().getMinute()
          )
        );
    }
  }

  public void setFlights(Flight[] flights) {
    this.flights = new Flight[flights.length];
    for (int i = 0; i < this.flights.length; i++) {
      this.flights[i] =
        new Flight(
          flights[i].getName(),
          flights[i].getDestination(),
          flights[i].getFlightCode(),
          new Time(
            flights[i].getFlightTime().getHour(),
            flights[i].getFlightTime().getMinute()
          )
        );
    }
  }

  public Flight[] getFlights() {
    return this.flights;
  }

  // TODO: gimel (1) and (2) in notebook
  public boolean isFly() {
    for (int i = 0; i < this.flights.length; i++) {
      if (this.flights[i].getName().equals("Sky")) {
        return true;
      }
    }

    return false;
  }
}
