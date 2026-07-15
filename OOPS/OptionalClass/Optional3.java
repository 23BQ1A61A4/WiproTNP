package OOPS.OptionalClass;

import java.util.Optional;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class InvalidEmployeeException extends RuntimeException {
    InvalidEmployeeException(String message) {
        super(message);
    }
}

public class Optional3 {
    public static void main(String[] args) {
        Employee employee = null;

        Optional<Employee> value = Optional.ofNullable(employee);

        Employee result = value.orElseThrow(
            () -> new InvalidEmployeeException("Invalid Employee")
        );

        System.out.println(result.name);
    }
}