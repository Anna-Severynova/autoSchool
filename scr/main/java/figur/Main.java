package figur;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle");
        System.out.println(circle.getName());
        circle.coordinates();
        System.out.println("Coordinates for the Circle: " + circle.getCoordinates());
        System.out.println("Area for the Circle: " + circle.area());


        Triangle triangle = new Triangle("Triangle");
        System.out.println(triangle.getName());
        triangle.coordinates();
        System.out.println("Coordinates for triangle: " + triangle.getCoordinates());
        System.out.println("Area for the triangle: " + triangle.area());

        Square square = new Square("Square");
        System.out.println(square.getName());
        square.coordinates();
        System.out.println("Coordinates for the Square: " + square.getCoordinates());
        System.out.println("Area for the Square: " + square.area());
    }
}
