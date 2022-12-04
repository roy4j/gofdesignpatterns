package gof.dp22;

public class DarjeelingTea extends TeaTemplate {

	@Override
	public void addMilk() {
		System.out.println("Cow Milk Added");
	}

	@Override
	public void addTeaLeaves() {
		System.out.println("Tea Leaves of Darjeeling Added");
	}
}