package j15_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date1 = today.plusDays(33);
        LocalDate date2 = today.minusDays(66);
        LocalDate date3 = LocalDate.of(1975,02,26);
        System.out.println("date3 = " + date3);  // 1975-02-26
        System.out.println("date2 = " + date2);  // 2023-12-22
        System.out.println("date1 = " + date1);  // 2024-03-30
        System.out.println("today = " + today);  // 2024-02-26

        System.out.println("date1.isLeapYear() = " + date1.isLeapYear());   //true
        System.out.println("date1.isAfter(date3) = " + date1.isAfter(date3)); //true
        System.out.println("date3.isBefore(date2) = " + date3.isBefore(date2)); //true

        System.out.println("today.compareTo(date3) = " + today.compareTo(date3)); // 49
        System.out.println("date1.compareTo(date2) = " + date1.compareTo(date2));

        /*     ComperaTo komutu işlevi:
      2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
      2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
      2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */

    }
}
