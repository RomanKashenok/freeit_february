package interf;

public class LgTvRemote extends TvRemote implements Remote, MagicRemote {

    private String model;

    public LgTvRemote(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void channelPlus() {
        System.out.println("LG TV channel PLUS");
    }

    @Override
    void channelMinus() {
        System.out.println("LG TV channel MINUS");
    }

    @Override
    public void turnOn() {
        System.out.println("LG TV is turning ON");
    }

    @Override
    public void turnOff() {
        System.out.println("LG TV is turning OFF");
    }

    @Override
    public void showCursor() {
        System.out.println("LG TV showing current cursor position");
    }
}
