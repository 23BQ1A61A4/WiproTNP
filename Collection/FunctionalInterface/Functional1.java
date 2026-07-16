package Collection.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Functional1 {

    public static void main(String[] args) {

        ArrayList<Employee> list=new ArrayList<>();

        list.add(new Employee(101,"Ram","Hyderabad",20000));
        list.add(new Employee(102,"Sita","Chennai",18000));
        list.add(new Employee(103,"Krishna","Pune",25000));
        list.add(new Employee(104,"Ravi","Delhi",17000));
        list.add(new Employee(105,"Anu","Bangalore",22000));

        Function<Employee,String> f=e->e.location;

        ArrayList<String> locations=list.stream()
                .map(f)
                .collect(Collectors.toCollection(ArrayList::new));

        locations.forEach(System.out::println);

    }

}