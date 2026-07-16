package Collection.DateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTime6 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        DayOfWeek day = date.getDayOfWeek();

        System.out.println("Today : " + day);

    }

}