package info.freeit.threads;

import static java.lang.Thread.sleep;

public class MyNewThread2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("from " + Thread.currentThread().getName() + " thread...");
            try {
                sleep(480);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
