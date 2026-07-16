package IOStreams.Project.com.employee.main;

import java.util.Scanner;

import IOStreams.Project.com.employee.bean.Employee;
import IOStreams.Project.com.employee.service.EmployeeService;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id : ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();

        Employee employee = new Employee(id, name, age, salary);

        EmployeeService service = new EmployeeService();

        try {

            service.writeEmployee(employee);

            Employee emp = service.readEmployee();

            System.out.println();
            System.out.println("Employee Details");
            System.out.println("ID : " + emp.getEmpId());
            System.out.println("Name : " + emp.getEmpName());
            System.out.println("Age : " + emp.getAge());
            System.out.println("Salary : " + emp.getSalary());

        } catch (Exception e) {

            System.out.println(e);

        }

        sc.close();
    }
}