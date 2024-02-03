package DesingPattern.Factory;

import DesingPattern.Factory.Componenets.Button;
import DesingPattern.Factory.Componenets.IOSButton;

public class IOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
