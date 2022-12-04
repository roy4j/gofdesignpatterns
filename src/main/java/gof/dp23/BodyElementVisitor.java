package gof.dp23;

public interface BodyElementVisitor {
    void visit(Head head);

    void visit(Leg leg);

    void visit(Chest chest);

    void visit(Hand hand);

    void visit(Body body);
}