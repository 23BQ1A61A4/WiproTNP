package Abstraction.ExceptionHandling;

import java.util.Scanner;

public class StudentMain {

    static void validate(int mark)
            throws NegativeValuesException, ValuesOutOfRangeException {

        if (mark < 0)
            throw new NegativeValuesException("NegativeValuesException");

        if (mark > 100)
            throw new ValuesOutOfRangeException("ValuesOutOfRangeException");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Student[] students = new Student[2];

            for (int i = 0; i < 2; i++) {

                System.out.println("Enter Student Name");
                String name = sc.nextLine();

                System.out.println("Enter Marks in 3 Subjects");

                int m1 = Integer.parseInt(sc.nextLine());
                validate(m1);

                int m2 = Integer.parseInt(sc.nextLine());
                validate(m2);

                int m3 = Integer.parseInt(sc.nextLine());
                validate(m3);

                students[i] = new Student(name, m1, m2, m3);
            }

            for (Student s : students) {
                System.out.println(s.name + " Average = " + s.average());
            }

        } catch (NumberFormatException e) {

            System.out.println("java.lang.NumberFormatException");

        } catch (NegativeValuesException | ValuesOutOfRangeException e) {

            System.out.println(e.getMessage());

        }

        sc.close();

    }

}