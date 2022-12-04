package gof.dp10.decorators;

import gof.dp10.juice.Juice;

public class Sugar extends JuiceDecorator {
    public Sugar(Juice decoratedJuice) {
        super(decoratedJuice);
        cost += 2;
        ingredients.add("Sugar(2)");
    }

}