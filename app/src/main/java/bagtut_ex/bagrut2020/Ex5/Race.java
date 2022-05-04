package bagtut_ex.bagrut2020.Ex5;

import bagtut_ex.Node;

public class Race {

  private Node<Competitor> competitors;

  public Race() {
    this.competitors = null;
  }

  public Race(Node<Competitor> competitors) {
    Node<Competitor> tmp = competitors;
    this.competitors =
      new Node<Competitor>(
        new Competitor(
          tmp.getValue().getName(),
          tmp.getValue().getMinutes(),
          tmp.getValue().getSeconds()
        )
      );
    tmp = tmp.getNext();
    while (tmp != null) {
      this.competitors.setNext(
          new Node<Competitor>(
            new Competitor(
              tmp.getValue().getName(),
              tmp.getValue().getMinutes(),
              tmp.getValue().getSeconds()
            )
          )
        );
      tmp = tmp.getNext();
    }
  }

  public void setCompetitors(Node<Competitor> competitors) {
    Node<Competitor> tmp = competitors;
    this.competitors =
      new Node<Competitor>(
        new Competitor(
          tmp.getValue().getName(),
          tmp.getValue().getMinutes(),
          tmp.getValue().getSeconds()
        )
      );
    tmp = tmp.getNext();
    while (tmp != null) {
      this.competitors.setNext(
          new Node<Competitor>(
            new Competitor(
              tmp.getValue().getName(),
              tmp.getValue().getMinutes(),
              tmp.getValue().getSeconds()
            )
          )
        );
      tmp = tmp.getNext();
    }
  }

  public Node<Competitor> getCompetitors() {
    return this.competitors;
  }

  public void add(Competitor x) {
    Node<Competitor> tmp = this.competitors;
    if (tmp == null) {
      this.competitors = new Node<Competitor>(x);
    } else if (tmp.getValue().getTime() < x.getTime()) {
      this.competitors = new Node<Competitor>(x, this.competitors);
    } else {
      while (tmp.getValue().getTime() < x.getTime()) {
        tmp = tmp.getNext();
      }
      Node<Competitor> next = tmp.getNext();
      tmp.setNext(new Node<Competitor>(x, next));
    }
  }

  public String rank(int x) {
    Node<Competitor> tmp = this.competitors;
    for (int i = 0; tmp != null && i < x; i++) {
      tmp = tmp.getNext();
    }

    return tmp.getValue().getName();
  }
}
