package gof.dp14;

public class DocumentInvoker {

	private Command command;

	public DocumentInvoker(Command command) {
		this.command = command;
	}

	public void invoke() {
		command.execute();
	}
}