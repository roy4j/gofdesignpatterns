package gof.dp10.juice;

import java.util.Arrays;
import java.util.List;

public class SimpleJuice implements Juice {
    @Override
    public int getCost() {
        return 2;
    }

    @Override
    public List<String> getIngredients() {
        return Arrays.asList("Fruit(2)");
    }
}