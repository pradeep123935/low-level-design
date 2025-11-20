package design_patterns.creational.singleton;

/*
 * It uses the volatile keyword to ensure that changes to the instance variable are immediately visible to other threads.
 * If the first check (instance == null) passes, we synchronize on the class object.
 * We check the same condition one more time because multiple threads may have passed the first check.
 * The instance is created only if both checks pass.
 * Although this method is a bit complex to implement, it can drastically reduce the performance overhead.
 */
public class DoubleCheckedSingleton {
    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {};

    public static DoubleCheckedSingleton getInstance() {
        if(instance == null) {
            synchronized(DoubleCheckedSingleton.class) {
                if(instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
