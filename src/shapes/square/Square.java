package shapes.square;

import shapes.IShape;

public class Square implements IShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    /**
     * Formula for calculating the area of a square:
     * area = side * side
     * */
    @Override
    public double getArea() {
        return side * side;
    }

}