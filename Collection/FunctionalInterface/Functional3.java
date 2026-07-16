package Collection.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Functional3 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("madam");
        list.add("java");
        list.add("level");
        list.add("radar");
        list.add("apple");
        list.add("malayalam");
        list.add("hello");
        list.add("noon");
        list.add("wipro");
        list.add("refer");

        Predicate<String> p = s -> {
            String rev = new StringBuilder(s).reverse().toString();
            return s.equalsIgnoreCase(rev);
        };

        list.stream()
                .filter(p)
                .forEach(System.out::println);

    }

}