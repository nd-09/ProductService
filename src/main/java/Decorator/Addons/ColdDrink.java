package Decorator.Addons;

import Decorator.Breads.Bread;

public class ColdDrink extends AddOns{
    private String description="1 Cold Drink added.";
    private int cost=70;
    public ColdDrink(Bread b) {
        super(b);
        System.out.println("Cold Drink with cost "+" " + cost+" " +"added");

    }

    @Override
    public String getDescription() {
        return b.getDescription()+description;
    }

    @Override
    public int getCost() {
        return b.getCost()+cost;
    }
}
