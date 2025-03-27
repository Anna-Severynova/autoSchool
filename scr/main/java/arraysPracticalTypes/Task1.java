package arraysPracticalTypes;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbers: ");
        //int numbers = sc.nextInt();
        int num = 5;
        int[] arr = new int[num];
        int maxNum = 0;


        for (int i = 0; i < arr.length; i++) { // переменную i используем как индекс массива
            arr[i] = sc.nextInt();
           // System.out.println(arr[i]);
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }

        }
        System.out.println(maxNum);

        }
    }
}
