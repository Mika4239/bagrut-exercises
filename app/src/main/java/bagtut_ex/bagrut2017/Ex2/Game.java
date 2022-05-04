package bagtut_ex.bagrut2017.Ex2;

public class Game {
    
    private String gameName;
    private int numPlayers;
    private boolean isWater;

    public Game(String gameName, int numPlayers, boolean isWater){
        this.gameName = gameName;
        this.numPlayers = numPlayers;
        this.isWater = isWater;
    }

    public void setGameName(String gameName){
        this.gameName = gameName;
    }

    public String getGameName(){
        return this.gameName;
    }

    public void setNumPlayers(int numPlayers){
        this.numPlayers = numPlayers;
    }

    public int getNumPlayers(){
        return this.numPlayers;
    }

    public void setIsWater(boolean isWater){
        this.isWater = isWater;
    }

    public boolean getIsWater(){
        return this.isWater;
    }
}
