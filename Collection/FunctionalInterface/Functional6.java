package Collection.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Functional6 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java Programming");
        list.add("Wipro TalentNext");
        list.add("Stream API");
        list.add("Lambda Expressions");
        list.add("Functional Interface");

        Consumer<String> c = s -> {

            String words[] = s.split(" ");

            for(int i = words.length - 1; i >= 0; i--)
                System.out.print(words[i] + " ");

            System.out.println();

        };

        list.forEach(c);

    }

}