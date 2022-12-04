package gof.dp13;

public class Manager implements Responsibility {

	private Responsibility boss;

	public Manager() {
		boss = new Director();
	}

	@Override
	public void handleRequest(Request request) {
		if (request.getRange() < 10000)
			System.out.println("Manager will approve the request");
		else if (boss != null)
			boss.handleRequest(request);
		else
			System.out.println("Invalid request");
	}
}