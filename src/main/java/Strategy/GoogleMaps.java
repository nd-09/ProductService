package Strategy;

public class GoogleMaps{
    public void findPathByMode(TravelMode mode){
      PathCalculator p = PathCalculatorFactory.createPath(mode);
      p.findPath();
    }
}
