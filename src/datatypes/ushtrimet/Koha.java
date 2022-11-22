package datatypes.ushtrimet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class Koha {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTime());

        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate);

        LocalDateTime todayDateTime = LocalDateTime.now();
        System.out.println(todayDateTime);
    }
}








