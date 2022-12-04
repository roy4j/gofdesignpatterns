package gof.dp14;

public class DisplayCommand implements Command {

	private Document document;

	public DisplayCommand(Document document) {
		this.document = document;
	}

	public void execute() {
		document.display();
	}
}