package IOStreams.Project.com.employee.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import IOStreams.Project.com.employee.bean.Employee;

public class EmployeeService {

    public void writeEmployee(Employee employee) throws Exception {

        FileOutputStream fos = new FileOutputStream("employee.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(employee);

        oos.close();
        fos.close();
    }

    public Employee readEmployee() throws Exception {

        FileInputStream fis = new FileInputStream("employee.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee employee = (Employee) ois.readObject();

        ois.close();
        fis.close();

        return employee;
    }
}