package bagtut_ex.bagrut2017.Ex2;

public class Country {
    
     private String countryName;
     private Game[] games;

     public Country(String countryName){
         this.countryName = countryName;
         this.games = new Game[43];
     }

     public void setCountryName(String countryName){
         this.countryName = countryName;
     }

     public String getCountryName(){
         return this.countryName;
     }

     public void setGames(Game[] games){
         this.games = new Game[games.length];
         for(int i = 0; i < this.games.length; i++){
             if(games[i] != null){
                this.games[i] = new Game(games[i].getGameName(), games[i].getNumPlayers(), games[i].getIsWater());
             }
             
         }
     }

     public Game[] getGames(){
         return this.games;
     }

     public boolean inGame(String name){
         for(int i = 0; i < games.length; i++){
             if(this.games[i] != null){
                 if(this.games[i].getGameName().equals(name)){
                     return true;
                 }
             }
         }
         return false;
     }
}
