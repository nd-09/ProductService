package Decorator.Addons;

import Decorator.Breads.Bread;

public class Salads extends AddOns{
    public Salads(Bread b) {
        super(b);
        System.out.println("Salads with cost "+" " +cost+" " +"added");

    }
    private String description="All Salads added on top.";
    private int cost=10;

    @Override
    public String getDescription() {
        return b.getDescription()+description;
    }

    @Override
    public int getCost() {
        return b.getCost()+cost;
    }
}
