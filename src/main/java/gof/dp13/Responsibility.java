package gof.dp13;

@FunctionalInterface
public interface Responsibility {
	void handleRequest(Request request);
}