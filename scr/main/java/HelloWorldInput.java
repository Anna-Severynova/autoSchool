import java.util.Scanner;

public class HelloWorldInput {
    public static void main(String[] args) {
printHelloName();
    }
    public static void printHelloName() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your name: ");
       String name = sc.nextLine(); // в переменной name будем хранить данные, введенные с клавиатуры;
                                    // nextLine - вызов Метода который принимает только строчные данные
       System.out.println("Hello, "+name);
    }
}
