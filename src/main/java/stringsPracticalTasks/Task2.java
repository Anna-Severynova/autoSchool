package stringsPracticalTasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String myString = sc.nextLine(); // сохраняем вводимую Оригинальную строку

        System.out.println("Enter the substring for replacement: ");
        String subString = sc.nextLine(); // сохраняем вводимую Подстроку, которую хотим заменить

        System.out.println("Enter the new string: ");
        String newString = sc.nextLine(); // сохраняем вводимую Новую строку, на которую хотим заменить оригинальную

        if (myString.contains(subString)) { // проверяем если Подстрока совпадает с Оригинальной строкой
            myString = myString.replace(subString, newString); // меняем Подстроку на Новую
            System.out.println(myString);
        }
        else {
            System.out.println("String not found");
        }

    }
}
