package Collection.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Functional5 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(7);
        list.add(9);
        list.add(16);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(36);
        list.add(49);
        list.add(50);

        Predicate<Integer> p = n -> {
            int s = (int)Math.sqrt(n);
            return s * s == n;
        };

        list.stream()
                .filter(p)
                .forEach(System.out::println);

    }

}