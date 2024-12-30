package Factory.components.Menus;

public class AndroidMenu extends Menu {
    //This is product class
    @Override
    public void create() {
        System.out.println("Android menu created");
    }
}
