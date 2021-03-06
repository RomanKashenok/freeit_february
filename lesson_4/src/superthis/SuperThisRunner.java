package superthis;

public class SuperThisRunner {
    public static void main(String[] args) {

        Cat c1 = new Cat("Main kun", "Murzik");

        System.out.println(c1);

        System.out.println(c1.getBreed());
        System.out.println(c1.getName());
    }
}
