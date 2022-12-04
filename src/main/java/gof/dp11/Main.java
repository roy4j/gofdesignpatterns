package gof.dp11;

public class Main {
	public static void main(String[] args) {
		EmployeeRelease facade = new EmployeeRelease();
		boolean status = facade.releaseEmployee("EMP1234");
		if (status)
			System.out.println("Released");
		else
			System.out.println("One or more clearances are pending");
	}
}