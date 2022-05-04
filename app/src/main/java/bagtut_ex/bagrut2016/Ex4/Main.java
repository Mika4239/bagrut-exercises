package bagtut_ex.bagrut2016.Ex4;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size and color for ring 1: ");
        Ring ring1 = new Ring(reader.next(), reader.nextInt());
        System.out.println("Enter size and color for ring 2: ");
        Ring ring2 = new Ring(reader.next(), reader.nextInt());
        System.out.println("Enter size and color for ring 3: ");
        Ring ring3 = new Ring(reader.next(), reader.nextInt());
        Pole pole = new Pole();
        pole.add(ring1);
        pole.add(ring2);
        pole.add(ring3);
        pole.sort();
        pole.print();
    }
}
