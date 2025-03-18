package typeConversionsPracticalTask.calculate;

import java.util.Scanner;

public class Task3 {
    double number;
    int round;


    public double getScan1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of the type X.X: ");
        double numb = scan.nextDouble();
        return numb;
    }

    public int setNumber1(double number) {
        this.number = number;
        this.round = (int)Math.round(number);
        return round;
    }
    public int getRound() {
        return round;
    }

}
