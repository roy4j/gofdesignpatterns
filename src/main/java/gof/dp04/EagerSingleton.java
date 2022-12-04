package gof.dp04;

public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();
    private static int count;

    private EagerSingleton() {
        System.out.println("EagerSingleton created");
        count++;
    }

    public static final EagerSingleton getInstance() {
        System.out.println("EagerSingleton " + count);
        return INSTANCE;
    }

    public int getCount() {
        return count;
    }
}