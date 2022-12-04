package gof.dp02;

import gof.dp02.factory.AbstractComputerFactory;
import gof.dp02.factory.FactorySelector;

public class Main {

    public static void main(String[] args) {
        AbstractComputerFactory computerFactory = FactorySelector.getFactory("Lenovo");
        System.out.println("Lenovo: " + computerFactory.getComputer());

        computerFactory = FactorySelector.getFactory("Dell");
        System.out.println("Dell: " + computerFactory.getComputer());

        computerFactory = FactorySelector.getFactory("Hp");
        System.out.println("Hp: " + computerFactory.getComputer());
    }
}