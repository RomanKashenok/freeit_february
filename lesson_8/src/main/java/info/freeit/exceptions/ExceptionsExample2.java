package info.freeit.exceptions;

/**
 * Created by Raman Kashanok
 */
public class ExceptionsExample2 {
    public static void main(String[] args) throws InterruptedException {
        int a = 5;
        int b = 0;
        int c;
        try {
            c = a/b;
        } catch (Exception e){
            System.out.println(e);
            c = -1;
        }



        System.out.println(c);

        int i = 0;

        while (i < 15){

            System.out.println("counter value: " + i++);
            Thread.sleep(1000);


        }

        System.out.println("PROGRAM FINISHED");
    }
}
