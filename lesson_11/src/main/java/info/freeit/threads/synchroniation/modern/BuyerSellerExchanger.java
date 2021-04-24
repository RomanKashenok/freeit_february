package info.freeit.threads.synchroniation.modern;

import java.util.concurrent.Exchanger;

public class BuyerSellerExchanger {

    public final static Exchanger<String> kufarService = new Exchanger<>();

    public static void main(String[] args) {
        Runnable buyer = new BuyerSeller("money");
        Runnable seller = new BuyerSeller("phone samsung S7");
//        Runnable seller2 = new BuyerSeller("phone iphone 8");

        Thread buyerThread = new Thread(buyer);
        Thread sellerThread = new Thread(seller);
//        Thread seller2Thread = new Thread(seller2);

        buyerThread.start();
        sellerThread.start();
//        seller2Thread.start();
    }
}
