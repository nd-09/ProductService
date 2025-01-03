package Decorator.Breads;

public class ParmesianOreganoBread implements Bread {
    private String description="Parmesian bread baked with Oregano.";
    private int cost=270;


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
