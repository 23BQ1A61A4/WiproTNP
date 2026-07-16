package Collection.StreamAPI;

import java.util.ArrayList;

public class Stream3 {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1,"Ram",65));
        list.add(new Student(2,"Sita",45));
        list.add(new Student(3,"Krishna",82));
        list.add(new Student(4,"Ravi",50));
        list.add(new Student(5,"Anu",38));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students Passed : " + count);
    }
}