package design_patterns.creational.singleton;

/*
 * In this method, the singleton is declared as an enum rather than a class.
 * Java ensures that only one instance of an enum value is created, even in a multithreaded environment.
 * The Enum Singleton pattern is the most robust and concise way to implement a singleton in Java.
 * It may not always be suitable especially if you need to extend a class or if lazy initialization is a strict requirement.
 */
public enum EnumSingleton {
    INSTANCE;

    // Public method
    public void doSomething() {
        // Add any singleton logic here
    }
}
