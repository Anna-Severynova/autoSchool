package review.OOP.figure;

public class Square extends Figures {
    private double side;

    public Square(String figureName, int[] coordinates, int side) {
        super(figureName, coordinates);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    public String getParams() {
        return "Side = " + side;
    }
}