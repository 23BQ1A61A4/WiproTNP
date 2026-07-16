package Collection.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(-10);
        list.add(-5);
        list.add(-8);
        list.add(12);
        list.add(7);
        list.add(-20);
        list.add(15);
        list.add(-16);
        list.add(18);
        list.add(9);

        List<Integer> result = list.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}