package gof.dp21;


import gof.dp21.strategies.MoveStrategy;

public interface Piece {
	public void setMove(MoveStrategy move);
	public void movePiece();
}