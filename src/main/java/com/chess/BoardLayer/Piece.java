package com.chess.BoardLayer;

import com.chess.BoardLayer.Utilities.Position;

public class Piece {
    
    public Piece(Board board)
    {
        this.board = board;
    }


    private Board board;
    

    protected Position position;

    public boolean[][] possibleMoves()
    {

    }

    public boolean possibleMove(Position position)
    {

    }


    public boolean isThereAnyPosition()
    {

    }

    protected Board getBoard() {
        return board;
    }
}
