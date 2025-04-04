package figur;

import java.util.Random;

public class Circle extends Figures {
    private double radius;
    private double area;

    public Circle(String name) {
        super(name);
    }

    @Override
    public void coordinates() {
        Random randomRadius = new Random();
        radius = randomRadius.nextInt(20+1);
    }

    public double getCoordinates(){
        return radius;
    }

    @Override
    public double area() {
        double area = radius*radius*Math.PI;
        return area;
    }
}


