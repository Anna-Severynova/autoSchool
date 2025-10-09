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

    public static class Task11 {
        public static void main(String [] args){
            String string = "Hello,World. Hello, World!!";

            // find first, last and middle symbol
            System.out.println("The first symbol: "+string.charAt(0));
            System.out.println("The last symbol: "+string.charAt(string.length()- 1));

            int lenght = string.length();
            if (lenght % 2 != 0){
                int middleSymbol = lenght/2;
                System.out.println("The middle symbol: "+string.charAt(middleSymbol));
            }
            else {
                System.out.println("There is impossible to find a middle symbol");
            }

            // find a part of the string before dot (include dot)
            int dotIndex = string.indexOf(".");
            System.out.println("A part of the string before dot (include dot)"+string.substring(0,dotIndex+1));

            // calculate spaces
            int totalSpaces = string.length() - string.replace(" ", "").length();
            System.out.println("Total spaces: " + totalSpaces);
        }
    }
}
