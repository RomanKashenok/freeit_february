package info.freeit;

public class AirplaneRunner {
    public static void main(String[] args) {

        Airplane boeing1 = new Airplane();
        Airplane airbus = new Airplane("AirBus");
        Airplane flyJet = new Airplane(700, "FlyJet");

        System.out.println(boeing1);
        System.out.println(airbus);
        System.out.println(flyJet);
    }
}