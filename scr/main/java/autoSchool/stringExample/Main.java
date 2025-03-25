package autoSchool.stringExample;

public class Main {
    public static void main(String[] args) {
//        printWords(splitString("test testq testwo"));
//        System.out.println(maxLenght(splitString("testooooooo test testt")));
        example();
    }

    public static String[] splitString(String str) {
        return str.split(" ");
    }

    public static void printWords(String[] words) {

        for (int i = 0; i < 2; i++) {
            String word = words[i];
            int length = word.length();
            System.out.println(word);
            System.out.println(length);
        }
    }

    public static int maxLenght(String[] words) {
        int max = 0;
        for (String word : words) {
            int length = word.length();
            if (length > max) {
                max = length;
            }
        }
        return max;
    }

    public static void example(){
        String[] letters  = {"a", "b", "c", "d", "e", "f", "g", "h"};

        for (String letter : letters) { //присваиваем переменной letter значение из массива letters
            System.out.println("loop is started"); // выводим в консоль сообщение
            System.out.println(letter + " option"); // выводим в консоль значение переменной letter и строку " option"

            if (letter.equals("g")) { // если значение переменной letter равно "g"
                System.out.println("g is found and break"); // выводим в консоль сообщение
                break; // завершаем цикл
            } else if (letter.equals("d")) { // если значение переменной letter равно "d"
                System.out.println("D is found and continue"); // выводим в консоль сообщение
            }

            System.out.println("loop is ended"); // выводим в консоль сообщение
        }

    }
}
