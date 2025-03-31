package strings;

public class Task1 {
    public static void main(String[] args) {

        String str = "Hello, World. Hello, Java!";

        str = str.toLowerCase(); // преобразование к нижнему регистру

        int length = str.length();
        System.out.println(length); // подсчет символов строки

        System.out.println(str.charAt(0) + ": it is the first symbol"); // первый символ
        System.out.println(str.charAt(str.length() - 1) + ": it is the last symbol"); // последний символ

        // проверка на четность/нечетность строки

        if (length % 2 != 0) {  // если строка нечетная
            int middleSymbol = length / 2; // // находим средний символ
            String middleSymbolStr = str.charAt(middleSymbol) + ": it is the middle symbol";
            System.out.println(middleSymbolStr);
        } else {  // если строка четная
            int middleSymbol1 = length / 2 - 1; // находим левый из двух средних символов
            String middleSymbolStr1 = str.charAt(middleSymbol1) + ": it is the left-middle symbol"; // находим элемент по индексу
            int middleSymbol2 = length / 2;
            String middleSymbolStr2 = str.charAt(middleSymbol2) + ": it is the right-middle symbol";
            System.out.println(middleSymbolStr1);
            System.out.println(middleSymbolStr2);
        }

        // вывод подстроки до точки (включая точку)
        int dotIndex = str.indexOf("."); // находим индекс точки
        if (dotIndex != -1) { // проверяем что точка есть
            System.out.println(str.substring(0, dotIndex + 1)); // выводим строку с первого символа до индекса точки + 1 символ
        } else {
            System.out.println("There is no dot");
        }

        // подсчет пробелов

        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) { // проходим циклом по каждому индексу строки
            if (str.charAt(i) == ' ') { // если индекс символа = пробелу
                spaceCount++; // записываем это в переменную
            }

        }
        if (spaceCount != 0) { // проверяем если есть пробел
            System.out.println("Amount of the spaces: " + spaceCount);
        } else {
            System.out.println("There is no space");
        }

    }

}

