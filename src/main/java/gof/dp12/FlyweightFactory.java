package gof.dp12;

import java.util.ArrayList;
import java.util.List;

public class FlyweightFactory {
    List<ConcreteFlyweight> flyweightPool = new ArrayList<>();

    public ConcreteFlyweight getFlyweight(String name) {
        for (ConcreteFlyweight flyweight : flyweightPool) {
            if (name.equals(flyweight.getName())) {
                return flyweight;
            }
        }
        ConcreteFlyweight concreteFlyweight = new ConcreteFlyweight(name);
        flyweightPool.add(concreteFlyweight);
        return concreteFlyweight;
    }

    public int getCount() {
        return flyweightPool.size();
    }
}