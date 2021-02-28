package info.freeit.getset;

public class PrivPubRunner {
    public static void main(String[] args) {
        UserAuthentication user = new UserAuthentication("Vasya", "private password");

//        user.name = "Petya";
        user.setPrivName("Petya");

        System.out.println(user);

    }
}
