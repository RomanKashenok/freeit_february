package interf;

public class ConditionerRemote implements Remote{

    private int currentTemp;

    public ConditionerRemote(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    @Override
    public void turnOn() {
        System.out.println("Conditioner is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Conditioner is turning OFF");
    }

    public void riseTmt() {
        currentTemp++;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }
}

