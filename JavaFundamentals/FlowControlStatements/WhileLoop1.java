package JavaFundamentals.FlowControlStatements;

class WhileLoop1 {
    public static void main(String args[]) {

        if (args.length == 0) {
            System.out.println("Please enter a number");
            return;
        }

        int num = Integer.parseInt(args[0]);
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println(rev);
    }
}
