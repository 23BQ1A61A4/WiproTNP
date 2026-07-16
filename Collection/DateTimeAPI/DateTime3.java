package Collection.DateTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime3 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        DateTimeFormatter f =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(today.format(f));

    }

}