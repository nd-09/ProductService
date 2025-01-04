package Strategy;

public class PathCalculatorFactory {
    public static PathCalculator createPath(TravelMode path){
        switch (path){
            case Bike:
                return new Bike();
            case Walk:
                return new Walk();
            default:
                return new Car();
        }
    }
}
