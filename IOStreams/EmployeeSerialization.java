package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class EmployeeSerialization {

    public static void main(String[] args) throws Exception {

        Employee emp = new Employee(
                "Rahul",
                new Date(),
                "IT",
                "Developer",
                50000);

        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("data"));

        out.writeObject(emp);
        out.close();

        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("data"));

        Employee e = (Employee) in.readObject();

        in.close();

        System.out.println("Name : " + e.getName());
        System.out.println("Date Of Birth : " + e.getDateOfBirth());
        System.out.println("Department : " + e.getDepartment());
        System.out.println("Designation : " + e.getDesignation());
        System.out.println("Salary : " + e.getSalary());

    }

}