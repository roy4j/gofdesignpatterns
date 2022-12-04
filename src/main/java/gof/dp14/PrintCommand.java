package gof.dp14;

public class PrintCommand implements Command {

	private Document document;

	public PrintCommand(Document document) {
		this.document = document;
	}

	public void execute() {
		document.print();
	}
}