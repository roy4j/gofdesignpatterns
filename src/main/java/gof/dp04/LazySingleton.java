package gof.dp04;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LazySingleton implements Serializable {
    private static LazySingleton _instance;
    private static int count;

    // protection against instantiation
    private LazySingleton() {
        System.out.println("LazySingleton created");
        count++;
    }

    public static final LazySingleton getInstance() {
        if (_instance == null) {
            synchronized (LazySingleton.class) {
                _instance = new LazySingleton();
            }
        }
        System.out.println("LazySingleton " + count);
        return _instance;
    }

    public int getCount() {
        return count;
    }

    // protection against serialization
    protected Object readResolve() {
        return getInstance();
    }

    // protection against cloning
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}