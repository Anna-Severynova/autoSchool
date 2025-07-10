package review.OOP.figure;

public class Square extends Figures {
    private double side;

    public Square(String figureName, int[] coordinates, int side) {
        super(figureName, coordinates);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        System.out.println("Side of the square: " + side);
        return side * side;
    }
}