package gof.dp06;

public class RealRobot implements Robot {
	RealRobot() {
		System.out.println("RealRobot Constructor called");
	}

	public void talk(String msg) {
		System.out.println(msg);
	}
}