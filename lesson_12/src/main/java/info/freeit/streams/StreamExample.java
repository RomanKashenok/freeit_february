package info.freeit.streams;

import info.freeit.lambdas.User;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            userList.add(new User(RandomStringUtils.randomAlphanumeric(12), RandomStringUtils.randomAlphanumeric(12)));
        }


        List<Integer> collected = userList.stream()
                .filter(user -> user.getUsername().contains("15") || user.getPassword().contains("15"))
                .map(user -> user.getUsername() + "-" + user.getPassword())
                .flatMap(text -> text.chars().boxed())
                .collect(Collectors.toList());

        collected.forEach(System.out::println);
    }
}

