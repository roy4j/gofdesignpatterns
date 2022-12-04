package gof.dp23;

public class Chest implements BodyElement {

	@Override
	public void accept(BodyElementVisitor visitor) {
		visitor.visit(this);
	}
}