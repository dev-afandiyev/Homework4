import competitions.Competitions;
import shapes.calculator.AreaShapesCalculator;

public class Main {

    public static void main(String[] args) {
        AreaShapesCalculator calculator = new AreaShapesCalculator();
        calculator.getShapesArea();

        Competitions competitions = new Competitions();
        competitions.getCompetitionResults();
    }

}