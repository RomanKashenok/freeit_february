package interf;

public class TvRunner {
    public static void main(String[] args) {

        Remote conderRemote = new ConditionerRemote(23);
        Remote lgTvRemote = new LgTvRemote("LB560");

        Remote [] remotes = {conderRemote, lgTvRemote};


        for (int i = 0; i < remotes.length; i++) {
            remotes[i].turnOff();
            remotes[i].turnOn();
        }

    }
}
