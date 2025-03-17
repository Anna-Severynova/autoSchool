package typeConversionsPracticalTask;

public class Main {
    public static void main(String[] args) {
        Task1 calculate = new Task1();
        calculate.setResult(21, 8);
        System.out.println("21 / 8 ="+" "+"целое число: "+calculate.getQ()+" остаток: "+calculate.getW());
    }
}
