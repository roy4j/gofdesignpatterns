package gof.dp08.abstraction;

public class WallSwitch extends Switch {

    @Override
    public void on() {
        System.out.print("WallSwitch ");
        equipment.start();
    }

    @Override
    public void off() {
        System.out.print("WallSwitch ");
        equipment.stop();
    }
}