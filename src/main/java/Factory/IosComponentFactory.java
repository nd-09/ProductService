package Factory;

import Factory.components.Buttons.Button;
import Factory.components.Buttons.IosButton;
import Factory.components.Dropdowns.Dropdown;
import Factory.components.Dropdowns.IosDropdown;
import Factory.components.Menus.IosMenu;
import Factory.components.Menus.Menu;

public class IosComponentFactory implements UiComponentFactory{
 // This is a concrete implementation of my Factory
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
