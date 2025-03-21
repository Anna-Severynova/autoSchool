package typeConversionsPracticalTask.calculate;

public class Task1{

    private int a; // результат (целое число)
    private int b; // результат (число после точки)
    private double result;

    public void setResult(int q, int w) {

       this.result = (double) q/w;
       this.a= (int)result; // присваиваем целое число результата (без остатка)
       this.b= q%w; // присваиваем остаток результата (без целого числа)
    }
    public int getQ() {
        return a;
    }
    public int getW() {
        return b;
    }

}

