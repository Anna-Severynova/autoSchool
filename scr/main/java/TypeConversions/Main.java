package TypeConversions;

import TypeConversions.calculations.Task2;
import TypeConversions.calculations.Task4;

import java.util.Scanner;

public class Main {

     static Scanner sc = new Scanner(System.in);
     static Task2 task2 = new Task2();
     static Task4 task4 = new Task4();

     public static void main(String[] args) {
          task1();
          task4();
     }

     public static void task1(){
          int number = getNumber();
          task2.getSumOfDigits(number);
     }

     public static void task4(){
          int a = getNumber();
          int b = getNumber();
          int c = getNumber();
          task4.printValues(a, b, c);
     }

     public static int getNumber() {
          System.out.println("Enter a number: ");
          return sc.nextInt();
     }
}
