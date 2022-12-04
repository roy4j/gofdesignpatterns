package gof.dp22;

public class Main {
    public static void main(String[] args) {

        TeaTemplate tea1 = new DarjeelingTea();
        tea1.prepare();

        System.out.println();

        TeaTemplate tea2 = new AssamTea();
        tea2.prepare();
    }
}