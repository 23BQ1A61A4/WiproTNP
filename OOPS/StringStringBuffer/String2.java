package OOPS.StringStringBuffer;

public class String2 {
    public static void main(String[] args) {

        // Two input strings
        String a = "Mark";
        String b = "kate";

        // Convert both strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check whether last character of a and first character of b are same
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            System.out.println(a + b.substring(1));
        } else {
            System.out.println(a + b);
        }
    }
}