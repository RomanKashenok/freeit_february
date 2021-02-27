package info.freeit;

public class Airplane {

    int maxSpeed;
    double fuelConsumption;
    double fuelTankVolume;
    double fuelRest;
    String type;

    public Airplane() {
        maxSpeed = 100;
        fuelConsumption = 200;
        fuelTankVolume = 300;
        fuelRest = 400;
        type = "boeing";
    }

    public Airplane(String type) {
        this();
        this.type = type;
    }

    public Airplane(int maxSpeed, String type) {
        this(type);
        this.maxSpeed = maxSpeed;
    }

    public void takeOff() {
        System.out.println("Airplane " + type + " taking off");
    }

    public void land() {
        System.out.println("Airplane " + type + " landing");
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "maxSpeed=" + maxSpeed +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelTankVolume=" + fuelTankVolume +
                ", fuelRest=" + fuelRest +
                ", type='" + type + '\'' +
                '}';
    }
}
