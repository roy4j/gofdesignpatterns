package gof.dp22;

public class AssamTea extends TeaTemplate {

	@Override
	public void addMilk() {
		System.out.println("Milk Powder Added");
	}

	@Override
	public void addSugar() {
		System.out.println("Sugar Cubes Added");
	}

	@Override
	public void addTeaLeaves() {
		System.out.println("Tea Leaves of Assam Added");
	}
}