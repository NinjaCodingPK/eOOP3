package entities;

/**
 * Created by wookie on 5/20/16.
 */
public abstract class Shape implements Cloneable {
    public abstract double square();
    public abstract double perimeter();
    public abstract void move(double dx, double dy);

    @Override
    public String toString() {
        return " perimeter = " + perimeter() +" square = " +square();
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
