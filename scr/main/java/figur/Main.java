package figur;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle");
        System.out.println(circle.name);
        Triangle triangle = new Triangle("Triangle");
        System.out.println(triangle);
        Square square = new Square("Square");
        System.out.println(square);
        square.coordinates();
      //  System.out.println(square.coordinates());
        square.area();
        System.out.println(square.area());
    }
}
