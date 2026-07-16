package Collection.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class List7 {

    public static void main(String[] args){

        Vector<Employee> v=new Vector<>();

        v.add(new Employee(101,"Ram","ram@gmail.com","Male",40000));
        v.add(new Employee(102,"Sita","sita@gmail.com","Female",50000));

        Iterator<Employee> it=v.iterator();

        while(it.hasNext()){
            it.next().GetEmployeeDetails();
        }

        Enumeration<Employee> e=v.elements();

        while(e.hasMoreElements()){
            e.nextElement().GetEmployeeDetails();
        }
    }
}