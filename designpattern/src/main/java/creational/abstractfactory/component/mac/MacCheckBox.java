package creational.abstractfactory.component.mac;

import creational.abstractfactory.CheckBox;

public class MacCheckBox implements  CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac check box");
    }
}
