package gof.dp23;

public class Head implements BodyElement {

	@Override
	public void accept(BodyElementVisitor visitor) {
		visitor.visit(this);
	}
}