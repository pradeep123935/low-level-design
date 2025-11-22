public class MacOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting MacOs Button");
    }

    @Override
    public void onClick() {
        System.out.println("MacOs Button Clicked");
    }
}