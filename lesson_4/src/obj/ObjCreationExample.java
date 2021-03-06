package obj;

public class ObjCreationExample {
    public static void main(String[] args) {

        int a = 10;
        Integer aObj = 10;

        Box b1 = new Box(new String("Red"), 2,2,2);
        Box b2 = new Box(new String("Red"), 2,2,2);

        System.out.println(b1.equals(b2));
    }
}
