public class AppLauncher {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        GUIFactory factory;

        if (os.contains("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOsFactory();
        }

        Application app = new Application(factory);
        app.render();
    }
}
