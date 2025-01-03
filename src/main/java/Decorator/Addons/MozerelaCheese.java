package Decorator.Addons;

import Decorator.Breads.Bread;

public class MozerelaCheese extends AddOns{
    public MozerelaCheese(Bread b) {
        super(b);
        System.out.println("Mozerela Cheese with cost "+" " + cost+" " +"added");

    }
    private String description="Mozerela Cheese added.";
    private int cost=40;

    @Override
    public String getDescription() {
        return b.getDescription()+description;
    }

    @Override
    public int getCost() {
        return b.getCost()+cost;
    }
}
