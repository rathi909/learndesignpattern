package creational.abstractfactory.component.win;

import creational.abstractfactory.CheckBox;

public class WindowCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Window check Box");
    }
}
