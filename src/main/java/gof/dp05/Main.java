package gof.dp05;

public class Main {

    public static final void main(String[] arguments) {
        BankAccount bankAccount1 = new BankAccount("Original");
        print(bankAccount1.getName(), bankAccount1.hashCode());

        BankAccount bankAccount2 = (BankAccount) bankAccount1.duplicate();
        print(bankAccount2.getName(), bankAccount2.hashCode());

        BankAccount bankAccount3 = (BankAccount) bankAccount1.duplicate();
        print(bankAccount3.getName(), bankAccount3.hashCode());
     }

    private static void print(String name, int hashCode) {
        System.out.println(name + " : " + hashCode);
    }
}