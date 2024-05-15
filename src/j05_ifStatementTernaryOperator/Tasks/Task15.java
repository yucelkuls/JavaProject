package j05_ifStatementTernaryOperator.Tasks;

import java.beans.EventHandler;
import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a driving license? (Yes or No)");
        String license = scan.nextLine();
        if (license.equalsIgnoreCase("Yes")) {
            System.out.println("How many years of experience do you have?");
            int years = scan.nextInt();
            int miles = 0;
            if (years >= 7) {
                System.out.println("How many miles have you driven?");
                miles = scan.nextInt();
                if (miles >= 100000) {
                    System.out.println("Give your car's key");
                } else {
                    System.out.println("Sorry, you need to have driven at least 100000 miles!" + "\nYou have to drive " + (100000 - miles) + " more miles.");
                }
            } else {
                System.out.println("Sorry, you need to have at least 7 years of driving experience!" + "\nYou have to drive for " + (7 - years) + " more years.");
            }
        } else if (license.equalsIgnoreCase("No")) {
            System.out.println("You need a driving license!");
        } else System.out.println("Incorrect answer");
    }
}





















