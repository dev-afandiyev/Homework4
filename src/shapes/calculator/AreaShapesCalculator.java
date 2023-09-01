package shapes.calculator;

import shapes.IShape;
import shapes.circle.Circle;
import shapes.square.Square;
import shapes.triangle.Triangle;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class AreaShapesCalculator {

    private IShape[] shapesArray = {
            new Circle(5.0),
            new Triangle(4.0, 6.0),
            new Square(7.0)
    };

    public void getShapesArea() {
        System.out.println("The sum of the areas of all shapes = " + calculateTotalArea(shapesArray) + "\n");
    }

    private double calculateTotalArea(IShape[] shapes) {
        double totalArea = 0.0;

        for (IShape shape : shapes) {
            totalArea += shape.getArea();
        }

        // Round value to one decimal value
        DecimalFormat df = new DecimalFormat("#.#", new DecimalFormatSymbols(Locale.US));
        return Double.parseDouble(df.format(totalArea));
    }

}
