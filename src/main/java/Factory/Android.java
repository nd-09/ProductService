package Factory;

public class Android extends Platform{
    @Override
    public UiComponentFactory createUiComponentFactory() {
        return new AndroidComponentFactory();
    }
}
