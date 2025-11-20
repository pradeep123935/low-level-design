package design_patterns.creational.singleton;

/*
 * This is similar to eager initialization, but the instance is created in a static block.
 * It provides the ability to handle exceptions during instance creation, which is not possible with simple eager initialization.
 * The static block is executed when the class is loaded by the JVM.
 * If an exception occurs, it's wrapped in a RuntimeException.
 * It is thread safe but not lazy-loaded, which might be a drawback if the initialization is resource-intensive or time-consuming.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {};

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch(Exception ex) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
