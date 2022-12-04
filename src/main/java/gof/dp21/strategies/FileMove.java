package gof.dp21.strategies;

public class FileMove implements MoveStrategy{

	@Override
	public void move() {
		System.out.println("Moved Horizontally");
	}
}