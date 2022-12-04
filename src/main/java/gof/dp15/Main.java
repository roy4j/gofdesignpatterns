package gof.dp15;

public class Main {
	public static void main(String[] args) {
		translate("1011", new BinaryInterpreter());
		// System.out.println(Integer.toBinaryString(11));
		translate("FFFFFF", new HexadecimalInterpreter());
		// System.out.println(Integer.toHexString(16777215).toUpperCase());
	}

	public static void translate(String text, Interpreter interpreter) {
		synchronized (Context.class) {
			Context context = new Context(text);
			interpreter.interpret(context);
			System.out.println(text + " = " + context.getOutput());
		}
	}
}