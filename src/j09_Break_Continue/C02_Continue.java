package j09_Break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {
/*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.
*/
        // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a mail address");
        String mail = scanner.nextLine();
        String newMail = "";

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == ' ') {
                continue;
            }
            newMail += mail.charAt(i);
        }
        System.out.println("newMail = " + newMail);
    }
}
