package gof.dp23;

public class Body implements BodyElement {
    BodyElement[] elements;

    public Body() {
        this.elements = new BodyElement[]{
                new Head(),
                new Chest(),
                new Hand(),
                new Leg()
        };
    }

    @Override
    public void accept(BodyElementVisitor visitor) {
        for (BodyElement elem : elements) {
            elem.accept(visitor);
        }
        //visitor.visit(this);
    }
}