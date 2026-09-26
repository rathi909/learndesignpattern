package creational1.AbstractFactory;

public class MacFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
