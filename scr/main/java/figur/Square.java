package figur;

import java.util.Random;

public class Square extends Figures {
    private double x;
    private double area;
    public Square(String name) {
        super(name);
    }

    @Override
    public void coordinates() {
        Random random = new Random();
//        double squareX = random.nextDouble();
        x = random.nextInt(20 + 1);
    }

    @Override
    public double area() {
        this.area = this.x * this.x;
        return area;
    }
}
