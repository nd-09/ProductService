package Factory.components.Buttons;

public class IosButton extends Button {
    //This is product class
    @Override
    public void create() {
        System.out.println("Ios Button created");
    }
}
