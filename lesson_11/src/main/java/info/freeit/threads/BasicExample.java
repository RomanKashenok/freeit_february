package info.freeit.threads;

import static java.lang.Thread.sleep;

public class BasicExample {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;

        Runnable myRunnable = new MyNewThread2();
        Thread myThread2 = new Thread(myRunnable);
        myThread2.start();

        Thread myThread = new MyNewThread();
        myThread.start();

        while (i < 10) {
            System.out.println("from " + Thread.currentThread().getName() + " thread...");
            sleep(500);
            i++;
        }
        System.out.println("Program finished");
    }
}
