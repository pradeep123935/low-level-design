package design_tic_tac_toe.entites;

import java.util.List;

import design_tic_tac_toe.enums.GameStatus;
import design_tic_tac_toe.observer.GameSubject;
import design_tic_tac_toe.states.GameState;
import design_tic_tac_toe.states.InprogressState;
import design_tic_tac_toe.strategy.ColumnWinningStrategy;
import design_tic_tac_toe.strategy.DiagonalWinningStrategy;
import design_tic_tac_toe.strategy.RowWinningStrategy;
import design_tic_tac_toe.strategy.WinningStrategy;

public class Game extends GameSubject {
    private final Board board;
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;
    private Player winner;
    private GameState state;
    private GameStatus status;
    private final List<WinningStrategy> winningStrategies;

    public Game(Player player1, Player player2) {
        this.board = new Board(3);
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.status = GameStatus.IN_PROGRESS;
        this.state = new InprogressState();
        this.winningStrategies = List.of(
            new RowWinningStrategy(),
            new ColumnWinningStrategy(),
            new DiagonalWinningStrategy()
        );
    }

    public void makeMove(Player player, int row, int col) {
        state.handleMove(this, player, row, col);
    }

    public boolean checkWinner(Player player) {
        for(WinningStrategy strategy: winningStrategies) {
            if(strategy.checkWinner(board, player)) {
                return true;
            }
        }
        return false;
    }

    public void switchPlayer() {
        this.currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public Board getBoard() {
        return board;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getState() {
        return state;
    }

    public void setState(GameState state) {
        this.state = state;
    }

    public void setStatus(GameStatus status) {
        this.status = status;

        if(status != GameStatus.IN_PROGRESS) {
            notifyObserver();
        }
    }

    public GameStatus getStatus() {
        return status;
    }
}
