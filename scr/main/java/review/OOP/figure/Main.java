package review.OOP.figure;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figures[] figures = new Figures[10];
        Random random = new Random();

        for (int i = 0; i < figures.length; i++) {

            int randomFigure = random.nextInt(3);
            int[] coords = new int[]{2, 7};

            if (randomFigure == 0) {
                int randomRadius = random.nextInt(100);
                figures[i] = new Circle("Circle", coords, randomRadius);
            } else if (randomFigure == 1) {
                int randomSide = random.nextInt(100);
                figures[i] = new Square("Square", coords, randomSide);
            } else {
                int randomBase = random.nextInt(100);
                int randomHeight = random.nextInt(100);
                figures[i] = new Triangle("Triangle", coords, randomBase, randomHeight);

            }
            System.out.println("Name of the shape: " + figures[i].getFigureName());
            System.out.println("Area = " + figures[i].calculateArea());
            System.out.println();
        }
    }
}