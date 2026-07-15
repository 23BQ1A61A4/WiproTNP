package OOPS.OptionalClass;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        String[] names = new String[5];

        Optional<String> value = Optional.ofNullable(names[0]);

        if (value.isPresent())
            System.out.println(value.get().length());
        else
            System.out.println("Value is null");
    }
}