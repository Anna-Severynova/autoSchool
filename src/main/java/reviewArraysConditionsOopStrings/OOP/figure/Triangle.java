package reviewArraysConditionsOopStrings.OOP.figure;

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
        return 0.5 * base * height;
    }
    public String getParams() {
        return "Base = " + base+" & " + "Height = "+ height;
    }
}