package gof.dp15;

public class BinaryInterpreter implements Interpreter {
	public void interpret(Context context) {
		while (context.getInput().length() > 0) {
			int i = multiplier();
			if (context.getInput().endsWith(_0())) {
				context.setOutput(context.getOutput() + (0 * i));
			} else if (context.getInput().endsWith(_1())) {
				context.setOutput(context.getOutput() + (1 * i));
			} else
				throw new IllegalArgumentException();
			context.setInput(context.getInput().substring(0,
					context.getInput().length() - 1));
		}
	}

	public String _0() {
		return "0";
	}

	public String _1() {
		return "1";
	}

	static int i = 0;

	public int multiplier() {
		int multiplier = (int) Math.pow(2, i++);
		return multiplier;
	}
}