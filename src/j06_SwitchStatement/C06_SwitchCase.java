package j06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        // TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day");
        String day = input.nextLine().toLowerCase();

        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(day + " is the weekday");
                break;
            case "saturday":
            case "sunday":
                System.out.println(day + " is the weekend");
                break;

            default:
                System.out.println("Incorrect entry");
        }

    }
}
