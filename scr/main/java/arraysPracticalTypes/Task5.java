package arraysPracticalTypes;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] bigArray = new int[20];
        int[] halfArray1 = new int[10];
        int[] halfArray2 = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbers");

        for (int i = 0; i < 20; i++) { // считывает вводимый массив строк
            bigArray[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) { // циклом записывает Первую часть Большого массива в Первый Маленький массив
            halfArray1[i] = bigArray[i];
        }
        for (int i = 0; i <10; i++) { // записывает Вторую часть Большого массива во Второй Маленький массив
            halfArray2[i] = bigArray[i+10];
        }
        System.out.println("2nd part of the big array: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(halfArray2[i]);
        }
    }
}
