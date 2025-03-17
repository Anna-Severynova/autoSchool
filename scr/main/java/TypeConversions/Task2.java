package TypeConversions;

import java.util.Scanner;

public class Task2 {

    Scanner sc = new Scanner(System.in);

    public int getNumber() {
        System.out.println("Enter a number: ");
        return sc.nextInt();
    }

    public int getSumOfDigits() {
        int number = getNumber();

        int num1 = number / 10;
        int num2 = number % 10;

        return num1 + num2;
    }
}
