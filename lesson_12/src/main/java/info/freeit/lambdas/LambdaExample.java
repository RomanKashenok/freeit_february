package info.freeit.lambdas;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
        UserFactory factory = new userFactoryImpl();
        User u1 = factory.createUser("username", "password");

        UserFactory factory1 = (username, password) -> new User(username, password);
        User u2 = factory1.createUser("username", "password");

        Supplier<User> userFactory = User::new;
        User u4 = userFactory.get();

        UserFactory userFactory1 = User::new;
        User u5 = userFactory1.createUser("username", "password");

        Supplier<String> usernameSupplier = u4::getUsername;
        System.out.println(usernameSupplier.get());

        Consumer<String> usernameConsumer = u4::setUsername;
        usernameConsumer.accept("what da f...magic o_O ???");

        System.out.println(usernameSupplier.get());

        doSomethingWithUser(User::new, System.out::println);
    }

    private static void doSomethingWithUser(Supplier<User> us, Consumer<User> userConsumer) {
        userConsumer.accept(us.get());
    }
}

@FunctionalInterface
interface UserFactory {
    User createUser(String username, String password);
}

class userFactoryImpl implements UserFactory {
    @Override
    public User createUser(String username, String password) {
        return new User(username, password);
    }
}
