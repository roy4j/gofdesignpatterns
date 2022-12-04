package gof.dp20;

// Context
public class StateContext {
	// Encapsulates State which has access to Context
	private State state;

	public StateContext() {
		setState(new White());
	}

	public void setState(State state) {
		this.state = state;
	}

	public void resetState() {
		state.alterState(this);
	}
}