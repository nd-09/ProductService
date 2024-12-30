package Factory;

public abstract class Platform {
    // Product Factory which utilizes my UiComponent Factory;
    public static Platform getPlatforn(String args){
        return PlatformFactory.getPlatform(args);
    }
    public abstract UiComponentFactory createUiComponentFactory();
}
