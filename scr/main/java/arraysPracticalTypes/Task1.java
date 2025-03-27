package arraysPracticalTypes;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int[] array = initializeArray();
        System.out.println(Arrays.toString(array));// выводим их в массиве
        int max = maxNumber(array);
        System.out.println(max);
    }

    public static int[] initializeArray() {

        int num = 5; // задаем размерность массива
        int[] arr = new int[num]; // инициализируем массив

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");

        for (int i = 0; i < arr.length; i++) { // переменную i используем как индекс массива. заполняем массив arr
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static int maxNumber(int[] arr) {

        int maxNumber = 0; // переменная для хранения макс числа
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }

        return maxNumber;
    }
}





