package Factory;

public class Ios extends Platform{
    @Override
    public UiComponentFactory createUiComponentFactory() {
        return new IosComponentFactory();
    }
}
