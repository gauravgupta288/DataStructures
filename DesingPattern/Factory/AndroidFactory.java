package DesingPattern.Factory;

import DesingPattern.Factory.Componenets.AndroidButton;
import DesingPattern.Factory.Componenets.Button;

public class AndroidFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
