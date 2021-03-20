package innernested.nestedclasses;

public class Runner2 {
    public static void main(String[] args) {
        OuterTest.InnerRegular innerRegular = new OuterTest().new InnerRegular();

        System.out.println(innerRegular.a);

        System.out.println(OuterTest.InnerNested.b);
    }
}
