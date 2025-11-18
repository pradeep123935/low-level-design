package design_tic_tac_toe.states;

import design_tic_tac_toe.entites.Game;
import design_tic_tac_toe.entites.Player;

public interface GameState {
    void handleMove(Game game, Player player, int row, int col);
}
