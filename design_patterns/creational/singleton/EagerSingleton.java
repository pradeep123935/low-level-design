package design_patterns.creational.singleton;

/*
 * In this method, we rely on the JVM to create the singleton instance when the class is loaded. The JVM guarantees that the instance will be created before any thread access the instance variable.
 * static variable ensures there's only one instance shared across all instances of the class.
 * final prevents the instance from being reassigned after initialization.
 * This approach is suitable if your application always creates and uses the singleton instance, or the overhead of creating it is minimal.
 * While it is inherently thread-safe, it could potentially waste resources if the singleton instance is never used by the client application.
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
