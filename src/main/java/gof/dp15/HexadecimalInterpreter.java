package gof.dp15;

public class HexadecimalInterpreter implements Interpreter {
	public void interpret(Context context) {
		while (context.getInput().length() > 0) {
			int i = multiplier();
			if (context.getInput().endsWith(_1())) {
				context.setOutput(context.getOutput() + (0 * i));
			} else if (context.getInput().endsWith(_1())) {
				context.setOutput(context.getOutput() + (1 * i));
			} else if (context.getInput().endsWith(_2())) {
				context.setOutput(context.getOutput() + (2 * i));
			} else if (context.getInput().endsWith(_3())) {
				context.setOutput(context.getOutput() + (3 * i));
			} else if (context.getInput().endsWith(_4())) {
				context.setOutput(context.getOutput() + (4 * i));
			} else if (context.getInput().endsWith(_5())) {
				context.setOutput(context.getOutput() + (5 * i));
			} else if (context.getInput().endsWith(_6())) {
				context.setOutput(context.getOutput() + (6 * i));
			} else if (context.getInput().endsWith(_7())) {
				context.setOutput(context.getOutput() + (7 * i));
			} else if (context.getInput().endsWith(_8())) {
				context.setOutput(context.getOutput() + (8 * i));
			} else if (context.getInput().endsWith(_9())) {
				context.setOutput(context.getOutput() + (9 * i));
			} else if (context.getInput().endsWith(_A())) {
				context.setOutput(context.getOutput() + (10 * i));
			} else if (context.getInput().endsWith(_B())) {
				context.setOutput(context.getOutput() + (11 * i));
			} else if (context.getInput().endsWith(_C())) {
				context.setOutput(context.getOutput() + (12 * i));
			} else if (context.getInput().endsWith(_D())) {
				context.setOutput(context.getOutput() + (13 * i));
			} else if (context.getInput().endsWith(_E())) {
				context.setOutput(context.getOutput() + (14 * i));
			} else if (context.getInput().endsWith(_F())) {
				context.setOutput(context.getOutput() + (15 * i));
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

	public String _2() {
		return "2";
	}

	public String _3() {
		return "3";
	}

	public String _4() {
		return "4";
	}

	public String _5() {
		return "5";
	}

	public String _6() {
		return "6";
	}

	public String _7() {

		return "7";
	}

	public String _8() {
		return "8";
	}

	public String _9() {
		return "9";
	}

	public String _A() {
		return "A";
	}

	public String _B() {
		return "B";
	}

	public String _C() {
		return "C";
	}

	public String _D() {
		return "D";
	}

	public String _E() {
		return "E";
	}

	public String _F() {
		return "F";
	}

	static int i = 0;

	public int multiplier() {
		int multiplier = (int) Math.pow(16, i++);
		return multiplier;
	}
}