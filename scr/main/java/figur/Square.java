package figur;

import java.util.Random;

public class Square extends Figures {
    private double x;

    public Square(String name) {
        super(name);
    }

    @Override
    public void coordinates() {
        Random random = new Random();
        x = random.nextInt(20 + 1);
       // return x;
    }
    public double getCoordinates(){
        return x;
    }


    @Override
    public double area() {
        double area;
        area = this.x * this.x;
        return area;
    }
}
