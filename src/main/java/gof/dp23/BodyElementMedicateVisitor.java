package gof.dp23;

public class BodyElementMedicateVisitor implements BodyElementVisitor {
    @Override
    public void visit(Head head) {
        System.out.println("Head Medication");
    }

    @Override
    public void visit(Chest chest) {
        System.out.println("Chest Medication");
    }

    @Override
    public void visit(Hand hand) {
        System.out.println("Hand Medication");
    }

    @Override
    public void visit(Leg leg) {
        System.out.println("Leg Medication");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Body Medication Completed\n");
    }
}