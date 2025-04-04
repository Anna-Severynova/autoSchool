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
    public double coordinates() {
        this.a=5;
        this.b=2;
        this.c=5;
        this.pp = (this.a + this.b + this.c) / 2;
        return pp;
    }

    public double getCoordinates(){
        return pp;
    }

    @Override
    public double area() {
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
}
