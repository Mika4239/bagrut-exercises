package bagtut_ex.bagrut2021.Ex14;

public class Dairy {

  private Event[] events;

  public Dairy() {
    this.events = new Event[1000];
  }

  public void setEvents(Event[] events) {
    this.events = new Event[events.length];
    for (int i = 0; i < this.events.length; i++) {
      this.events[i] =
        new Event(
          new Date(
            events[i].getDate().getDay(),
            events[i].getDate().getMonth(),
            events[i].getDate().getYear()
          ),
          events[i].getHour()
        );
    }
  }

  public Event[] getEvents() {
    return this.events;
  }

  public PhoneCall[] allCalls(Date date) {
    PhoneCall[] phoneCalls = new PhoneCall[100];
    int place = 0;
    for (int i = 0; i < this.events.length; i++) {
      if (
        this.events[i] instanceof PhoneCall &&
        this.events[i].getDate().same(date)
      ) {
        phoneCalls[place] =
          new PhoneCall(
            new Date(
              events[i].getDate().getDay(),
              events[i].getDate().getMonth(),
              events[i].getDate().getYear()
            ),
            events[i].getHour(),
            ((PhoneCall) this.events[i]).getPhoneNumber(),
            ((PhoneCall) this.events[i]).getName()
          );

        place++;
      }
    }
    return phoneCalls;
  }
}
