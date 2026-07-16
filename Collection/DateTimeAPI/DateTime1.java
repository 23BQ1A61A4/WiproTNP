package Collection.DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class DateTime1 {

    public static void main(String[] args) {

        LocalDate dob = LocalDate.of(2004, 5, 15);
        LocalDate today = LocalDate.now();

        Period p = Period.between(dob, today);

        System.out.println("Age : " + p.getYears() + " Years "
                + p.getMonths() + " Months "
                + p.getDays() + " Days");
    }

}