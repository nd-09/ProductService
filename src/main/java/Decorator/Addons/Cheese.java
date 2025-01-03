package Decorator.Addons;

import Decorator.Breads.Bread;

public class Cheese extends AddOns{
    private String description="Added extra Cheese.";
    private int cost=20;

    public Cheese(Bread b) {
        super(b);
        System.out.println("Cheese with cost "+" " + cost+" " +"added");

    }

    @Override
    public String getDescription() {
        return b.getDescription()+description;
    }

    public int getCost() {
        return b.getCost()+cost;
    }
}
