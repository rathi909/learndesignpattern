package creational.abstractfactory;

import creational.abstractfactory.uifactory.UiFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(UiFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }

}
