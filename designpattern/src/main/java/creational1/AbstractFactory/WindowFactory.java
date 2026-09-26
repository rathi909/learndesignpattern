package creational1.AbstractFactory;

public class WindowFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
