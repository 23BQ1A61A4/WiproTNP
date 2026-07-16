package Collection.DateTimeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateTime2 {

    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2026, 1, 1);
        LocalDate end = LocalDate.of(2026, 12, 31);

        long days = ChronoUnit.DAYS.between(start, end);

        System.out.println("Days = " + days);

    }

}