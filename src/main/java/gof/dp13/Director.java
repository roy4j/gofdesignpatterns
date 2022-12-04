package gof.dp13;

public class Director implements Responsibility {

	private Responsibility boss;

	public Director() {
		boss = new President();
	}

	@Override
	public void handleRequest(Request request) {
		if (request.getRange() < 20000)
			System.out.println("Director will approve the request");
		else if (boss != null)
			boss.handleRequest(request);
		else
			System.out.println("Invalid request");
	}
}