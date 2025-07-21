package creational.abstractfactory.uifactory;

import creational.abstractfactory.Button;
import creational.abstractfactory.CheckBox;
import creational.abstractfactory.component.win.WindowButton;
import creational.abstractfactory.component.win.WindowCheckBox;

public class WindowUiFactory implements UiFactory {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();
    }
}
