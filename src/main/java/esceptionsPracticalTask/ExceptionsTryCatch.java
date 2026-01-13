package esceptionsPracticalTask;

public class ExceptionsTryCatch {
    public void sleepTryCatch() {
        try {
            System.out.println("(try-catch) Sleep in 3 sec");
            Thread.sleep(3000);
            System.out.println("(try-catch) Task was done: no interrupts");
            System.out.println(" ");
        } catch (InterruptedException e) { // если "сон" будет прерван раньше, чем пройдет 3 сек
            System.out.println("(try-catch) Exceptions was detected: the sleep was interrupted before 3 seconds had passed");
            System.out.println(" ");
        }
    }
}