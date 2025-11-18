package design_tic_tac_toe.states;

import design_tic_tac_toe.entites.Game;
import design_tic_tac_toe.entites.Player;
import design_tic_tac_toe.enums.GameStatus;
import design_tic_tac_toe.enums.Symbol;
import design_tic_tac_toe.exceptions.InvalidMoveException;

public class InprogressState implements GameState {

    @Override
    public void handleMove(Game game, Player player, int row, int col) {
        if(game.getCurrentPlayer() != player) {
            throw new InvalidMoveException("Not your turn!!");
        }

        game.getBoard().placeSymbol(row, col, player.getSymbol());

        if(game.checkWinner(player)) {
            game.setWinner(player);
            game.setStatus(player.getSymbol() == Symbol.X ? GameStatus.WINNER_X : GameStatus.WINNER_O);
            game.setState(new WinnerState());
        } else if(game.getBoard().isFull()) {
            game.setStatus(GameStatus.DRAW);
            game.setState(new DrawState());
        } else {
            game.switchPlayer();
        }
    }
    
}
