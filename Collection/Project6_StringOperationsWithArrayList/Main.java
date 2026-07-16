package Collection.Project6_StringOperationsWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1:");
        String s1 = sc.nextLine();

        System.out.println("Enter String 2:");
        String s2 = sc.nextLine();

        ArrayList<String> result = new ArrayList<>();

        // Operation 1
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                op1.append(s2);
            else
                op1.append(s1.charAt(i));
        }
        result.add(op1.toString());

        // Operation 2
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != last && first != -1) {
            String rev = new StringBuilder(s2).reverse().toString();
            String op2 = s1.substring(0, last) + rev + s1.substring(last + s2.length());
            result.add(op2);
        } else {
            result.add(s1 + s2);
        }

        // Operation 3
        if (first != last && first != -1) {
            String op3 = s1.substring(0, first) + s1.substring(first + s2.length());
            result.add(op3);
        } else {
            result.add(s1);
        }

        // Operation 4
        int len = s2.length();
        int firstHalf = (len % 2 == 0) ? len / 2 : len / 2 + 1;

        String part1 = s2.substring(0, firstHalf);
        String part2 = s2.substring(firstHalf);

        result.add(part1 + s1 + part2);

        // Operation 5
        String op5 = s1;

        for (int i = 0; i < s2.length(); i++) {
            op5 = op5.replace(s2.charAt(i), '*');
        }

        result.add(op5);

        System.out.println("\nOutput:");
        System.out.println(result);

        sc.close();
    }
}