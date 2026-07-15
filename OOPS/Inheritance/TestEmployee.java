package OOPS.Inheritance;

public class TestEmployee {

    public static void main(String[] args) {

        Employee employee = new Employee(
                "Ravi",
                500000.0,
                2022,
                "NI12345"
        );

        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: "
                + employee.getNationalInsuranceNumber());
    }
}