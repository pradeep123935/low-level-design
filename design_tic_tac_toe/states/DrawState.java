package design_tic_tac_toe.states;

import design_tic_tac_toe.entites.Game;
import design_tic_tac_toe.entites.Player;
import design_tic_tac_toe.exceptions.InvalidMoveException;

public class DrawState implements GameState{

    @Override
    public void handleMove(Game game, Player player, int row, int col) {
        throw new InvalidMoveException("Game is already over. It was a draw.");
    }
    
}
