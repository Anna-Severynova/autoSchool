package typeConvertionsExample;

import typeConvertionsExample.calculations.Task1;
import typeConvertionsExample.calculations.Task2;
import typeConvertionsExample.calculations.Task3;
import typeConvertionsExample.calculations.Task4;

public class Main {
    public static void main(String[] args) {
        Task1 calculate = new Task1();
        calculate.setResult(21, 8);
        System.out.println("21 / 8 =" + " " + "целое число: " + calculate.getQ() + " остаток: " + calculate.getW());

        Task2 calculate2 = new Task2();
        calculate2.setDigits(calculate2.getScan());
        System.out.println("Amount of the 2-digit numbers is: " + calculate2.getSum());

        Task3 calculate3 = new Task3();
        calculate3.setNumber1(calculate3.getScan1());
        System.out.println(calculate3.getRound());

        Task4 calculate4 = new Task4();
        calculate4.getScan2();
        calculate4.getScan3();
        calculate4.getScan4();
        System.out.println("a=a+b: " + calculate4.getSumAB() + ", " + "b=c-a: " + calculate4.getSubCA() + ", " + "a=a+b+c: " + calculate4.getSumABC());
    }

}
