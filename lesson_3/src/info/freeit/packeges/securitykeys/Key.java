package info.freeit.packeges.securitykeys;

public class Key {

    String passPhrase;

    public Key(String passPhrase) {
        this.passPhrase = passPhrase;
    }

    @Override
    public String toString() {
        return "Key{" +
                "passPhrase='" + passPhrase + '\'' +
                '}';
    }
}
