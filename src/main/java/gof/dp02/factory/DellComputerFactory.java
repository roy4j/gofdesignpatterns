package gof.dp02.factory;

import gof.dp02.product.Computer;
import gof.dp02.product.motherboard.AsusMotherboard;
import gof.dp02.product.processor.AMDProcessor;
import gof.dp02.product.ram.KingstoneRAM;

public class DellComputerFactory implements AbstractComputerFactory {

	@Override
	public Computer getComputer() {
		Computer computer = new Computer();
		computer.setProcessor(new AMDProcessor());
		computer.setMotherboard(new AsusMotherboard());
		computer.setRam(new KingstoneRAM());
		return computer;
	}
}