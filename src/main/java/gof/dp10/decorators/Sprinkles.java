package gof.dp10.decorators;

import gof.dp10.juice.Juice;

public class Sprinkles extends JuiceDecorator {
    public Sprinkles(Juice decoratedJuice) {
        super(decoratedJuice);
        cost += 3;
        ingredients.add("Sprinkles(3)");
    }
}