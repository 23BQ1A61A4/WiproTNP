package JavaFundamentals.FlowControlStatements;
public class IfStatement7 {

    public static void main(String[] args) {

        char ch = args[0].charAt(0);

        if (Character.isUpperCase(ch))
            System.out.println(Character.toLowerCase(ch));
        else if (Character.isLowerCase(ch))
            System.out.println(Character.toUpperCase(ch));
    }
}