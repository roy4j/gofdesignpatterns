package gof.dp02.factory;

public class FactorySelector {

	public static AbstractComputerFactory getFactory(String name) {
		if (name.equals("Lenovo"))
			return new LenovoComputerFactory();
		if (name.equals("Dell"))
			return new DellComputerFactory();
		if (name.equals("Hp"))
			return new HpComputerFactory();
		return null;
	}
}
