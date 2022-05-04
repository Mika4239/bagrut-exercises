package bagtut_ex.bagrut2016.Ex2;

import java.util.Scanner;

public class Program {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args){
        Actor[] actArr = new Actor[5];
        String id, gender;
        int numFilms;
        for(int i = 0; i < actArr.length; i++){
            System.out.println("\nEnter the actor's id, gender and the number of movies the actor acted in: ");
            id = reader.next();
            gender = reader.next();
            numFilms = reader.nextInt();
            actArr[i] = new Actor(id, gender, numFilms);
        }
        System.out.println("\nEnter the number of movies: ");
        System.out.println("\nThe number of actors is: " + moreFilms(actArr, reader.nextInt()));
    }

    public static int moreFilms(Actor[] actArr, int num){
        int count = 0;
        for(int i = 0; i < actArr.length; i++){
            if(actArr[i].getNumFilms() > num){
                count++;
            }
        }

        return count;
    }
}
