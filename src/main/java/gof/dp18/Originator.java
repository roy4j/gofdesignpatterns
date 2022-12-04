package gof.dp18;

public class Originator {
    private String name;

    public Originator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Memento save() {
        return new Memento(name);
    }

    public void restore(Object objMemento) {
        Memento memento = (Memento) objMemento;
        name = memento.getName();
    }
}