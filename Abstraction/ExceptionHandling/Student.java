package Abstraction.ExceptionHandling;

public class Student {

    String name;
    int[] marks = new int[3];

    public Student(String name, int m1, int m2, int m3) {
        this.name = name;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    public double average() {
        return (marks[0] + marks[1] + marks[2]) / 3.0;
    }

}