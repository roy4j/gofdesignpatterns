package gof.dp20;

public class Black implements State {

	@Override
	public void alterState(StateContext stateContext) {
		blackTask();
		stateContext.setState(new White());
	}

	public void blackTask() {
		System.out.println("Black to move");
	}
}