package gof.dp13;

public class President implements Responsibility {

	private Responsibility boss;

	public President() {
		boss = null;
	}

	@Override
	public void handleRequest(Request request) {
		if (request.getRange() < 30000)
			System.out.println("President will approve the request");
		else
			System.out.println("Request out of range");
	}
}