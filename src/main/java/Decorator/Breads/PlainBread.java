package Decorator.Breads;

public class PlainBread implements Bread{
    private String description="Simply baked plain Bread.";
    private int cost=250;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
