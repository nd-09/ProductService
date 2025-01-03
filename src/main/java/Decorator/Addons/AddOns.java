package Decorator.Addons;

import Decorator.Breads.Bread;

public abstract class AddOns implements Bread {
    Bread b;
    public AddOns(Bread b) {
        this.b = b;
    }
    public abstract int getCost();
    public abstract String getDescription();
}
