package OOPS.StringJoinerClass;

import java.util.StringJoiner;

public class StringJoiner2 {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Hyderabad");
        s1.add("Chennai");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Mumbai");
        s2.add("Delhi");

        StringJoiner first = new StringJoiner("-");
        first.add("Hyderabad");
        first.add("Chennai");

        StringJoiner second = new StringJoiner("-");
        second.add("Mumbai");
        second.add("Delhi");

        first.merge(second);
        System.out.println("s1 merged to s2: " + first);

        s2.merge(s1);
        System.out.println("s2 merged to s1: " + s2);
    }
}