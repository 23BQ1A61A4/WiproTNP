package WrapperClasses;

public class EmployeeClone {

    public static void main(String[] args) {

        try {

            Employee e1 = new Employee(101, "Rahul", 50000);

            Employee e2 = (Employee) e1.clone();

            e1.id = 201;
            e1.name = "Kiran";
            e1.salary = 70000;

            System.out.println("Original Employee");
            e1.display();

            System.out.println();

            System.out.println("Cloned Employee");
            e2.display();

        } catch (CloneNotSupportedException e) {

            System.out.println(e);

        }

    }

}