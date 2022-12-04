package gof.dp21;


import gof.dp21.strategies.DiagonalMove;
import gof.dp21.strategies.FileMove;
import gof.dp21.strategies.NightMove;
import gof.dp21.strategies.RankMove;

public class Main {
    public static void main(String[] args) {
        Piece queen = new ChessPiece("Queen");
        Piece rook = new ChessPiece("Rook");
        Piece night = new ChessPiece("Night");

        queen.setMove(new DiagonalMove());
        queen.movePiece();

        rook.setMove(new FileMove());
        rook.movePiece();

        queen.setMove(new RankMove());
        queen.movePiece();

        night.setMove(new NightMove());
        night.movePiece();
    }
}