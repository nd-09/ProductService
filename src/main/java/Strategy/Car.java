package Strategy;

public class Car implements PathCalculator{
    @Override
    public void findPath() {
        System.out.println("Calculating shortest path for Car");
    }
}
