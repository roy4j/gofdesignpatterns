package gof.dp18;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Originator obj = new Originator("Tom");
        System.out.println(obj.getName());

        obj = new Originator("Dick");
        System.out.println(obj.getName());

        // Save
        caretaker.setMemento(obj);

        obj = new Originator("Harry");
        System.out.println(obj.getName());

        // Undo
        caretaker.getMemento(obj);
        System.out.println(obj.getName());

    }
}