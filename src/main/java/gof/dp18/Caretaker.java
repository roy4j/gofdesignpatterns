package gof.dp18;

public class Caretaker {
    private Object memento;

    public void setMemento(Originator o) {
        memento = o.save();
    }

    public void getMemento(Originator o) {
        o.restore(memento);
    }
}