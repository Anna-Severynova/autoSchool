package autoSchool.loops_operators;//программа, которая будет считывать с клавиатуры числа до тех пор, пока она не считает 5

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 5");
        int x = sc.nextInt();// вводим число, помещенное в переменную х
        while(x!=5) {        // while сначала проверяет условие, потом выполняет инструкции
            System.out.println("Enter a number 5");
            x = sc.nextInt(); // вводим число
        }
        System.out.println("You entered 5");
    }
}
