package structural.adaptor.Flyweight;

import java.util.*;

class Circle {

    private String color;

    Circle(String color) {
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.println(
            "Circle " + color +
            " at " + x + "," + y
        );
    }
}


class CircleFactory {

    private static Map<String, Circle> circles =
            new HashMap<>();
    public static Circle getCircle(String color) {
        if(!circles.containsKey(color)) {
            circles.put(color, new Circle(color));
        }

        return circles.get(color);
    }
}


// Client
public class FlyweightDemo {

    public static void main(String[] args) {

        Circle c1 =
            CircleFactory.getCircle("Red");

        Circle c2 =
            CircleFactory.getCircle("Red");

        c1.draw(10,20);
        c2.draw(30,40);

        System.out.println(c1 == c2);
    }
}
