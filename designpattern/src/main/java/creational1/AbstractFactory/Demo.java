package creational1.AbstractFactory;

public class Demo {
    public static void main(String[] args) {
        GuiFactory factory = new WindowFactory();
        factory.createButton();
        /*
        Client
        |
   GUIFactory
       |
 ------------------------
|                      |
WindowsFactory     MacFactory
         */

    }
}
