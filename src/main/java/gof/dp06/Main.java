package gof.dp06;

public class Main {
	public static void main(String[] args) {
		Robot robotOne = new ProxyRobot();
		Robot robotTwo = new ProxyRobot();
		System.out.println("ProxyRobot objects created");
		robotOne.talk("Robot 1: Hello!");
		robotTwo.talk("Robot 2: Hi");
		robotOne.talk("Robot 1: How are you?");
		robotTwo.talk("Robot 2: I'm fine, thanks. What about you?");
		robotOne.talk("Robot 1: Fine. Nice to meet you.");
	}
}