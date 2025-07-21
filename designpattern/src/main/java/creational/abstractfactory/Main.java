package creational.abstractfactory;

import creational.abstractfactory.uifactory.MacUiFactory;

public class Main {

    public static void main(String[] args) {
        Application application = new Application(new MacUiFactory());
        application.paint();

    }
}
