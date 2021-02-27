package info.freeit.boxing;

public class BoxUnbox {

    private static Double koeff;

    public static void main(String[] args) {

//        byte a = 5; // Byte
//        short b = 5; // Short
//        int c = 5; // Integer внутри хранит int
//        long d = 5;
//        float e = 5.0f;
//        double f = 5.0;
//
//        boolean g = true;
//
//        char h = 'h';
//
//
        Integer testInt = 10;
        int addToTest = 10;

        Integer i = testInt + addToTest;

        double salaryOfVasya = 1000;
        calculateSalary(salaryOfVasya);
    }

    private static void calculateSalary(double salary) {
        salary *= 1.1;
        System.out.println("Your salary for current month: " + salary * koeff);
    }

}
