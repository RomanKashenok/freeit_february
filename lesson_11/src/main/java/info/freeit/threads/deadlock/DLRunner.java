package info.freeit.threads.deadlock;

public class DLRunner {

	public static final Object mutex = new Object();

	public static void main(String[] args) throws InterruptedException {

		ImPoliceman policeman1 = new ImPoliceman();
		ImPoliceman policeman2 = new ImPoliceman();

		Thread t1 = new Thread(() -> {
			policeman1.checkHuman(policeman2);
		});

		Thread t2 = new Thread(() -> {
			policeman2.checkHuman(policeman1);
		});

		t1.start();
		t2.start();
	}
}