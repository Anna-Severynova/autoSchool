package autoSchool;

import com.welcome.Hello;

public class Main2 {
    public static void main (String [] args){
        Hello name = new Hello();
        name.setupName();
        name.welcome();
        System.out.println("Hello, World!");
        name.byeBye();
    }
}
