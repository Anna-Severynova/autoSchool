package typeConvertionsExample.calculations;

import java.util.Scanner;

public class Task3 {
    double number;
    int round;

    public double getScan1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of the type X.X: ");
        return scan.nextDouble();
    }

    public void setNumber1(double number) {
        this.number = number;
        this.round = (int) Math.round(number);
    }

    public int getRound() {
        return round;
    }
}