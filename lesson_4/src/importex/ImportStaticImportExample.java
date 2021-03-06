package importex;

import static java.lang.Math.*;

public class ImportStaticImportExample {
    public static void main(String[] args) {

        obj.Box b1 = new obj.Box("Red", 2,2,2);
        System.out.println(b1);
        System.out.println(enums.Days.MONDAY);
        System.out.println(new enums.Meeting(enums.Days.SUNDAY, 45));

        int a = 3;

        System.out.println(pow(a, 3));

        System.out.println(sqrt(pow(a,5)));

        System.out.println(PI);

    }
}
