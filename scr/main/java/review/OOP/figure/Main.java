package review.OOP.figure;

import java.util.Random;

public class Main {
    public static void main(String [] args){
        Figures [] figures = new Figures[10];
        Random random = new Random();

        for(int i = 0; i < figures.length; i++){

            int randomFigure = random.nextInt(3);
            int[] coords = new int[]{2, 7};

            if(randomFigure == 0){
                int randomRadius = random.nextInt(100);
                figures[i] = new Circle("Circle", coords, randomRadius );
            }
            else if (randomFigure == 1){
                int randomSide = random.nextInt(100);
                figures[i] = new Square("Square", coords, randomSide);
            }
            else{
                int randomBase = random.nextInt(100);
                int randomHeight = random.nextInt(100);
                figures [i] = new Triangle("Triangle", coords, randomBase, randomHeight);

            }
            System.out.println(figures[i].getFigureName()+figures[i]);
            System.out.println(figures[i].calculateArea());
        }

        }
    }


//нужно зарандомить:
// 1. выбор фигуры
// 2. координаты
// 3. параметры для вычисления S каждой фигуры