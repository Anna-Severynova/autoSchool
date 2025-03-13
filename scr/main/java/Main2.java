import com.welcome.Hello;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Запрос на ввод имени
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        //присвоить это имя классу Hello
        Hello username = new Hello();
        username.setName("Anna");

    }
}
