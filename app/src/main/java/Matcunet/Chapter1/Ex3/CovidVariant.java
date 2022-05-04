package Matcunet.Chapter1.Ex3;

import java.util.Scanner;

public class CovidVariant {

  public static Scanner reader = new Scanner(System.in);

  private String name;
  private int year;
  private Symptom[] arrS;
  private int count;

  public CovidVariant(String name, int year) {
    this.name = name;
    this.year = year;
    this.arrS = new Symptom[30];
    this.count = 0;
  }

  public void addSymptom(Symptom symptom) {
    this.arrS[this.count] = new Symptom(symptom.getName());
    this.arrS[this.count].setTime(symptom.getTime());
    this.count++;
  }

  public void inputSymptoms() {
    String name;
    int time;
    Symptom symptom;
    System.out.println("Enter the name of the symptom: ");
    name = reader.next();
    System.out.println("Enter the maximum number: ");
    time = reader.nextInt();
    while (time != -1 && this.count <= this.arrS.length) {
      symptom = new Symptom(name);
      symptom.setTime(time);
      addSymptom(symptom);
      System.out.println("Enter the name of the symptom: ");
      name = reader.next();
      System.out.println("Enter the maximum number: ");
      time = reader.nextInt();
    }
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getYear() {
    return this.year;
  }

  public void setArrS(Symptom[] arrS) {
    this.arrS = new Symptom[arrS.length];
    for (int i = 0; i < this.arrS.length; i++) {
      this.arrS[i] = new Symptom(arrS[i].getName());
    }
    this.count = this.arrS.length;
  }

  public Symptom[] getArrS() {
    return this.arrS;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getCount() {
    return this.count;
  }
}
