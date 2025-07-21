package creational.abstractfactory.uifactory;

import creational.abstractfactory.Button;
import creational.abstractfactory.CheckBox;

public interface UiFactory {

    Button createButton();
    CheckBox createCheckBox();
}
