package gof.dp21.strategies;

public class RankMove implements MoveStrategy{

	@Override
	public void move() {
		System.out.println("Moved Vertically");
	}
}