package gof.dp05;

public class BankAccount implements Prototype {
	private String name;

	public BankAccount(String name) {
		System.out.println("BankAccount object created");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public Object duplicate() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}