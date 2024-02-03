package DesingPattern.Factory;

public class UIFactoryFactory {
    public static UIFactory getFactoryObject(SupportedPlatform platform){
        if(platform.equals(SupportedPlatform.ANDROID)){
            return new AndroidFactory();
        }
        else if(platform.equals(SupportedPlatform.IOS)){
            return new IOSFactory();
        }

        return null;
    }
}
