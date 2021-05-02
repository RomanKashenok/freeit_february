package info.freeit.lambdas.opt;

import info.freeit.lambdas.User;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Optional;
import java.util.Random;

public class OptionalExample {
    private static Random rand = new Random();
    public static void main(String[] args) {

        Optional<User> userOpt = Optional.ofNullable(getUser());

        User user = userOpt.orElseThrow(() -> new IllegalArgumentException("Нет такого юзера!!!"));

        System.out.println(user);

    }

    private static User getUser() {
        if(rand.nextInt() % 2 == 0) {
            return new User(RandomStringUtils.randomAlphabetic(6), RandomStringUtils.randomAlphabetic(6));
        }
        return null;
    }
}
