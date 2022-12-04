package gof.dp08.implementation;

public class Bulb implements Equipment {

    @Override
    public void start() {
        System.out.println("Starting the Bulb");
    }

    @Override
    public void stop() {
        System.out.println("Stoping the Bulb");
    }
}