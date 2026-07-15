package Abstraction.ExceptionHandling;

public class AgeValidator {

    public static void main(String[] args) {

        try {

            if (args.length != 2) {
                throw new IllegalArgumentException("Please enter Name and Age");
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age should be between 18 and 60");
            }

            System.out.println("Name : " + name);
            System.out.println("Age : " + age);

        } catch (NumberFormatException e) {

            System.out.println("java.lang.NumberFormatException");

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

    }

}