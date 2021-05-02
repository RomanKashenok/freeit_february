package info.freeit.lambdas;

import java.util.function.Function;

public class FunctionsExample {
    public static void main(String[] args) {
//        Function<User, String> stringToIntFunc = (user) -> user.getUsername() + " " + user.getPassword();
//
//        User u1 = new User("secretUsername", "secretPassword");
//        System.out.println(stringToIntFunc.apply(u1));
//
//        BiFunction<String, String, User> biFuncUserFactory = User::new;
//        User u2 = biFuncUserFactory.apply("name", "pass");
//
//        System.out.println(stringToIntFunc.apply(u2));
//
//        List<User> userList = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            userList.add(biFuncUserFactory.apply("usern" + i, "pass" + i));
//        }
//
//        userList.forEach(System.out::println);

        Function<String, String> trim = String::trim;
        String result = trim
                .andThen(String::toLowerCase)// andThen -> **func<result of prev func, returnValue>*** -> (result) -> return result.toLowerCase();
                .andThen(StringBuffer::new)
                .andThen(StringBuffer::reverse)
                .andThen((sb) -> sb.append(" tset"))
                .andThen(StringBuffer::toString)
                .apply(" ABCDEFG ");

        System.out.println(result);

//        Function<String, String> lowercaseFunc = String::toLowerCase;
//        result = lowercaseFunc.apply(result);
//        System.out.println(result);
//
//        Function<String, StringBuilder> sb1Func = StringBuilder::new;
//        StringBuilder result1 = sb1Func.apply(result);
//        System.out.println(result1);
//
//        Function<StringBuilder, StringBuilder> sb2Func = StringBuilder::reverse;
//        result1 = sb2Func.apply(result1);
//        System.out.println(result1);
//
//        Function<StringBuilder, String> sb3Func = StringBuilder::toString;
//        result = sb3Func.apply(result1);
//        System.out.println(result);

    }
}
