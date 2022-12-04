package gof.dp04;

@SuppressWarnings("static-access")
public class Main {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                EagerSingleton es = null;
                LazySingleton ls = null;
                for (int i = 0; i < 5; i++) {
                    es = EagerSingleton.getInstance();
                    Thread.currentThread().yield();
                    ls = LazySingleton.getInstance();
                }
                System.out.println("E count: " + es.getCount());
                System.out.println("L count: " + ls.getCount());
            }
        };
        Thread t = new Thread(r);
        t.start();
        EagerSingleton es = null;
        LazySingleton ls = null;
        for (int i = 0; i < 5; i++) {
            es = EagerSingleton.getInstance();
            Thread.currentThread().yield();
            ls = LazySingleton.getInstance();
        }
        System.out.println("E count=" + es.getCount());
        System.out.println("L count=" + ls.getCount());
    }
}