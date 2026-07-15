package OOPS.StringStringBuffer;

public class String9 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        String result = "";

        int max = Math.max(a.length(), b.length());

        for (int i = 0; i < max; i++) {
            if (i < a.length())
                result += a.charAt(i);

            if (i < b.length())
                result += b.charAt(i);
        }

        System.out.println(result);
    }
}