package Strategy;

public class Walk implements PathCalculator {
    @Override
    public void findPath() {
        System.out.println("Calculating shortest path while Walking");
    }
}
