package conditionalOperatorsPracticalTasks;

public class Task18 {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(200);
        }
        System.out.println("boom!");
    }
}
