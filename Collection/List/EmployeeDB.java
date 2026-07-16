package Collection.List;

import java.util.ArrayList;

public class EmployeeDB {

    ArrayList<Employee> list=new ArrayList<>();

    boolean addEmployee(Employee e){
        return list.add(e);
    }

    boolean deleteEmployee(int empId){

        for(Employee e:list){

            if(e.empId==empId){
                list.remove(e);
                return true;
            }
        }

        return false;
    }

    String showPaySlip(int empId){

        for(Employee e:list){

            if(e.empId==empId){
                return "Salary : "+e.salary;
            }
        }

        return "Employee Not Found";
    }
}