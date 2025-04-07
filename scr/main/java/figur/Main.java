package figur;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Figures[] arrShape = new Figures[10];
        Random shapes = new Random(3);

        for (int i = 0; i < arrShape.length; i++) { // массив для заполнения фигурами+методы(рандом коордитат и вычисление площади)

            int type = shapes.nextInt(3); // 0 - круг, 1 - квадрат, 2 - треугольник

            if (type == 0) {
                arrShape[i] = new Circle("Circle");

            } else if (type == 1) {
                arrShape[i] = new Square("Square");

            } else {
                arrShape[i] = new Triangle("Triangle");

            }
            arrShape[i].coordinates();
            arrShape[i].area();
        }
        Arrays.sort(arrShape, (a, b) -> Double.compare(a.area(), b.area()));
        for (int i = 0; i < arrShape.length; i++) { // вывод уже отсортированного массива
            Figures f = arrShape[i];
            String parameters = f.getName();
            int area = f.area();
            System.out.println("name of the shape: " + parameters + ", " + "area: " + area);
            System.out.println();
        }
    }
}