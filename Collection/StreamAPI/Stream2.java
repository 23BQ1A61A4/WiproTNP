package Collection.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Ram",25,"Pune"));
        list.add(new Employee(102,"Sita",24,"Hyderabad"));
        list.add(new Employee(103,"Krishna",28,"Pune"));
        list.add(new Employee(104,"Ravi",30,"Chennai"));
        list.add(new Employee(105,"Anu",22,"Pune"));

        List<Employee> result = list.stream()
                .filter(e -> e.location.equals("Pune"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}