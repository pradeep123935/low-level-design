package design_tic_tac_toe.strategy;

import design_tic_tac_toe.entites.Board;
import design_tic_tac_toe.entites.Player;

public class DiagonalWinningStrategy implements WinningStrategy {

    @Override
    public boolean checkWinner(Board board, Player player) {
        //main diagonal
        boolean mainDiagWin = true;
        for(int i=0;i<board.getSize();i++) {
            if(board.getCell(i, i).getSymbol() != player.getSymbol()) {
                mainDiagWin = false;
                break;
            }
        }
        if(mainDiagWin)
            return true;
        
        //anti diag
        boolean antiDiagWin = true;
        for(int i=0;i<board.getSize();i++) {
            if(board.getCell(i, board.getSize()-i-1).getSymbol() != player.getSymbol()) {
                antiDiagWin = false;
                break;
            }
        }
        if(antiDiagWin)
            return true;
        return false;
    }
    
}
