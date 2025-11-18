package design_tic_tac_toe.observer;

import java.util.ArrayList;
import java.util.List;

import design_tic_tac_toe.entites.Game;

public abstract class GameSubject {
    private final List<GameObserver> observers = new ArrayList<>();

    public void addObserver(GameObserver gameObserver) {
        observers.add(gameObserver);
    }

    public void removeObserver(GameObserver gameObserver) {
        observers.remove(gameObserver);
    }

    public void notifyObserver() {
        for(GameObserver observer: observers) {
            observer.update((Game) this);
        }
    }
}
 