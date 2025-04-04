package figur;

import java.util.Random;

public class Triangle extends Figures {
    private double a;
    private double b;
    private double c;
    private double pp;

    public Triangle(String name) {
        super(name);
    }

    @Override
    public void coordinates() {
        Random random = new Random();
        this.a= random.nextDouble(20+1);
        this.b= random.nextDouble(20+1);
        this.c= random.nextDouble(20+1);
        this.pp = (this.a + this.b + this.c) / 2;
    }

    public double getCoordinates(){
        return pp;
    }

    @Override
    public double area() {
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
}
