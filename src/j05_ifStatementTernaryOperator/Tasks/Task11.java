package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /* Task->
           girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = input.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) System.out.println("This year is leap year");
        else System.out.println("This year is not leap year");


    }
}