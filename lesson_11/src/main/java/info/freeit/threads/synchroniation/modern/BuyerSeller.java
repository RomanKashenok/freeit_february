package info.freeit.threads.synchroniation.modern;

import java.util.Random;

import static info.freeit.threads.synchroniation.modern.BuyerSellerExchanger.kufarService;

public class BuyerSeller implements Runnable {

    private Random rand = new Random();
    private String forExchange;

    public BuyerSeller(String forExchange) {
        this.forExchange = forExchange;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " brought " + forExchange);
            Thread.sleep(rand.nextInt(10000) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            forExchange = kufarService.exchange(forExchange);
            System.out.println(Thread.currentThread().getName() + " after exchange " + forExchange);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
