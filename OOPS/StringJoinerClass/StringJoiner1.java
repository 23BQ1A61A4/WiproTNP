package OOPS.StringJoinerClass;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoiner1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Dolly");
        names.add("Sasi");
        names.add("Pujitha");

        StringJoiner joiner = new StringJoiner(",", "{", "}");

        for (String name : names) {
            joiner.add(name);
        }

        System.out.println(joiner);
    }
}