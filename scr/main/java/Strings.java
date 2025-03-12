public class Strings {
    public static void main(String[] args){
        int x = 5;
        String myString = "Hello, World!"; // String - является классом,
                                           // "Hello, World!" - объект класса Стринг,
                                           //myString - ссылается на объект класса Стринг
        String space = " ";
        String name = "Anna";

        //объеденение строк
        System.out.println(myString+space+name);
        System.out.println("Hello"+" "+"Bob");
        System.out.println("My number is"+space+x);
    }
}
