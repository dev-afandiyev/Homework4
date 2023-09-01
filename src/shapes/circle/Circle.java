package circle;

import shape.IShape;

public class Circle implements IShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Math.PI is a constant that represents the value of the number π
     * Area = π * r^2
     * */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
