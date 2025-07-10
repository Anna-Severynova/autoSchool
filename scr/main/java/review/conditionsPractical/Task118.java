package review.conditionsPractical;

public class Task118 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(500);
        }
        System.out.print("Boom!");
    }
}
