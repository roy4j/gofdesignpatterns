package gof.dp10;

import gof.dp10.decorators.Ice;
import gof.dp10.decorators.Sprinkles;
import gof.dp10.decorators.Sugar;
import gof.dp10.juice.Juice;
import gof.dp10.juice.SimpleJuice;

public class Main {
    public static void main(String[] args) {
        Juice c = new SimpleJuice();
        print(c);

        Sugar r = new Sugar(c);
        print(r);

        Ice m = new Ice(r);
        print(m);

        Sprinkles s = new Sprinkles(m);
        print(s);

        // double Sprinkles
        Sprinkles s1 = new Sprinkles(s);
        print(s1);
    }

    public static void print(Juice c) {
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
    }
}