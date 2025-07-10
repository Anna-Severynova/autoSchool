package review.arraysPractical;

import java.util.Arrays;
import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        String[] arrString = new String[5]; // здесь создаем строковый массив (arrString) на 5 элементов
        fillStringArr(arrString); // заполняем массив (arrString) строками с клавиатуры
        int[] arrInt = new int[5]; // создаем интовый массив arrInt на 5 элементов
        sizeOfStrings(arrString, arrInt); // записываем длинну строк из массива arrString на 5 элементов в массив arrInt на 5 элементов
    }

    public static void fillStringArr(String[] arrStr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 strings:");

        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = sc.nextLine();
        }
    }

    public static void sizeOfStrings(String[] arrString, int[] arrInt) {

        for (int i = 0; i < arrString.length; i++) {
            arrInt[i] = arrString[i].length();
        }
        System.out.println(Arrays.toString(arrInt));
    }
}
//    public static void newSize(String[] arrString){
//        for (int i = 0; i < arrString.length; i++) {
//            System.out.println(arrString[i].length());
//        }
//    }


