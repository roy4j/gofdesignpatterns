package gof.dp21;


import gof.dp21.strategies.MoveStrategy;

// Context
public class ChessPiece implements Piece {
    private String name;

    // Encapsulates Algorithms which has no access to Context
    private MoveStrategy move;

    public ChessPiece(String name) {
        this.name = name;
    }

    @Override
    public void setMove(MoveStrategy move) {
        this.move = move;
    }

    @Override
    public void movePiece() {
        System.out.print(name + " ");
        move.move();
    }
}