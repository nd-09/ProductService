package Factory.components.Dropdowns;

public class AndroidDropdown extends Dropdown {
    //This is product class
    @Override
    public void create() {
        System.out.println("Android Dropdown created");
    }
}
