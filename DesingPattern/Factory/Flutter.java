package DesingPattern.Factory;

public class Flutter {
    void refreshUi(){
        System.out.println("Refreshing UI");
    }

    void setTheme(){
        System.out.println("Setting theme");
    }

    public UIFactory getUiFactory(SupportedPlatform platform){
        return UIFactoryFactory.getFactoryObject(platform);
    }
}
