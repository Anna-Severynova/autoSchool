package stringsPracticalTasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String myString = sc.nextLine();

        String[] words = myString.split(" "); // создаем массив 'words' для вводимой строки 'myString' и разделяем по пробелам

        String longestWord = ""; // переменная для хранения самого длинного слова из массива
        int longestWordLength = 0; // переменная для хранения длины каждого слова

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWordLength) { //если длина первого слова больше чем ноль
                longestWord = words[i]; // то в переменную longestWord присваиваем это слово (под индексом ноль)
                longestWordLength = words[i].length(); // и обновляем значение длины слова в масиве (под индексом 0)
            }
        }
        System.out.println(longestWord);
        }
}
