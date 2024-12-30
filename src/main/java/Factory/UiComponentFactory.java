package Factory;

import Factory.components.Buttons.Button;
import Factory.components.Dropdowns.Dropdown;
import Factory.components.Menus.Menu;

public interface UiComponentFactory {

    // This is a Factory for my products (i.e. different components)
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
}
