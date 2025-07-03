package arraysPracticalTypes;

import java.util.Arrays;
import java.util.Scanner;

public class Task44 {
    public static void main(String[]args){
        int [] arrInt = createArrInt();
        fillArrInt(arrInt);
        int [] reverse = reverseArrInt(arrInt);
        printReverseArrInt(reverse);
    }

    public static int[] createArrInt(){
        return new int[5];
    }

    public static void fillArrInt(int[]arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");

        for(int i = 0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
    }

    public static int[] reverseArrInt(int[]arrRev){
        int [] reverseArr = new int [arrRev.length]; // создаем массив для хранения перевернутого массива
        int j = 0;
        for (int i = arrRev.length - 1; i >=0; i--){
            reverseArr[j] = arrRev[i];
            j++;
        }
        return reverseArr;
    }

    public static void printReverseArrInt(int[]arrPrint){
        for (int i = 0; i < arrPrint.length;i++){
            System.out.println(arrPrint[i]);
        }
    }
}
