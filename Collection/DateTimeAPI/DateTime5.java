package Collection.DateTimeAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime5 {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter f =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println(dt.format(f));

    }

}