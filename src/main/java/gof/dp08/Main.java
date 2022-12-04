package gof.dp08;

import gof.dp08.abstraction.BedSwitch;
import gof.dp08.abstraction.Switch;
import gof.dp08.abstraction.WallSwitch;
import gof.dp08.implementation.Bulb;
import gof.dp08.implementation.Fan;

public class Main {
    public static void main(String[] args) {
        Switch aSwitch = new BedSwitch();
        aSwitch.setEquipment(new Fan());
        doAction(aSwitch);

        aSwitch = new WallSwitch();
        aSwitch.setEquipment(new Bulb());
        doAction(aSwitch);
    }

    public static void doAction(Switch aSwitch) {
        aSwitch.on();
        aSwitch.off();
    }
}