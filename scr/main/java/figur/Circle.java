package figur;

import java.util.Random;

public class Circle extends Figures {
    private int radius;

    public Circle(String name) {
        super(name);
    }

    @Override
    public void coordinates() {
        Random randomRadius = new Random();
        do{
        radius = randomRadius.nextInt(20+1);}
        while (!isZero());
    }

    public boolean isZero(){
        return radius!=0;
    }

    @Override
    public int area() {
        return (int) (radius*radius*Math.PI);
    }
}


