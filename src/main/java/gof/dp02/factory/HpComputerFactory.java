package gof.dp02.factory;

import gof.dp02.product.Computer;
import gof.dp02.product.motherboard.GigabyteMotherboard;
import gof.dp02.product.processor.IntelProcessor;
import gof.dp02.product.ram.ZeonRAM;

public class HpComputerFactory implements AbstractComputerFactory {

	@Override
	public Computer getComputer() {
		Computer computer = new Computer();
		computer.setProcessor(new IntelProcessor());
		computer.setMotherboard(new GigabyteMotherboard());
		computer.setRam(new ZeonRAM());
		return computer;
	}
}