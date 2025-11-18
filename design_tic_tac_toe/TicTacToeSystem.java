package design_tic_tac_toe;

import design_tic_tac_toe.entites.Game;
import design_tic_tac_toe.entites.Player;
import design_tic_tac_toe.exceptions.InvalidMoveException;
import design_tic_tac_toe.observer.ScoreBoard;

public class TicTacToeSystem {
    private static volatile TicTacToeSystem instance;
    private Game game;
    private final ScoreBoard scoreBoard;

    private TicTacToeSystem() {
        this.scoreBoard = new ScoreBoard();
    }

    public static synchronized TicTacToeSystem getInstance() {
        if(instance == null) {
            instance = new TicTacToeSystem();
        }
        return instance;
    }

    public void createGame(Player player1, Player player2) {
        this.game = new Game(player1, player2);
        this.game.addObserver(this.scoreBoard);

        System.out.printf("Game started between %s (X) and %s (O).%n", player1.getName(), player2.getName());
    }

    public void makeMove(Player player, int row, int col) {
        if(game == null) {
            System.out.println("No game in progress. Please create a game first.");
            return;
        }

        try {
            System.out.printf("%s plays at (%d, %d)%n", player.getName(), row, col);
            game.makeMove(player, row, col);
            printBoard();
            System.out.println("Game status: " + game.getStatus());
            if(game.getWinner()!=null) {
                System.out.println("Winner: "+game.getWinner().getName());
            }
        } catch(InvalidMoveException ex) {
            System.out.println("Error: "+ ex.getMessage());
        }
    }
    
    public void printBoard() {
        game.getBoard().printBoard();
    }

    public void printScoreBoard() {
        scoreBoard.printScores();
    }
}
