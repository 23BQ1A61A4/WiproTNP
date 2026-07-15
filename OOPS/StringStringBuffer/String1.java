package OOPS.StringStringBuffer;

public class String1 {
    public static void main(String[] args) {

        // Input string
        String str = "madam";

        // Reverse the input string
        String reverse = new StringBuffer(str).reverse().toString();

        // Compare original and reversed strings
        if (str.equalsIgnoreCase(reverse)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}