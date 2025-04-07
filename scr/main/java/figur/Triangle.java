package figur;

import java.util.Random;

public class Triangle extends Figures {
    private int a;
    private int b;
    private int c;
    private double pp;

    public Triangle(String name) {
        super(name);
    }

    @Override
    public void coordinates() {
        Random random = new Random();
do{
        this.a= random.nextInt(20+1);
        this.b= random.nextInt(20+1);
        this.c= random.nextInt(20+1);
        this.pp = (this.a + this.b + this.c) / 2.0;}
while (!isTriangle()||!isZero());
    }

    public boolean isTriangle(){
            return a+b>c&&a+c>b&&c+b>a;
    }
    public boolean isZero(){
        return a!=0&&b!=0&&c!=0;
    }

    @Override
    public int area() {
        return (int) Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
}
