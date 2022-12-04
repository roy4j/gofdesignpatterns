package gof.dp08.implementation;

public class Fan implements Equipment {

    @Override
    public void start() {
        System.out.println("Starting the Fan");
    }

    @Override
    public void stop() {
        System.out.println("Stoping the Fan");
    }
}