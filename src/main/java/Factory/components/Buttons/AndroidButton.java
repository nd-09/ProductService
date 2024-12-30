package Factory.components.Buttons;

public class AndroidButton extends Button{
    //This is Product class
    @Override
    public void create() {
        System.out.println("Android buttton created");
    }
}
