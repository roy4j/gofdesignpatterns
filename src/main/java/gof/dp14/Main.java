package gof.dp14;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        Command displayCmd = new DisplayCommand(doc);
        Command printCmd = new PrintCommand(doc);
        DocumentInvoker invoker;

        invoker = new DocumentInvoker(displayCmd);
        System.out.print("display > ");
        invoker.invoke();

        invoker = new DocumentInvoker(printCmd);
        System.out.print("print > ");
        invoker.invoke();
    }
}