package gof.dp23;

public class Hand implements BodyElement {

	@Override
	public void accept(BodyElementVisitor visitor) {
		visitor.visit(this);
	}
}