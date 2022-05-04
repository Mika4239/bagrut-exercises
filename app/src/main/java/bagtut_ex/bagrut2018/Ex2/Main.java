package bagtut_ex.bagrut2018.Ex2;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of votes: ");
        Vote[] votes = new Vote[reader.nextInt()];
        for(int i = 0; i < votes.length; i++){
            System.out.println("Enter the songs in first, second and third place (in this order) for vote " + i + ": ");
            votes[i] = new Vote(reader.nextInt(), reader.nextInt(), reader.nextInt());
        }

        System.out.println("\nThe winner is: " + theWinner(votes));
    }

    public static int theWinner(Vote[] votes){
        int[] songs = new int[41];

        for(int i = 1; i < songs.length; i++){
            songs[i] = 0;
        }

        for(int i = 0; i < votes.length; i++){
            songs[votes[i].getFirst()] += 7;
            songs[votes[i].getSecond()] += 5;
            songs[votes[i].getThird()] += 1;
        }

        int max = 0, maxSong = 1;

        for(int i = 1; i < songs.length; i++){
            if(songs[i] > max){
                max = songs[i];
                maxSong = i;
            }
        }

        return maxSong;
    }
}
