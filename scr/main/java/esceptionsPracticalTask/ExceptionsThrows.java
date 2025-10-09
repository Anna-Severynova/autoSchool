package esceptionsPracticalTask;

public class ExceptionsThrows {
    public void sleepThrows() throws InterruptedException {
        System.out.println("(throws) Sleep in 3 sec");
        Thread.sleep(3000);
        System.out.println("(throw) Task was done: no interrupts");
        System.out.println(" ");
    }
}
