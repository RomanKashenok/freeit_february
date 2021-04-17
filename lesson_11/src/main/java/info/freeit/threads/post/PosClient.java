package info.freeit.threads.post;

import java.util.Random;

public class PosClient implements Runnable {
    private static final Random rand = new Random();

    @Override
    public void run() {
        synchronized (PostOffice.pen) {
            try {
                fillBlank(PostOffice.pen);
                if(rand.nextBoolean()) {
                    sendParcel();
                } else {
                    receiveParcel();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void fillBlank(Pen pen) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("PostClient " + Thread.currentThread().getName() + " filling blank with pen " + pen);
            Thread.sleep(500);
        }
    }

    public void sendParcel() {
        System.out.println("PostClient " + Thread.currentThread().getName() + " sending parcel");
    }

    public void receiveParcel() {
        System.out.println("PostClient " + Thread.currentThread().getName() + " receiving parcel");
    }
}
