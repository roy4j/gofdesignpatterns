package gof.dp20;

public class White implements State {

	@Override
	public void alterState(StateContext stateContext) {
		whiteTask();
		stateContext.setState(new Black());
	}

	public void whiteTask() {
		System.out.println("White to move");
	}
}