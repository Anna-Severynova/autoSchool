package typeConversionsPracticalTask;

import typeConversionsPracticalTask.calculate.Task1;
import typeConversionsPracticalTask.calculate.Task2;

public class Main {
    public static void main(String[] args) {
        //Task1 calculate = new Task1();
        // calculate.setResult(21, 8);
        // System.out.println("21 / 8 =" + " " + "целое число: " + calculate.getQ() + " остаток: " + calculate.getW());

        Task2 calculate2 = new Task2();
        //calculate2.getScan();
        calculate2.setDigits(calculate2.getScan());
        System.out.println("Amount of the 2-digit numbers is: "+calculate2.getSum());

    }
}
