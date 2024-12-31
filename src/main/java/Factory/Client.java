package Factory;

import Factory.components.Buttons.Button;
import Factory.components.Dropdowns.Dropdown;

public class Client {
    public static void main(String[] args) {
     Platform p =Platform.getPlatforn("Android");
     UiComponentFactory ui = p.createUiComponentFactory();
        Button b = ui.createButton();
        Dropdown d= ui.createDropdown();
        b.create();
        d.create();
    }
}
