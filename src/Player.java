public class Player
{String name;
    boolean playerTurn = false;

    public Money money = new Money();

    public Player () {
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

    public void setPlayerTurn (boolean playerTurn) {
        this.playerTurn = playerTurn;
    }

    public boolean getPlayerTurn () {
        return this.playerTurn;
    }


}

