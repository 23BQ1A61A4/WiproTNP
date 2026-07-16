package Collection.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Functional4 {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Ram","Hyderabad",9000));
        list.add(new Employee(102,"Sita","Chennai",12000));
        list.add(new Employee(103,"Krishna","Pune",8000));
        list.add(new Employee(104,"Ravi","Delhi",15000));
        list.add(new Employee(105,"Anu","Bangalore",9500));

        Predicate<Employee> p = e -> e.salary < 10000;

        list.stream()
                .filter(p)
                .forEach(e -> System.out.println(e.name));

    }

}