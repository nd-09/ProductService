package Strategy;

public class Client {
    public static void main(String[] args) {
      GoogleMaps gg= new GoogleMaps();
      gg.findPathByMode(TravelMode.Walk);
    }
}
