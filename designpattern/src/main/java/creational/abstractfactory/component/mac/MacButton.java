package creational.abstractfactory.component.mac;

import creational.abstractfactory.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
