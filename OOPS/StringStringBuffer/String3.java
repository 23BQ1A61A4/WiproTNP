package OOPS.StringStringBuffer;

public class String3 {
    public static void main(String[] args) {
        String str = "Wipro";
        int n = str.length();
        String firstTwo = str.substring(0, 2);
        String result = "";

        for (int i = 0; i < n; i++) {
            result += firstTwo;
        }

        System.out.println(result);
    }
}