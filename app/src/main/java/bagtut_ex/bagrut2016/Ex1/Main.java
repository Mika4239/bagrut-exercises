package bagtut_ex.bagrut2016.Ex1;

import java.util.Scanner;

public class Main {

    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args){
        Student student;
        String name;
        int[] arrTest;
        System.out.println("Enter the student name: ");
        name = reader.next();
        System.out.println("Enter the three grades of the student: ");
        arrTest = new int[3];
        arrTest[0] = reader.nextInt();
        arrTest[1] = reader.nextInt();
        arrTest[2] = reader.nextInt();
        student = new Student(name, arrTest);
        System.out.println("\naverage is: " +student.avg());
    }
}
