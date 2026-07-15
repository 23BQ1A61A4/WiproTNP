package OOPS.StringStringBuffer;

public class String8 {
    public static void main(String[] args) {
        String str = "ab*cd";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*')
                continue;

            if (i > 0 && str.charAt(i - 1) == '*')
                continue;

            if (i < str.length() - 1 && str.charAt(i + 1) == '*')
                continue;

            result += str.charAt(i);
        }

        System.out.println(result);
    }
}