package gof.dp21.strategies;

public class NightMove implements MoveStrategy {

	@Override
	public void move() {
		System.out.println("Moved two and half squares");
	}
}