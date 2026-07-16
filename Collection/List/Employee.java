package Collection.List;

public class Employee {

    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    Employee(int empId,String empName,String email,String gender,float salary){
        this.empId=empId;
        this.empName=empName;
        this.email=email;
        this.gender=gender;
        this.salary=salary;
    }

    void GetEmployeeDetails(){
        System.out.println(empId+" "+empName+" "+email+" "+gender+" "+salary);
    }
}