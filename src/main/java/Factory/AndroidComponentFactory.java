package Factory;

import Factory.components.Buttons.AndroidButton;
import Factory.components.Buttons.Button;
import Factory.components.Dropdowns.AndroidDropdown;
import Factory.components.Dropdowns.Dropdown;
import Factory.components.Menus.AndroidMenu;
import Factory.components.Menus.Menu;

public class AndroidComponentFactory implements UiComponentFactory {
    //This is a concrete implementation of my factory
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
