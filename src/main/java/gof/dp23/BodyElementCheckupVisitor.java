package gof.dp23;

public class BodyElementCheckupVisitor implements BodyElementVisitor {

    @Override
    public void visit(Head head) {
        System.out.println("Head Checkup");
    }

    @Override
    public void visit(Chest chest) {
        System.out.println("Chest Checkup");
    }

    @Override
    public void visit(Hand hand) {
        System.out.println("Hand Checkup");
    }

    @Override
    public void visit(Leg leg) {
        System.out.println("Leg Checkup");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Body Checkup Completed\n");
    }
}