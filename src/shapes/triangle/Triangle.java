package shapes.triangle;

import shapes.IShape;

public class Triangle implements IShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * The formula for the area of a shapes.triangle is:
     * Area = 0.5 * base * height
     * */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

}