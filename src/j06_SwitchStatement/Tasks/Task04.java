package j06_SwitchStatement.Tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month");
        String month = scanner.next().toLowerCase();

        switch (month) {
            case "january", "march", "may", "july", "august", "october", "december":
                System.out.println("31 days");
                break;
            case "april", "june", "september", "november":
                System.out.println("30 days");
                break;
            case "february":
                System.out.println("Enter the year");
                int year = scanner.nextInt();
                if (year % 400 == 0 || (year % 4 == 0 && year % 100!= 0)) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
                break;


        }



    }
}
