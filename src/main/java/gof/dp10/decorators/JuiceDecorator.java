package gof.dp10.decorators;

import gof.dp10.juice.Juice;

import java.util.ArrayList;
import java.util.List;

abstract public class JuiceDecorator implements Juice {
    protected int cost;
    protected List<String> ingredients = new ArrayList<>();

    public JuiceDecorator(Juice decoratedJuice) {
        this.cost = decoratedJuice.getCost();
        this.ingredients.addAll(decoratedJuice.getIngredients());
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }
}