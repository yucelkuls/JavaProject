package j15_DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class C01_DateTime {
    public static void main(String[] args) {
        // LocalDate  -> sadece gun-ay-yıl datatlarını tutar(stored)
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today); // 2024-02-26
        System.out.println("today.getYear() = " + today.getYear());
        System.out.println("today.getMonth() = " + today.getMonth());
        System.out.println("today.getDayOfMonth() = " + today.getDayOfMonth());
        System.out.println("today.getDayOfYear() = " + today.getDayOfYear());
        System.out.println("today.getDayOfWeek() = " + today.getDayOfWeek());
        System.out.println("today.getMonthValue() = " + today.getMonthValue());
        System.out.println("today.isLeapYear() = " + today.isLeapYear());


        LocalDate yesterday = today.minusDays(1);
        LocalDate tomorrow = today.plusDays(1);

        System.out.println("yesterday = " + yesterday);
        System.out.println("tomorrow = " + tomorrow);
        System.out.println("today.format(dd.MMMM.yy) = " + today.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        LocalDate date1 = LocalDate.of(1974, 8,22);
        LocalDate date2 = LocalDate.of(1985, Month.MARCH, 12);
        System.out.println("date1 = " + date1);
        System.out.println(date1.minusYears(34).plusMonths(34).plusDays(34));


    }

}
