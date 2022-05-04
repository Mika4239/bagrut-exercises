package bagtut_ex.bagrut2017.Ex1;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int[] arr = new int[reader.nextInt()];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the number for place " + i + ": ");
            arr[i] = reader.nextInt();
        }
        System.out.println("\nThe biggest number is in place: " + big(arr));
    }

    private static int big(int[] arr){
        int max = arr[0];
        int maxIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
