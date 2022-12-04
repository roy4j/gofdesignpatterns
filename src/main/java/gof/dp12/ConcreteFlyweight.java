package gof.dp12;

public class ConcreteFlyweight implements Flyweight {
    String name;

    ConcreteFlyweight(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void doAction(FlyweightContext context) {
        print(name, context.getPlace());
    }

    public void print(String a, String b) {
        int padA = 10 - a.trim().length();
        for (int i = 0; i < padA; i++) {
            a = a + " ";
        }
        System.out.println(a + " running on   " + b);
    }
}