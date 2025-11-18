package design_tic_tac_toe.observer;

import design_tic_tac_toe.entites.Game;

public interface GameObserver {
    void update(Game game);
}
