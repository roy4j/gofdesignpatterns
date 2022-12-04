package gof.dp12;

import java.util.ArrayList;

public class Main {
    static ArrayList<FlyweightContext> contexts = new ArrayList<>();
    static ArrayList<ConcreteFlyweight> flyweights = new ArrayList<>();
    static FlyweightFactory flyweightFactory;

    static void useFlyweight(String flyweightName, String place) {
        contexts.add(new FlyweightContext(place));
        flyweights.add(flyweightFactory.getFlyweight(flyweightName));
    }

    public static void main(String[] args) {
        flyweightFactory = new FlyweightFactory();

        useFlyweight("Mercedes", "J. M. Road");
        useFlyweight("Mercedes", "J. M. Road");
        useFlyweight("Ford", "F. C. Road");
        useFlyweight("Ford", "F. C. Road");
        useFlyweight("Mercedes", "Karve Road");
        useFlyweight("Honda", "J. M. Road");
        useFlyweight("Mercedes", "S. V. Road");
        useFlyweight("Ford", "Karve Road");
        useFlyweight("Honda", "Paud Road");
        useFlyweight("Mercedes", "Tilak Road");
        useFlyweight("Honda", "Karve Road");
        useFlyweight("Ford", "Satara Road");
        useFlyweight("Ford", "Dehu Road");
        useFlyweight("Honda", "Dehu Road");
        useFlyweight("Ford", "S. B. Road");

        for (int i = 0; i < flyweights.size(); i++) {
            flyweights.get(i).doAction(contexts.get(i));
        }

        System.out.println("Total Cars: " + contexts.size());
        System.out.println("Total Objects: " + flyweightFactory.getCount());
    }
}