package Decorator.Breads;

public class MultiGrainBread implements Bread{
    private String description="Multigrain baked Bread.";
    private int cost=260;


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
