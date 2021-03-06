package interf;

public abstract class TvRemote implements Remote {

    void channelPlus() {
        System.out.println("channel +");
    }

    void channelMinus() {
        System.out.println("channel -");
    }

}
