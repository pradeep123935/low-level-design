package design_patterns.creational.singleton;

/*
 * Although this approach is straightforward, using synchronized can cause substantial overhead and reduce performance, which can be a bottleneck if called frequently.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {};

    public static synchronized ThreadSafeSingleton getInstance() {
        if(instance!=null) {
            instance =  new ThreadSafeSingleton();
        }
        return instance;
    }
}
