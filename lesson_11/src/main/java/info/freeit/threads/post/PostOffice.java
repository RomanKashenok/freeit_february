package info.freeit.threads.post;

public class PostOffice {

    public static final Pen pen = new Pen();
    public final Cashier cashier = new Cashier();

    static class Cashier {
        public void doSomething(PosClient client, String clientName) {
            Thread thread = new Thread(client);
            thread.setName(clientName);
            thread.start();
        }
    }
}
