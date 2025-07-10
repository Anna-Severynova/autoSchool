package review.OOP.figure;

public class Triangle extends Figures {
    private double base;
    private double height;

    public Triangle(String figureName, int[] coordinates, double base, double height) {
        super(figureName, coordinates);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        System.out.println("Base of the Triangle: " + base);
        System.out.println("Height of the Triangle: " + height);
        return 0.5 * base * height;
    }
}