package Factory.components.Menus;

public class IosMenu extends Menu{
    //This is product class
    @Override
    public void create() {
        System.out.println("Ios Menu created");
    }
}
