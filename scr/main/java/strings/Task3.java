package strings;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String myString = sc.nextLine();

        String[] words = myString.split(" "); // создаем массив для вводимой строки

        //создаем переменную для хранения самого длинного слова
        String longestWord = "";

        // создаем переменную для хранения длинны каждого слова в массиве
        int longestWordLength = words[0].length();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWordLength) {
                longestWord = words[i];
                System.out.println(longestWord);
            }
        }


        }

}
