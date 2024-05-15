package j15_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        // period-> iki tarih arasındaki geçen tekrarlanan datayı tutar..
        LocalDate today = LocalDate.now();
        LocalDate saim = LocalDate.of(1975,02,26);
        Period p1 = Period.between(today, saim);
        System.out.println("p1 = " + p1); // P-49Y
        System.out.println("p1.toTotalMonths() = " + p1.toTotalMonths()); // -588
        System.out.println("p1.getDays() = " + p1.getDays());
        System.out.println("p1.getYears() = " + p1.getYears());

        System.out.println("today = " + today);
        Period period6day = Period.ofDays(6);
        System.out.println("today.plus(p1) = " + today.plus(p1)); // 1975-02-26
        System.out.println("today.minus(period6day) = " + today.minus(period6day)); // 2024-02-20

        // Task-> 18 eylul 2023 başlayan sdet kursu 11 aylık planlanırsa bitiş tarihini
        // gun sayısını print eden code create ediniz.
        Period periodCW = Period.ofMonths(11);
        LocalDate courseStart = LocalDate.of(2024,01, 2);
        System.out.println("Course finish date = " + courseStart.plus(periodCW).format(DateTimeFormatter.ISO_LOCAL_DATE));

        // ISO -> International Organization for Standardization
        // ahan da trick-> period tanımında birden çok tarih zaman girildiğinde daima sonuncu parametre derlenir.
        // önceki parmetler ezilir.

        Period prd=Period.ofMonths(4).ofDays(35);
        System.out.println("today.plus(prd) = " + today.plus(prd));//2024-04-01

    }
}
