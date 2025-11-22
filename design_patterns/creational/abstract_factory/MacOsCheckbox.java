public class MacOsCheckbox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Painting MacOs Checkbox");
    }

    @Override
    public void onSelect() {
        System.out.println("MacOs Checkbox Selected");
    }
}