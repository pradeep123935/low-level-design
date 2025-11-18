package design_tic_tac_toe.strategy;

import design_tic_tac_toe.entites.Board;
import design_tic_tac_toe.entites.Player;

public interface WinningStrategy {
    boolean checkWinner(Board board, Player player);
}
