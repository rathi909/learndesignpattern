package creational1.factory;

import creational1.Main;

public class ClientDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("Rectangle").draw();
    }
}
