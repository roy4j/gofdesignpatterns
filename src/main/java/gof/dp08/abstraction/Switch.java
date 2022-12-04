package gof.dp08.abstraction;

import gof.dp08.implementation.Equipment;

public abstract class Switch {
    protected Equipment equipment;

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public abstract void on();

    public abstract void off();
}