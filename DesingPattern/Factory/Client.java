package DesingPattern.Factory;

import DesingPattern.Factory.Componenets.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        UIFactory uiFactory = flutter.getUiFactory(SupportedPlatform.IOS);

        Button button = uiFactory.createButton();

        button.click();;
    }
}
