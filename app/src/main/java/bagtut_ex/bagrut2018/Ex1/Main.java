package bagtut_ex.bagrut2018.Ex1;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        AllNumbers numbers;
        int[] arr;

        System.out.println("Enter the length of the array: ");
        arr = new int[reader.nextInt()];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the number in place " + i + ": ");
            arr[i] = reader.nextInt();
        }

        numbers = new AllNumbers(arr);

        System.out.println("\nThe last odd value is: " + numbers.lastOddValue());
    }
}
