public class Game {
    Player player1 = new Player();
    Player player2 = new Player();
    Die die1 = new Die();
    Die die2 = new Die();
    UiController ui = new UiController();

    public Game() {

    }

    public void playGame() {
        ui.setupBoard(11);
        setupPlayers();
        ui.createPlayer(player1.getName(), player2.getName());

        while (true) {
            playTurn();
            setPlayerTurn();
        }

    }

    private void setupPlayers() {
        //Prompts the players to pick names and set car colours.
        ui.setPlayerNames();
//		ui.setCarColour();

        //Sets the "name" for each player object.
        player1.setName(ui.getPlayer1Name());
        player2.setName(ui.getPlayer2Name());

        if (player1.getName().equals("")) {
            player1.setName("Player 1");
        }

        if (player2.getName().equals("")) {
            player2.setName("Player 2");
        }
        player1.setPlayerTurn(true);
    }

    //Rolls dice moves the player;
    private void playTurn() {

        ui.rollDice(die1.roll(), die2.roll());

        if(player1.getPlayerTurn()==true) {
            player1.money.setAmount(fieldInfo);
            ui.movePlayer(die1.sum(die2), player1.getName());
        }

        if(player2.getPlayerTurn()==true) {
            player2.money.setAmount(fieldInfo);
            ui.movePlayer(die1.sum(die2), player2.getName());
        }
    }

    private void setPlayerTurn() {
        if(die1.getFaceValue()+die2.getFaceValue()!=10)
        if (player1.getPlayerTurn() == true) {
            player1.setPlayerTurn(false);
            player2.setPlayerTurn(true);
        }
        else if (player2.getPlayerTurn() == true) {
            player2.setPlayerTurn(false);
            player1.setPlayerTurn(true);
        }
    }
    public void checkPlayers() {
        if(player1.money.amount >= 3000) {
            System.out.println("PLAYER 1 WINS!");
        }
        if(player2.money.amount >= 3000) {
            System.out.println("PLAYER 2 WINS!");
        }
    }


    }


