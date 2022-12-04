package gof.dp10.decorators;

import gof.dp10.juice.Juice;

public class Ice extends JuiceDecorator {
    public Ice(Juice decoratedJuice) {
        super(decoratedJuice);
        cost += 1;
        ingredients.add("Ice(1)");
    }

}