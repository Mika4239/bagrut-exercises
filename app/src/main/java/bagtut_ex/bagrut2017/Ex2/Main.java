package bagtut_ex.bagrut2017.Ex2;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the country name: ");
        Country country = new Country(reader.next());
        System.out.println("Enter the limit to the number of games: ");
        Game[] games = new Game[reader.nextInt()];
        System.out.println("Enter the number of games");
        int len = reader.nextInt();
        for(int i = 0; i < len; i++){
            games[i] = addGame();
        }
        country.setGames(games);
        System.out.println("Enter the name of the game to check: ");
        String name = reader.next();
        System.out.println("\nThe country is in the game: " +country.inGame(name));
    }

    public static Game addGame(){
        System.out.println("\nEnter the name of the game: ");
        String name = reader.next();
        System.out.println("Enter the number of players: ");
        int numPlayers = reader.nextInt();
        System.out.println("Enter if the game is water game: ");
        boolean isWater = reader.nextBoolean();
        return new Game(name, numPlayers, isWater);
    }
}
