package design_tic_tac_toe.entites;

import design_tic_tac_toe.enums.Symbol;
import design_tic_tac_toe.exceptions.InvalidMoveException;

public class Board {
    private final int size;
    private int movesCount;
    private final Cell[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new Cell[size][size];
        this.movesCount = 0;
        initializeBoard();
    }

    private void initializeBoard() {
        for(int row=0;row<size;row++) {
            for(int col=0;col<size;col++) {
                this.board[row][col] = new Cell();
            }
        }
    }

    public boolean placeSymbol(int row, int col, Symbol symbol) {
        if(row < 0 || col < 0 || row >= size || col >= size) {
            throw new InvalidMoveException("Invalid position : out of bounds");
        }

        if(board[row][col].getSymbol() != Symbol.EMPTY) {
            throw new InvalidMoveException("Invalid position : cell already occupied");
        }

        board[row][col].setSymbol(symbol);
        movesCount++;
        return true;
    }

    public boolean isFull() {
        return movesCount == size * size;
    }

    public Cell getCell(int row, int col) {
        if(row < 0 || col < 0 || row >= size || col >= size) {
            return null;
        }
        return board[row][col];
    }

    public int getSize() {
        return size;
    }

    public void printBoard() {
        System.out.println("------------------");
        for(int row=0;row<size;row++) {
            System.out.print("| ");
            for(int col=0;col<size;col++) {
                System.out.println(board[row][col].getSymbol().getChar() + " | ");
            }
            System.out.println("\n---------------");
        }
    }

}
