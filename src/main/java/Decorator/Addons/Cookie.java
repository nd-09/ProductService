package Decorator.Addons;

import Decorator.Breads.Bread;

public class Cookie extends AddOns{
    public Cookie(Bread b){
        super(b);
        System.out.println("Cookie with cost "+" " + cost+" " +"added");

    }
    private String description="1 Cookie added.";
    private int cost=30;

    @Override
    public String getDescription() {
        return b.getDescription()+description;
    }
    public int getCost() {
        return b.getCost()+cost;
    }
}
