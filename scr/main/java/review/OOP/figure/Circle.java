package review.OOP.figure;

public class Circle extends Figures {
    private int radius;

    public Circle(String figureName, int[] coordinates, int radius) {
        super(figureName, coordinates);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        System.out.println("Side of the Square: " + radius);
        return 3.14 * (radius * radius);
    }
}