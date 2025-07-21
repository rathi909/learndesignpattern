package creational.abstractfactory.component.win;

import creational.abstractfactory.Button;

public class WindowButton implements Button {
    @Override
    public void paint() {
        System.out.println("WindowButton");
    }
}
