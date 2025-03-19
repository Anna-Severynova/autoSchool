package typeConvertionsExample.calculations;

public class Task1 {
    private int a;
    private int b;

    public void setResult(int q, int w) {
        double result = (double) q / w;
        this.a = (int) result;
        this.b = q % w;
    }

    public int getQ() {
        return a;
    }

    public int getW() {
        return b;
    }
}
