package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task14_ders {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gender : ");
        String gender = scan.next();
        if (gender.equalsIgnoreCase("female")) {
            System.out.println("Enter your age : ");
            int age = scan.nextInt();
            if (age >= 60) {
                System.out.println("Enter your workdays : ");
                int workdays = scan.nextInt();
                if (workdays > 6000) {
                    System.out.println("Congratulations! You are eligible to retire!");
                } else {
                    System.out.println("You are not eligible to retire!" + ("You have to work " + (6000 - workdays) + " days before retire"));
                }
            } else {
                System.out.println("You are not eligible to retire!" + (" You have to work " + (60 - age) + " years "));
            }
        } else if (gender.equalsIgnoreCase("male")) {
            System.out.println("Enter your age : ");
            int age = scan.nextInt();
            if (age >= 65) {
                System.out.println("Enter your workdays : ");
                int workdays = scan.nextInt();
                if (workdays > 7000) {
                    System.out.println("Congratulations! You are eligible to retire!");
                } else {
                    System.out.println("You are not eligible to retire!" + (" You have to work " + (7000 - workdays) + " days before retire"));
                }
            } else {
                System.out.println("You are not eligible to retire!" + (" You have to work " + (65 - age) + " years "));
            }
        } else System.out.println("Incorrect entry");
    }
}

