package Observer;

public interface Observer {
    void update(float temp, float humidity, float pressure);
    // here we can update only the required field as per the observers requirements since we pass the
    // changes made observer can utilize it as per their needs;
}
