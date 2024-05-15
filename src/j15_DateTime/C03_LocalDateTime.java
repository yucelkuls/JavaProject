package j15_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt);
        System.out.println("ldt.getSecond() = " + ldt.getSecond());
        System.out.println("ldt.getDayOfYear() = " + ldt.getDayOfYear());
        System.out.println("ldt.getMonthValue() = " + ldt.getMonthValue());

        LocalDate date = LocalDate.of(1903,2,23);
        LocalTime hour = LocalTime.of(17,55,23);
        LocalDateTime ldt1 = LocalDateTime.of(date, hour);
        System.out.println("ldt1 = " + ldt1);  // 1903-02-23T17:55:23

        LocalDateTime ldt2 = ldt1.minusMonths(15).minusMinutes(100).plusDays(33).plusHours(1).minusSeconds(95);
        System.out.println("ldt2 = " + ldt2); // 1901-12-26T17:13:48


    }
}
