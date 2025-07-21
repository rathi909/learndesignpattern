package creational.abstractfactory.uifactory;

import creational.abstractfactory.Button;
import creational.abstractfactory.CheckBox;
import creational.abstractfactory.component.mac.MacButton;
import creational.abstractfactory.component.mac.MacCheckBox;

public class MacUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
