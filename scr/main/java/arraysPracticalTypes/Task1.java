package arraysPracticalTypes;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = initializeArray();

    }

    public static int[] initializeArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");

        int num = 5; // задаем размерность массива
        int[] arr = new int[num]; // инициализируем массив
        int maxNum = 0;  // переменная для поиска максимального числа

        for (int i = 0; i < arr.length; i++) { // переменную i используем как индекс массива
            arr[i] = sc.nextInt();

            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }

        }
        System.out.println("Max number is: "+maxNum);

        return new int[]{maxNum};
    }
}


