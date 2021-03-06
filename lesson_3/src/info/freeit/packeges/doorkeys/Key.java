package info.freeit.packeges.doorkeys;

public class Key {

    String doorType;

    public Key(String doorType) {
        this.doorType = doorType;
    }

    @Override
    public String toString() {
        return "Key{" +
                "doorType='" + doorType + '\'' +
                '}';
    }
}
