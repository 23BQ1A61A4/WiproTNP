package JavaFundamentals.FlowControlStatements;

public class IfStatement2 {

    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);

        if (num >= 1 && num <= 99) {

            if (num % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");

        } else {
            System.out.println("Please enter a value between 1 and 99");
        }
    }
}
