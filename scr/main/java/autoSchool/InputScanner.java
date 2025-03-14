package autoSchool;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {

        String s = "hello"; // так можно создать Объект Класса String
        String t = new String("Hi");//словом 'new' создаем объект класса - таким образом создаются объекты в джава
        System.out.println(s+" "+t);

        Scanner sc = new Scanner(System.in);// Scanner отвечает за ввод данных с консоля, за получение данных ОТ пользователя
        System.out.println("Enter username");
        String myString = sc.nextLine();
        //ссылаем переменную myString на то,что будет получено с клавиатуры
        //nextLine - метод
        //в переменной myString хранится то, что мы вводили с клавиатуры
        System.out.print("Great job, "+myString);

    }
}
