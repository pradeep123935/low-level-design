package design_patterns.creational.singleton;

/*
 * This implementation is not thread-safe. If multiple threads call getInstance() simultaneously when instance is null, it's possible to create multiple instances.
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    };

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
