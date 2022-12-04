package gof.dp23;

public class Main {
	public static void main(String[] args) {
		Body body = new Body();
		body.accept(new BodyElementCheckupVisitor());
		body.accept(new BodyElementMedicateVisitor());
	}
}