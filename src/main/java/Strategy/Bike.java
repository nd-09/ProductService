package Strategy;

public class Bike implements PathCalculator{
    @Override
    public void findPath() {
        System.out.println("Calculating shortest path for Bike");
    }
}
