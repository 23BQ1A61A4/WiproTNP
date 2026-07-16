package Collection.List;

public class List2 {

    public static void main(String[] args) {

        EmployeeDB db=new EmployeeDB();

        Employee e1=new Employee(101,"Ram","ram@gmail.com","Male",45000);
        Employee e2=new Employee(102,"Sita","sita@gmail.com","Female",50000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        e1.GetEmployeeDetails();
        e2.GetEmployeeDetails();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);

        System.out.println(db.showPaySlip(102));
    }
}