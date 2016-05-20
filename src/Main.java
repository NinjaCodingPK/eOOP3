/**
 * Created by wookie on 5/20/16.
 */
import entities.*;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(1, 1, 3);
        Circle clone = (Circle) shape.clone();
        clone.setRadius(10);
        System.out.println(shape);
        System.out.println(clone);

        shape = new Rectangle(1, 1, 2, 2);
        Rectangle anotherClone = (Rectangle) shape.clone();
        anotherClone.setLeftTop(new Point(10, 10));
        System.out.println(shape);
        System.out.println(anotherClone);


    }
}
