package OOPS.OptionalClass;

import java.util.Optional;

public class Optional2 {
    public static void main(String[] args) {
        String address = null;

        Optional<String> value = Optional.ofNullable(address);

        System.out.println(value.orElse("India"));
    }
}