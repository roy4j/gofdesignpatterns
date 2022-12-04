package gof.dp23;

@FunctionalInterface
public interface BodyElement {
	void accept(BodyElementVisitor visitor);
}