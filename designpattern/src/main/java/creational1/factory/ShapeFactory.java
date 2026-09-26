package creational1.factory;

public class ShapeFactory {

    public Shape getShape(String shape)
    {

        if(shape.equals("Rectangle"))
        {
            return new Rectangle();
        }
        if(shape.equals("Sqaure"))
        {
            return new Square();
        }
        return null;
    }
}
