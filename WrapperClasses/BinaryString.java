package WrapperClasses;

import java.util.Scanner;

public class BinaryString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = sc.nextInt();

        if (number < 1 || number > 255) {
            System.out.println("Please enter a number between 1 and 255");
            sc.close();
            return;
        }

        String binary = Integer.toBinaryString(number);
        binary = String.format("%8s", binary).replace(' ', '0');

        System.out.println(binary);

        sc.close();
    }

}