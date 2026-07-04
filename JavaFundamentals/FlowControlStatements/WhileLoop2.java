
package JavaFundamentals.FlowControlStatements;
class WhileLoop2 {
    public static void main(String args[]) {

        if (args.length == 0) {
            System.out.println("Please enter a number");
            return;
        }

        int num = Integer.parseInt(args[0]);
        int temp = num;
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if (temp == rev)
            System.out.println(temp + " is a palindrome");
        else
            System.out.println(temp + " is not a palindrome");
    }
}