package gof.dp08.abstraction;

public class BedSwitch extends Switch {

    @Override
    public void on() {
        System.out.print("BedSwitch ");
        equipment.start();
    }

    @Override
    public void off() {
        System.out.print("BedSwitch ");
        equipment.stop();
    }
}