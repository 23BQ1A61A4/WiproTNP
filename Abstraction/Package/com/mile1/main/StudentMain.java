package Abstraction.Package.com.mile1.main;

import Abstraction.Package.com.mile1.bean.Student;
import Abstraction.Package.com.mile1.service.StudentReport;
import Abstraction.Package.com.mile1.service.StudentService;

public class StudentMain {

    public static void main(String[] args) {

        Student s1 = new Student("Sekar", new int[]{85, 75, 95});
        Student s2 = new Student(null, new int[]{11, 22, 33});
        Student s3 = new Student("Manoj", null);
        Student s4 = null;

        Student[] students = {s1, s2, s3, s4};

        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        for (Student s : students) {

            try {

                System.out.println(report.validate(s));

                System.out.println(report.findGrades(s));

            } catch (Exception e) {

                System.out.println(e);

            }

        }

        System.out.println("Null Objects : " + service.findNumberOfNullObjects(students));
        System.out.println("Null Names : " + service.findNumberOfNullName(students));
        System.out.println("Null Marks : " + service.findNumberOfNullMarksArray(students));

    }

}
