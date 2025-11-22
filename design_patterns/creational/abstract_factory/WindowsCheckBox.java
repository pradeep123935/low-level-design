public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Painting Windows Checkbox");
    }

    @Override
    public void onSelect() {
        System.out.println("Windows Checkbox Selected");
    }
}